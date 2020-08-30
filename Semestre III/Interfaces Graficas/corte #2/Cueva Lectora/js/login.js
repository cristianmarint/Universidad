$(document).ready(function() {

  $('#iniciarSesion').click(function(){//click en iniciarSesion sesion se ejecuta la funcion
    //variables que guardan los datos del login
    var user = $('#user').val();
    var pass = $('#pass').val();
    // console.log("usuario"+user+" Contrasena: "+pass);

    if($.trim(user).length > 0 && $.trim(pass).length > 0){//evalua el largo de los datos del login

            $.ajax({
              url:"validacionInicio.php",
              method:"POST",
              data:{user:user, pass:pass},//despues de cargar validacionInicio.php envia los datos
              cache:"false",//desactiva cache

              //una vez enviada la informacion se ejecuta la funcion
              beforeSend:function() {
                $('#resultadoInicio').hide();
                // poner pause 
                $('#validandoDatos').show(250);//muestra el texto de validandoDatos
              },
              success:function(data) {
                $('#validandoDatos').hide(250); //oculda el texto de validandoDatos
                if (data=="1") {//si data es 1 se inicio sesion bien y se manda al usuario.php
                  $(location).attr('href','usuario.php');
                } else {
                  $('#resultadoInicio').show(500);//
                }
              }
            });

    }else{
      $('#resultadoInicio').show(250);
    };

  });
});
