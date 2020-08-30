<?php
session_start;
  include 'conexion.php';
if (!$connect) {
    echo "Error: No se pudo conectar a MySQL." . PHP_EOL;
    echo "errno de depuración: " . mysqli_connect_errno() . PHP_EOL;
    echo "error de depuración: " . mysqli_connect_error() . PHP_EOL;
    exit;
}else {

    if(isset($_POST["user"]) && isset($_POST["pass"])){
      $user = mysqli_real_escape_string($connect, $_POST["user"]);
      $pass = mysqli_real_escape_string($connect, $_POST["pass"]);
      $email = mysqli_real_escape_string($connect, $_POST["email"]);

      $sql = "SELECT user,email FROM usuario WHERE (user='$user' OR email='$email')";
      $result = mysqli_query($connect,$sql);
      $num_row = mysqli_num_rows($result);//numero de filas de  la consulta sql
      $col_llenas = mysqli_field_count($result);//cuenta el numero de filas que son iguales
      // $test = mysqli_field_count($result);


    //  F12 -> network -> F5
      print "<h2>Consulta: <br> ".$sql."</h2><br>";
      print "num_row-> ".$num_row ."<br><br>";
      echo '<pre>'; print_r($result); echo '</pre>';
      // **************

    // si la consulta devuelve $num_row!=0 significa que en
        if($num_row == '0' ){//si es igual a vacio hace el insert
          $sql = "insert into usuario (user,pass,email) values('$user','$pass','$email')";
          mysqli_query($connect,$sql);
            session_start();//se inicia session para poder asignar el usuario
            $_SESSION["user"]=$user;//una vez que el registro es valido se asigna por medio de session el usuario a la variable user
          echo "<p style='color:green;'>registro exitoso :D</p>";
        }else{
          echo "<p style='color:red;'> Usuario duplicado</p>";
        }
    }else{
        echo "<p style='color:blue;'> error variables vacias</p>";

    }
}

?>
	