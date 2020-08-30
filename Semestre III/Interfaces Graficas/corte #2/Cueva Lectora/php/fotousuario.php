<?php
  if(isset($_SESSION["user"]) ){
      if(($_SESSION["user"]=="usuario")){
        echo '<div class="col-4">';
        echo '<div class="col-12 ">';
        echo '<div class="card">';
        echo '<img class="card-img-top cuadrado" src="imagenes\usuarios\usuario.jpg" alt="Card image cap">';
        echo '<div class="card-block">';
        echo '<h4 class="card-block" align=center>Bienvenido <strong>'.$_SESSION["user"].'</strong></h4>';
        echo '<p class="card-text"><strong>'.$_SESSION["user"].'</strong> en esta pagina el podr&aacutes tener acceso a consultas</p>';
        echo '<div class="col-12">';
        echo '<a href="index.php" class="btn btn-primary col-4">Inicio</a>';
        echo '<a href="logout.php" class="btn btn-primary col-8" >Cerrar Session</a>';
        echo '</div>';
        echo '</div>';
        echo '</div>';
        echo '</div>';
        echo '</div>';

      }else  if(($_SESSION["user"]=="bibliotecario")){
              echo '<div class="col-4">';
              echo '<div class="col-12 ">';
              echo '<div class="card">';
              echo '<img class="card-img-top cuadrado" src="imagenes\usuarios\bibliotecario.jpg" alt="Card image cap">';
              echo '<div class="card-block">';
              echo '<h4 class="card-block" align=center>Bienvenido <strong class="btn btn-raised btn-warning" >'.$_SESSION["user"].'</strong></h4>';
              echo '<p class="card-text"><strong>'.$_SESSION["user"].'</strong> en esta pagina el podr&aacutes tener acceso a todas las funciones</p>';
              echo '<div class="col-12">';
              echo '<a href="index.php" class="btn btn-primary col-4">Inicio</a>';
              echo '<a href="logout.php" class="btn btn-primary col-8" >Cerrar Session</a>';
              echo '</div>';
              echo '</div>';
              echo '</div>';
              echo '</div>';
              echo '</div>';
            }else   if(($_SESSION["user"]=="socio")){
                    echo '<div class="col-4">';
                    echo '<div class="col-12 ">';
                    echo '<div class="card">';
                    echo '<img class="card-img-top cuadrado" src="imagenes\usuarios\socio.jpg" alt="Card image cap">';
                    echo '<div class="card-block">';
                    echo '<h4 class="card-block" align=center>Bienvenido <strong>'.$_SESSION["user"].'</strong></h4>';
                    echo '<p class="card-text"><strong>'.$_SESSION["user"].'</strong> en esta pagina el podr&aacutes tener acceso a: Balance,Prestamos y consulta de libros</p>';
                    echo '<div class="col-12">';
                    echo '<a href="index.php" class="btn btn-primary col-4">Inicio</a>';
                    echo '<a href="logout.php" class="btn btn-primary col-8" >Cerrar Session</a>';
                    echo '</div>';
                    echo '</div>';
                    echo '</div>';
                    echo '</div>';
                    echo '</div>';
                    }else if(($_SESSION["user"]=="marin")){
                      echo '<div class="col-4">';
                      echo '<div class="col-12 ">';
                      echo '<div class="card">';
                      echo '<img class="card-img-top cuadrado" src="imagenes\usuarios\marin.jpg" alt="Card image cap">';
                      echo '<div class="card-block">';
                      echo '<h4 class="card-block" align=center>Bienvenido <strong class="btn btn-raised btn-info">'.$_SESSION["user"].'</strong></h4>';
                      echo '<p class="card-text"><strong>'.$_SESSION["user"].'</strong> tiene acceso a todo papuh :D</p>';
                      echo '<div class="col-12">';
                      echo '<a href="index.php" class="btn btn-primary col-4">Inicio</a>';
                      echo '<a href="logout.php" class="btn btn-primary col-8" >Cerrar Session</a>';
                      echo '</div>';
                      echo '</div>';
                      echo '</div>';
                      echo '</div>';
                      echo '</div>';
                    }else if(($_SESSION["user"]=="steven")){
                        echo '<div class="col-4">';
                        echo '<div class="col-12 ">';
                        echo '<div class="card">';
                        echo '<img class="card-img-top cuadrado" src="imagenes\usuarios\steven.jpg" alt="Card image cap">';
                        echo '<div class="card-block">';
                        echo '<h4 class="card-block" align=center>Bienvenido <strong class="btn btn-raised btn-danger">'.$_SESSION["user"].'</strong></h4>';
                        echo '<p class="card-text"><strong>'.$_SESSION["user"].'</strong> tiene acceso a todo papuh :D</p>';
                        echo '<div class="col-12">';
                        echo '<a href="index.php" class="btn btn-primary col-4">Inicio</a>';
                        echo '<a href="logout.php" class="btn btn-primary col-8" >Cerrar Session</a>';
                        echo '</div>';
                        echo '</div>';
                        echo '</div>';
                        echo '</div>';
                        echo '</div>';
                            }else if(($_SESSION["user"]=="edwin")){
                              echo '<div class="col-4">';
                              echo '<div class="col-12 ">';
                              echo '<div class="card">';
                              echo '<img class="card-img-top cuadrado" src="imagenes\usuarios\edwin.jpg" alt="Card image cap">';
                              echo '<div class="card-block">';
                              echo '<h4 class="card-block" align=center>Bienvenido <strong class="btn btn-raised btn-success">'.$_SESSION["user"].'</strong></h4>';
                              echo '<p class="card-text"><strong>'.$_SESSION["user"].'</strong> tiene acceso a todo papuh :D</p>';
                              echo '<div class="col-12">';
                              echo '<a href="index.php" class="btn btn-primary col-4">Inicio</a>';
                              echo '<a href="logout.php" class="btn btn-primary col-8" >Cerrar Session</a>';
                              echo '</div>';
                              echo '</div>';
                              echo '</div>';
                              echo '</div>';
                              echo '</div>';
                            }else{
                                    echo '<div class="col-4">';
                                    echo '<div class="col-12 ">';
                                    echo '<div class="card">';
                                    echo '<img class="card-img-top cuadrado" src="imagenes\usuarios\otro.jpg" alt="Card image cap">';
                                    echo '<div class="card-block">';
                                    echo '<h4 class="card-block" align=center>Bienvenido <strong  >'.$_SESSION["user"].'</strong></h4>';
                                    echo '<p class="card-text"><strong>'.$_SESSION["user"].'</strong> en esta pagina el podr&aacutes tener acceso a consultas</p>';
                                    echo '<div class="col-12">';
                                    echo '<a href="index.php" class="btn btn-primary col-4">Inicio</a>';
                                    echo '<a href="logout.php" class="btn btn-primary col-8" >Cerrar Session</a>';
                                    echo '</div>';
                                    echo '</div>';
                                    echo '</div>';
                                    echo '</div>';
                                    echo '</div>';
                                  }
                                  
  };

?>
