<?php
session_start;
include 'conexion.php';


if (!$connect) {

    echo "Error: No se pudo conectar a MySQL." . PHP_EOL;
    echo "errno de depuración: " . mysqli_connect_errno() . PHP_EOL;
    exit;
}else {

      if(isset($_POST["user"]) && isset($_POST["pass"])) {//si las variables estan vacias y se intenta ingresar a usuario esto los sacara

            //el mysqli_real_escape_string evita las inyecciones SQL es decir codigo intruso para vulneravilidades
            $user = mysqli_real_escape_string($connect, $_POST["user"]);//almacena el usuario
            $pass = mysqli_real_escape_string($connect, $_POST["pass"]);//almacena la contrasena
            
            

            $sql = "SELECT user FROM usuario WHERE (user='$user' OR email='$user') AND pass='$pass'"; //almacena la consulta (no el resultado) a la base de datos si los encuentra
            $result = mysqli_query($connect, $sql); //hace la consulta y almacena el resultado
            $num_row = mysqli_num_rows($result);//sacamos el numero de filas de result

            if ($num_row == "1") {
                  session_start();//se inicia session para poder asignar el usuario
                  //si se encuentra el usuario = 1
                  $data = mysqli_fetch_array($result);//se guarda la informacion de la consulta como arreglo
                  $_SESSION["user"] = $data["user"];//se le asigna a la session
                  // echo "Se encontro "+$_SESSION["user"]+"el usuario login";

            } else {

                  echo "error: Usuario o Contrasena no encontrados";

            }

      } else {

            echo "error: variables vacias";

      }

}


?>
