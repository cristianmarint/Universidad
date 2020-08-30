<!-- $_SESSION ES UN ARREGLO DE LA SESION, SIRVE COMO UNA VARIABLE GLOBAL PARA PSAR INFORMACION ENTRE SCRIPTS-->
<!-- session_start(); CREA LAS SESIONES PARA PODER USAR Y PASAR LA INFORMACION -->

<?php
	if(isset($_SESSION["user"]) && ($_SESSION["user"]=="steven" || $_SESSION["user"]=="marin" || $_SESSION["user"]=="bibliotecario" || $_SESSION["user"]=="edwin" )){
		
		
		echo '
				
		<div class="col-12 " style="background:#fff31e;height:50px;">
		</div>
		<div class="col-12" style="background:white;height:200px;">
		<h4 align="center"><strong>GESTIONAR LIBROS</strong></h4>
		
		<form method="post">
		<input type="text"  class="form-control" placeholder="Ingrese el libro a gestionar (ID)" />
		<button type="button" class="btn btn-primary col-12"  val="" name="" align="center"  >Enviar ID</button>
		</form>
		</div>
		
		
		<div class="col-12" style="background: white !important;">
		<h4 align="center"><strong>LIBROS</strong></h4>
			        <table class="table">
			          <thead class="thead-dark">
			            <tr>
			              <th scope="col">ID</th><!-- El scope sirve para identificar si una celda es la cabecera de la columa o fila -->
			              <th scope="col">Libro</th>
			              <th scope="col">Autor</th>
			              <th scope="col">Estado</th>
			            </tr>
			          </thead>
			          <tbody>
			            <tr>
			              <th scope="row">1</th>
			              <td>L1</td>
			              <td>AUTOR1</td>
			              <td>Pendiente</td>
			            </tr>
			            <tr>
			              <th scope="row">2</th>
			              <td>L2</td>
			              <td>AUTOR2</td>
			              <td>Solucitado</td>
			            </tr>
			            <tr>
			              <th scope="row">3</th>
			              <td>L3</td>
			              <td>AUTOR3</td>
			              <td>Entregado</td>
			            </tr>
			          </tbody>
			        </table>
			</div>

			<div class="col-12" style="background:#f2f2f2;height:200px;">
				<h4 align="center"><strong>COMPROBAR USUARIO</strong></h4>

				<form method="post">
					<input type="text" class="form-control " placeholder="Ingrese el usuario que desea comprobar" "/>
					<button type="button" align="center" class="btn btn-primary col-12" " val="comprobarUsuario" name="comprobarUsuario" >Comprobar</button>
				</form>
			</div>
			';

			include 'consultausuarios.php';

			echo '
			<div class="col-12 " style="background:#fff31e;height:50px;"></div>
			<div class="col-12" style="background:WHITE;height:315px;">
				<h4 align="center"><strong>AGREGAR SOCIO</strong></h4>
					<form method="post">
							<input type="text" class="form-control col-3" placeholder="USUARIO" require />
							<input type="text"   class="form-control col-3" placeholder="CONTRASEÑA" require />
							<input type="text"   class="form-control col-3" placeholder="EMAIL" />
							<button type="button" align="center"  class="btn btn-primary col-12"  val="" name="" >Enviar ID</button>
					</form>
			</div>

			<div class="col-12" style="background:#f2f2f2;height:355px;">
				<h4 align="center"><strong>MODIFICAR SOCIO</strong></h4>
					<form method="post">
							<input type="text" class="form-control col-3" placeholder="ID" require />
							<input type="text" class="form-control col-3" placeholder="USUARIO" require />
							<input type="text"   class="form-control col-3" placeholder="CONTRASEÑA" require />
							<input type="text"   class="form-control col-3" placeholder="EMAIL" />
							<button type="button" align="center"  class="btn btn-primary col-12"  val="" name="" >MODIFICAR</button>
					</form>
			</div>

			<div class="col-12" style="background:WHITE;height:200px;">
				<h4 align="center"><strong>ELIMINAR SOCIO</strong></h4>
					<form method="post">
							<input type="text" class="form-control col-3" placeholder="USUARIO (ID)" require />
							<button type="button" align="center"  class="btn btn-primary col-12"  val="" name="" >ELIMINAR</button>
					</form>
			</div>

			<div class="col-12" style="background:#F2F2F2;height:225px;">
				<h4 align="center"><strong>AGREGAR PRESTAMO</strong></h4>
					<form method="post">
							<input type="text" class="form-control col-3" placeholder="USUARIO (ID)" require />
							<input type="text" class="form-control col-3" placeholder="LIBRO (ID)" require />
							<button type="button" align="center"  class="btn btn-primary col-12"  val="" name="" >REGISTRAR</button>
					</form>
			</div>

			<div class="col-12" style="background:WHITE;height:280px;">
				<h4 align="center"><strong>MODIFICAR PRESTAMO</strong></h4>
					<form method="post">
							<input type="text" class="form-control col-3" placeholder="USUARIO (ID)" require />
							<input type="text" class="form-control col-3" placeholder="LIBRO (ID)" require />
							<input type="text" class="form-control col-3" placeholder="ESTADO" require />
							<button type="button" align="center"  class="btn btn-primary col-12"  val="" name="" >MODIFICAR</button>
					</form>
			</div>

			<div class="col-12" style="background:#F2F2F2;height:225px;">
				<h4 align="center"><strong>ELIMINAR PRESTAMO</strong></h4>
					<form method="post">
							<input type="text" class="form-control col-3" placeholder="USUARIO (ID)" require />
							<input type="text" class="form-control col-3" placeholder="LIBRO (ID)" require />
							<button type="button" align="center"  class="btn btn-primary col-12"  val="" name="" >ELIMINAR</button>
					</form>
			</div>
			';
	};
?>
