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

	<title>Cueva Lectora - Conocenos</title>
  <link rel="stylesheet" href="css/general.css" />
	<link rel="stylesheet" href="css/bootstrap-material-design.min.css">

</head>
<body style="background:#222222;">

<!-- Menu superior  -->
<div class="col-12 navbar-light bg-faded">

		<div class="col-4">
			<p class="logoTexto">Creadores</p>
		</div>
		<div  class="col-2">
			<img src="imagenes/logo/logo.png" class="logo"/>
		</div>

				<div class="col-6">
				<ul class="nav navbar-nav">
						<li class="nav-item">
							<a class="nav-link enlaces-menu-superior col-3" href="index.php">Inicio <span class="sr-only">(current)</span></a>
						</li>

							<li class="nav-item">
								<a class="nav-link enlaces-menu-superior col-3"  id="ingresar" href="#">Ingresar</a>
							</li>

							<li class="nav-item">
								<a class="nav-link enlaces-menu-superior col-3" href="usuario.php" id="PerfilInicio" >Perfil</a>
							</li>

							<li class="nav-item">
								<a class="nav-link enlaces-menu-superior col-3 active" href="#">Conocenos</a>
							</li>
				</ul>
		</div>
</div>

<!-- -******espaciado entre el logo y menus para el menu desplegable del login y registro****** -->
<div class="col-12" ></div>
<div class="col-4"></div>

<?php include 'menuingresar.php';?><!-- llamado al menu para el login o registro -->


<div id="nosotros" class="col-12">
	
	<div id="acercaCL" class="col-6">
						<div class="card">
									<img class="card-img-top portada-tarjeta" src="imagenes\conocenos\cono.gif" alt="Card image cap">
									<div class="card-block">
										<p class="card-title h4 "><strong>Cueva Lectora</strong></p>
									</div>
									<div class="card-block">
										<p class="card-text" style="font-style: normal;">Cueva lectora es una iniciava que busca incentivar la lectura en niños y adulto, gracias a el facil acceso que se tiene en la actualidad a las TIC</p>
									</div>
						</div>
	</div>

	<div id="marin" class="col-2">
						<div class="card">
							<img class="card-img-top portada-tarjeta" src="imagenes\conocenos\marin.jpg" alt="Card image cap">
							<div class="card-block">
								<p class="card-title h4 "><strong>Cristian Mar&iacute;n</strong></p>
								<p class="card-text" style="font-style: italic;">Parte activa en:</p>
							</div>
							<ul class="list-group list-group-flush">
								<li class="list-group-item">Diseño</li>
								<li class="list-group-item">Estructura HTML</li>
								<li class="list-group-item">PHP y Base de datos </li>
							</ul>
							<div class="card-block">
								<a href="https://twitter.com/cristianmarint" class="card-link"  target="_blank" ><strong>Twitter</strong></a>
							</div>
						</div>
	</div>
	<div id="steven" class="col-2">
					<div class="card">
						<img class="card-img-top portada-tarjeta" src="imagenes\conocenos\steven.jpeg" alt="Card image cap">
						<div class="card-block">
							<p class="card-title h4 "><strong>Steven Gonzalez</strong></p>
							<p class="card-text" style="font-style: italic;">Parte activa en:</p>
						</div>
						<ul class="list-group list-group-flush">
							<li class="list-group-item">Diseño</li>
							<li class="list-group-item">Estructura HTML</li>
							<li class="list-group-item">Wireframes</li>
						</ul>
						<div class="card-block">
							<a href="https://www.facebook.com/cristiansteven.gonzalezarango/" class="card-link"  target="_blank" ><strong>Facebook</strong></a>
						</div>
					</div>
	</div>

	<div id="edwardo" class="col-2">
					<div class="card">
						<img class="card-img-top portada-tarjeta" src="imagenes\conocenos\edwin.jpeg" alt="Card image cap">
						<div class="card-block">
							<p class="card-title h4 "><strong>Edwin Lopez</strong></p>
							<p class="card-text" style="font-style: italic;">Parte activa en:</p>
						</div>
						<ul class="list-group list-group-flush">
							<li class="list-group-item">Diseño</li>
							<li class="list-group-item">Estructura HTML</li>
							<li class="list-group-item">Javascript</li>
						</ul>
						<div class="card-block">
							<a href="https://www.facebook.com/edwin.lopez.357622" class="card-link"  target="_blank" ><strong>Facebook</strong></a>
						</div>
					</div>
	</div>

</div>


		<!-- jQuery ,js  -->
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/estoesjs.js"></script>
		<script type="text/javascript" src="js/login.js"></script>
		<script type="text/javascript" src="js/registrousuarios.js"></script>


</body>
</html>
