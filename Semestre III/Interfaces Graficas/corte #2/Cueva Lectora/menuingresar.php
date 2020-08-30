<?php
	echo '
	<!-- inicio -->
<div class="card col-4" id="ingresar-login" style="display:none;">
			<div class="card-block">
				<br />
				<form method="post" action="usuario.php">
										<input maxlength="29" type="text" class="form-control btn-md" id="user" name="user" placeholder="Usuario" required >
										<input maxlength="29" type="password" class="form-control" id="pass" name="pass"  placeholder="Contraseña" required/>
										<br /><br />
										<button type="submit"  class="btn btn-primary pull-right valinicio" id="iniciarSesion" val="iniciarSesion" name="iniciarSesion" >Iniciar Sesion</button>
				</form>

			<div class="btn-group">
				<button  class="btn btn-danger pull-right valinicio " id="cancelar-login">Cancelar</button>
				<button  class="btn btn-warning pull-right valinicio " id="ingresararegistro">&#191;Sin cuenta? Registrate</button>
			</div>

				<div class="alert alert-success pull-right valinicio" id="validandoDatos" style="display:none;">
					<p>Validando...</p>
				</div>
				<div class="alert alert-danger pull-right valinicio" id="resultadoInicio" style="display:none;">
					<p>Usuario o Contraseña incorrectos</p>
				</div>


			</div>
</div>

		<!-- registro -->
				<div class="card col-4" id="ingresar-registro" style="display:none;">
					<div class="card-block">
							<br />
							<form method="post" id="formregistro" action="usuario.php" > <!--  Re direcciona una vez el registro este lleno a otra pagina -->
								<input type="text" required class="form-control valinicio" id="user2"   placeholder="Usuario" >
								<input type="email" required class="form-control valinicio" id="email2"  placeholder="Email" >
								<input type="password" required  class="form-control valinicio" id="pass2"  placeholder="Contraseña" required>
								<br />
								<button type="submit"  class="btn btn-primary pull-right valinicio" id="registrame" name="registrame" val="registrame" >Registrame</button>
							</form>

							<div class="btn-group">
								<button  class="btn btn-danger pull-right valinicio" id="cancelar-registro">Cancelar</button>
							</div>
							<div class="alert alert-danger pull-right valinicio" id="resultadoRegistro" style="display:none;">
								<p>Registro Fallido</p>
							</div>
							<div id="relleno" style="display:none;">
							</div>
					</div>
				</div>
	';


?>
