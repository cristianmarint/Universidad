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

	<title>Cueva Lectora</title>
  <link rel="stylesheet" href="css/general.css" />
	<link rel="stylesheet" href="css/bootstrap-material-design.min.css">

</head>
<body style="background:#222222;">

<!-- Menu superior  -->
<div class="col-12 navbar-light bg-faded">

		<div class="col-4">
			<p class="logoTexto">Cueva Lectora</p>
		</div>
		<div  class="col-2">
			<img src="imagenes/logo/logo.png" class="logo"/>
		</div>

				<div class="col-6">
				<ul class="nav navbar-nav">
						<li class="nav-item active">
							<a class="nav-link enlaces-menu-superior col-3" href="#">Inicio <span class="sr-only">(current)</span></a>
						</li>

							<li class="nav-item">
								<a class="nav-link enlaces-menu-superior col-3"  id="ingresar" href="#">Ingresar</a>
							</li>

							<li class="nav-item">
								<a class="nav-link enlaces-menu-superior col-3" href="usuario.php" id="PerfilInicio" >Perfil</a>
							</li>

							<li class="nav-item">
								<a class="nav-link enlaces-menu-superior col-3" href="conocenos.php">Conocenos</a>
							</li>
				</ul>
		</div>
</div>

<!-- -******espaciado entre el logo y menus para el menu desplegable del login y registro****** -->
<div class="col-12" ></div>
<div class="col-4"></div>
<?php include 'menuingresar.php';?><!-- llamado al menu para el login o registro -->




<!-- libros -->
<div class="col-12">
			<div class="col-12" name="filaUnoDeLibros">
									<div class="col-4 libroHover">
												<div class="card">
													<img class="card-img-top portada-tarjeta " src="imagenes/index/libros/1.png" alt="Card image cap">
													<div class="card-block">
														<p class="card-title h4 "><strong>NEW YORK 1</strong></p>
														<p class="card-text">traveling around</p>
													</div>
													<ul class="list-group list-group-flush">
														<li class="list-group-item">AUTOR:  Danchosich</li>
														<li class="list-group-item">A&NtildeO DE PUBLICACI&OacuteN: 2018</li>
														<li class="list-group-item">PRECIO PUBLICO GENERAL: $400.000 </li>
													</ul>
													<div class="card-block">
														<!--  target="_blank" abre enlace en otra ventana -->
														<a href="https://savee.it/i/qu9Op8e/" class="card-link"  target="_blank" ><strong>M&Aacute;S</strong></a>
													</div>
												</div>
									</div>

									<div class="col-4 libroHover">
										<div class="card">
											<img class="card-img-top portada-tarjeta " src="imagenes/index/libros/2.png" alt="Card image cap">
											<div class="card-block">
												<p class="card-title h4 "><strong>NEW YORK 2</strong></p>
												<p class="card-text">traveling around</p>
											</div>
											<ul class="list-group list-group-flush">
												<li class="list-group-item">AUTOR:  Danchosich</li>
												<li class="list-group-item">A&NtildeO DE PUBLICACI&OacuteN: 2018</li>
												<li class="list-group-item">PRECIO PUBLICO GENERAL: $400.000</li>
											</ul>
											<div class="card-block">
												<!--  target="_blank" abre enlace en otra ventana -->
												<a href="https://savee.it/i/qu9Op8e/" class="card-link"  target="_blank" ><strong>M&Aacute;S</strong></a>
											</div>
										</div>
									</div>

									<div class="col-4 libroHover">
										<div class="card">
											<img class="card-img-top portada-tarjeta " src="imagenes\index\libros\3.jpg" alt="Card image cap">
											<div class="card-block">
												<p class="card-title h4 "><strong>Dundas Communications 3</strong></p>
												<p class="card-text">DESCRIPCION DE EL LIBRO TRES</p>
											</div>
											<ul class="list-group list-group-flush">
												<li class="list-group-item">AUTOR: Dundas </li>
												<li class="list-group-item">A&NtildeO DE PUBLICACI&OacuteN: 2017</li>
												<li class="list-group-item">PRECIO PUBLICO GENERAL: $300.000</li>
											</ul>
											<div class="card-block">
												<a href="https://savee.it/i/XSPcaO6/" class="card-link"  target="_blank" ><strong>M&Aacute;S</strong></a>
											</div>
										</div>
									</div>
		</div>

		<div class="col-12" name="filaDosDeLibros">
			<div class="col-4 libroHover">
				<div class="card">
					<img class="card-img-top portada-tarjeta " src="imagenes/index/libros/4.jpg" alt="Card image cap">
					<div class="card-block">
						<p class="card-title h4 "><strong>MAN 4</strong></p>
						<p class="card-text">DESCRIPCION DE HOMBRE MODERNO</p>
					</div>
					<ul class="list-group list-group-flush">
						<li class="list-group-item">AUTOR: X</li>
						<li class="list-group-item">A&NtildeO DE PUBLICACI&OacuteN: 2015</li>
						<li class="list-group-item">PRECIO PUBLICO GENERAL: $350.000</li>
					</ul>
					<div class="card-block">
						<a href="https://savee.it/i/K8q5y8h/" class="card-link"  target="_blank" ><strong>M&Aacute;S</strong></a>
					</div>
				</div>
			</div>

			<div class="col-4 libroHover">
				<div class="card">
					<img class="card-img-top portada-tarjeta " src="imagenes/index/libros/5.jpg" alt="Card image cap">
					<div class="card-block">
						<p class="card-title h4 "><strong>A Thermodynamic Imaginary 5 </strong></p>
						<p class="card-text">Revista</p>
					</div>
					<ul class="list-group list-group-flush">
						<li class="list-group-item">AUTOR: Tomas Saraceno</li>
						<li class="list-group-item">A&NtildeO DE PUBLICACI&OacuteN: 2018</li>
							<li class="list-group-item">PRECIO PUBLICO GENERAL: $150.000</li>
						</ul>
						<div class="card-block">
							<a href="https://www.behance.net/gallery/63717653/MAAT--A-Thermodynamic-Imaginary" class="card-link"  target="_blank" ><strong>M&Aacute;S</strong></a>
						</div>
					</div>
				</div>

				<div class="col-4 libroHover">
					<div class="card">
						<img class="card-img-top portada-tarjeta " src="imagenes/index/libros/6.jpg" alt="Card image cap">
						<div class="card-block">
							<p class="card-title h4 "><strong>COCINA 6</strong></p>
							<p class="card-text">La guia definitiva en la cocina</p>
						</div>
						<ul class="list-group list-group-flush">
							<li class="list-group-item">AUTOR: Someone</li>
							<li class="list-group-item">A&NtildeO DE PUBLICACI&OacuteN: 2015</li>
							<li class="list-group-item">PRECIO PUBLICO GENERAL: $100.000</li>
						</ul>
						<div class="card-block">
							<a href="https://savee.it/i/Csj5reP/" class="card-link"  target="_blank" ><strong>M&Aacute;S</strong></a>
						</div>
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
