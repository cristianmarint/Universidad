<?php
	if(isset($_SESSION["user"]) && ($_SESSION["user"]=="socio" || $_SESSION["user"]=="marin"|| $_SESSION["user"]=="steven" || $_SESSION["user"]=="edwin" || $_SESSION["user"]=="bibliotecario")){
			echo '
			<div class="col-12 " style="background:#7ba59f;height:50px;">
			</div>

<div class="col-12" style="background: white !important;">
<h4 align="center"><strong>BALANCE</strong></h4>
        <table class="table">
          <thead class="thead-dark">
            <tr>
              <th scope="col">ID</th><!-- El scope sirve para identificar si una celda es la cabecera de la columa o fila -->
              <th scope="col">Libro</th>
              <th scope="col">Autor</th>
              <th scope="col">Estado</th>
              <th scope="col">Multa</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">1</th>
              <td>L1</td>
              <td>AUTOR1</td>
              <td>Pendiente</td>
              <td>no-pagada</td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td>L2</td>
              <td>AUTOR2</td>
              <td>Solucitado</td>
              <td>-</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td>L3</td>
              <td>AUTOR3</td>
              <td>Entregado</td>
              <td>Pagada</td>
            </tr>
          </tbody>
        </table>


</div>

<div class="col-12" style="background:#f2f2f2;height:200px;">
	<h4 align="center"><strong>PRESTAR LIBRO</strong></h4>

	<form method="post">
	<input type="text"  style="color:white !important;" class="form-control" placeholder="Ingrese el libro que desea prestar" aria-label="Username"/>
	<button type="button"  class="btn btn-primary col-12" val="prestamo" name="prestamo" >Pedir Libro</button>
	</form>
</div>

<div class="col-12" style="background:white;height:250px;">
	<h4 align="center"><strong>NUMERO MAXIMO DE LIBROS SOLICITADOS</strong></h4>

	<p class="lead display-1 btn-info" align="center">
	  15
	</p>

</div>
			';
	};
?>
