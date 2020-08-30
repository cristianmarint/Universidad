$(document).ready(function(){
   // Inicio de sesion ocultar y mostrar
    $("#ingresar").on('click',function(){
      $("#ingresar-login").show(250);
      $('#user').focus();
      $("#ingresar-registro").hide(250);
    });

    $("#cancelar-login").on('click',function(){
        $("#ingresar-login").hide(250);
    });

    // registro ocultar y mostrar
    $("#ingresararegistro").on('click',function(){
      $("#ingresar-login").hide(250);
      $("#ingresar-registro").show(250);//
      $('#user2').focus();
    });

    $("#cancelar-registro").on('click',function(){
      $("#ingresar-login").show(250);
      $("#ingresar-registro").hide(250);
    });
// **********************************************
});
