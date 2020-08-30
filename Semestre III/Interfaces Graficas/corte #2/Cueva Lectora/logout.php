<?php

  session_start();//carga las variables de la session
  session_destroy();//las destruye user y pass y demas (email)
  header("location:index.php");//re direge a inicio

?>
