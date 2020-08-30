<?php
	if(isset($_SESSION["user"]) ){
			echo '
			<div class="col-12 " style="background:#ff6146;height:50px;">
			</div>

<div class="col-12" style="background: #F2F2F2 !important;height:200px;">
        <div class="col-12">
				<h4 align="center"><strong>CONSULTAR LIBRO</strong></h4>
              <form method="post">
                  <input type="text" class="form-control" placeholder="Ingrese el libro que desea consultar" aria-label="Username"/>
                  <button type="button" align="center" class="btn btn-primary col-12" id="consultarLibro" val="consultarLibro" name="consultarLibro" >Consultar Libro</button>
              </form>
        </div>
</div>
			';
	};
?>
