$(document).ready(function() {

  $('#registrame').click(function(){
    var user = $('#user2').val();
    var pass = $('#pass2').val();
    var email = $('#email2').val();


    if($.trim(user).length > 0 && $.trim(pass).length > 0){
      $.ajax({
        // lo envia por el metodo post del formulario a la pagina re registro
        url:"registrousuario.php",
        method:"POST",
        data:{user:user, pass:pass,email:email},
        cache:"false",

        beforeSend:function() {
        },
        success:function(data) {
          if (data>"0") {
            $('#resultadoRegistro').show(250);
            $('#relleno').show(3000);
          };
        }
      });
    };

  });

});
