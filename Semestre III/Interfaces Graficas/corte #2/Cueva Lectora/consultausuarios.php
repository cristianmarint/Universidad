<?php
 
include 'conexion.php';


if (!$connect) {

    echo "Error: No se pudo conectar a MySQL." . PHP_EOL;
    echo "errno de depuración: " . mysqli_connect_errno() . PHP_EOL;
    exit;
}else {
        $sql = "SELECT id,user,pass,email FROM usuario";
        if($result = mysqli_query($connect, $sql)){
            if(mysqli_num_rows($result) > 0){
                echo '<div class="col-12 " style="background:#4ac7e9;height:50px;"></div>';

                echo '<div class="col-12" style="background: white !important;">';
                echo '<h4 align="center"><strong>Usuarios Registrados</strong></h4>';
                echo '<table class="table">
                    <thead class="thead-dark">
                        <tr>
                            <th scope="col"> Id  </th>
                            <th> Usuario  </th>
                            <th> Contraseña  </th>
                            <th> Email </th>
                            </tr>
                    </thead>
                </div>';
                echo "<div class='col-12' style='background: white !important;'>";
                    while($row = mysqli_fetch_array($result)){
                        echo "<tbody>";
                                echo "<tr>";
                                    echo "<td>" . $row['id'] . "</td>";
                                    echo "<td>" . $row['user'] . "</td>";
                                    echo "<td>" . $row['pass'] . "</td>";
                                    echo "<td>" . $row['email'] . "</td>";
                                echo "</tr>";
                        echo "</tbody>";
                    }
                    echo "</table>";
                echo "</div>";
                mysqli_free_result($result);
            } else{
                echo "No se encontraron registros.";
            }
        } else{
            echo "ERROR: No se puedo ejecutar la consulta $sql. " . mysqli_error($connect);
        }

        mysqli_close($connect);
}
?>