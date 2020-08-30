<?php

		session_start();
		if(!isset($_SESSION["user"])){//si no hay usuario en la sesion se re-direcciona al index
			header("location:index.php");
		};
?>

<!DOCTYPE html>
<html>

<head>
	<link rel="shortcut icon" type="image/png" href="imagenes/logo/logo.ico"/>
	<!-- para no guardar cache  -->
		<meta http-equiv="Expires" content="0">
		<meta http-equiv="Last-Modified" content="0">
		<meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
		<meta http-equiv="Pragma" content="no-cache">
	<!-- -******************* -->
	<!-- Adaptabilidad y caracteres -->
	<!-- <meta charset="utf-8"> -->
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta http-equiv="x-ua-compatible" content="ie=edge">
	<!-- -******************* -->

	<?php echo'<title>Cueva Lectora - '.$_SESSION["user"].'</title>'; ?>
  <link rel="stylesheet" href="css/general.css" />
  <link rel="stylesheet" href="css/usuario.css" />
	<!-- <link rel="stylesheet" href="css/bootstrap.min.css"> -->
	<link rel="stylesheet" href="css/bootstrap-material-design.min.css">

</head>
<body style="background:#222222;">

<!-- Menu superior  -->
<div class="col-12 navbar-light bg-faded">

	<div  class="col-9">
		<img src="imagenes/logo/logo.png" class="logo"/>
	</div>


		<div class="col-3">
			<ul class="nav navbar-nav ">
				<li class="nav-item ">
					<a class="nav-link enlaces-menu-superior" href="index.php">Inicio <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item">
					<?php echo '					<a class="nav-link active enlaces-menu-superior" href="#">'.$_SESSION["user"].'</a>'; ?>
				</li>
			</ul>
		</div>

</div>
<!-- -******************* -->

<br /><br /><br /><br />

<div class="col-4"></div>

<!-- llamado a la targeta de usuario con nombre y foto de perfil personalizada -->
<?php include 'php/fotousuario.php';?>

<!-- llamado al php del administrador/bibliotecario -->
<?php include 'php/admin.php';?>
<!-- llamado al php del socio -->
<?php include 'php/socio.php';?>
<!-- llamado al php del usuario -->
<?php include 'php/usuariobi.php';?>

		<!-- jQuery ,js  -->
    <script type="text/javascript" src="js/jquery.min.js"></script>


</body>
</html>
