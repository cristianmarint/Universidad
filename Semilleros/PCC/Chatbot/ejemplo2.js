var restify = require('restify');
var builder = require('botbuilder');

// Levantar restify
var server = restify.createServer();
server.listen(process.env.port || process.env.PORT || 4040, function () {
   console.log('%s listening to %s', server.name, server.url);
});

// No te preocupes por estas credenciales por ahora, luego las usaremos para conectar los canales.
var connector = new builder.ChatConnector({
   appId: '',
   appPassword: ''
});
//https://stackoverflow.com/questions/391979/how-to-get-clients-ip-address-using-javascript-only
// Ahora utilizamos un UniversalBot
var bot = new builder.UniversalBot(connector);
server.post('/api/messages', connector.listen());

// Dialogos
bot.dialog('/', [
   function (session, results, next) {
       builder.Prompts.text(session, '¿Cómo te llamas?');
   },
   /*
   function (session, results) {
       session.dialogData.nombre = results.response;
       builder.Prompts.number(session, `Ok, ${session.dialogData.nombre}. ¿Cuál es tu edad?`);
   },
   function (session, results) {
       session.dialogData.edad = results.response;
       builder.Prompts.time(session, `¿Qué hora es?`);
   },
   function (session, results) {
       session.dialogData.hora = builder.EntityRecognizer.resolveTime([results.response]);
       builder.Prompts.choice(session, 'Oye, te hago una pregunta ¿Para pasear que prefieres?', 'Mar|Montaña|Centros Comerciales|Jugar DOOM en Xbox', { listStyle: builder.ListStyle.button });
   },
   */
   function (session, results) {
       session.dialogData.preferencia = results.response.entity;
       builder.Prompts.confirm(session, '¿Quieres ver lo que me haz dicho?', { listStyle: builder.ListStyle.button });
   },
   function (session, results) {
       if (results.response) {
           session.send(`Me contaste que tu nombre es **${session.dialogData.nombre}**, tienes **${session.dialogData.edad}** años, son las **${session.dialogData.hora}** y prefieres **${session.dialogData.preferencia}**`);   
           session.beginDialog('/segundo');
       }
       else {
           session.endDialog('Que sad bro ☻');
       }
   }
]);

bot.dialog('/segundo', [

   function (session, results) {
       builder.Prompts.text(session, 'Sé de donde eres... ¿Quieres intentarlo?');
   },
   function(session,results)
   {
       session.dialogData.preferencia = results.response.entity;
       builder.Prompts.confirm(session, 'Pruebame :) ', { listStyle: builder.ListStyle.button });
   },
   function(session,results)
   {
       if (results.response)
       {            
           $.getJSON('//freegeoip.net/json/?callback=?', function(data) {
               //console.log(JSON.stringify(data, null, 2));
               console.log(JSON.stringify(data,data,country_name,2));
             });
             //session.send('eres de:  **${JSON.stringify(data,data,country_name,2)}**');
                   
       }else{
           session.send('error 1');
       }
   }

]);





