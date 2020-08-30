<?php

// para la pagina web
 // $sv = "sql108.mipropia.com";// servidor
 // $usuario="mipc_21939046";
 // $pass="marinpdc";
 // $bd="mipc_21939046_usuarios";
 // $connect = mysqli_connect("$sv","$usuario","$pass","$bd"); //variable para conexion  a la base de datos Direccion - usuario -contrasena- nombre

// para trabajar en local (tener la base de datos montada primero)
$sv = "localhost";// servidor
$connect = mysqli_connect("$sv","root","","usuarios"); //variable para conexion  a la base de datos Direccion - usuario -contrasena- nombre

return $connect ;

 ?>
