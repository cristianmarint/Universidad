package cinema;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean operando = true;
		
		//ARRAYS
		Usuario[]  users     = new Usuario[99];
		Sala[]     salas     = new Sala[99];
		Pelicula[] peliculas = new Pelicula[99];
		Boleto[]   boletos   = new Boleto[99];
		Reserva[]  reservas  = new Reserva[99];
		
		
		//INICIALIZACION DE LOS ARRAYS
		for(int j =0;j<99;j++) {
			users[j]= new Usuario();
		}
		for(int j =0;j<99;j++) {
			salas[j]= new Sala();
		}
		for(int j =0;j<99;j++) {
			peliculas[j]= new Pelicula();
		}
		for(int j =0;j<99;j++) {
			boletos[j]= new Boleto();
		}
		for(int j =0;j<99;j++) {
			reservas[j]= new Reserva();
		}
		
		
		int op=99,subop=99,i=0,idUs;
		int cantUs=0,cantSalas=0,cantPelicula=0,cantBoleto=0,cantReverva=0;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Utilice guion bajo _ como espacio ");
		
		while(operando) {
			System.out.println("");
			System.out.println("");
			System.out.println("Seleccione:");
			System.out.println("1) Usuario");
			System.out.println("2) Salas");
			System.out.println("3) Peliculas");
			System.out.println("4) boletos");
			System.out.println("5) reservas");
			System.out.println("6) Terminar Ejecucion");
			op = sc.nextInt();

			
			switch(op) {
				
				case 1://case 1

					System.out.println("");
					System.out.println("");
					System.out.println("Selecciono:");
					System.out.println("1) Usuario");
					System.out.println("**Seleccione:");
					System.out.println("|--> 1) Listar Usuarios");
					System.out.println("|--> 2) Crear  Usuario");
					System.out.println("|--> 3) Editar Usuario");
					System.out.println("|--> 4) Eliminar Usuario");
					System.out.println("|--> 5) Salir");
					subop = sc.nextInt();
					switch(subop){
						case 1:
							if(cantUs>=0) {
								for (i = 0; i < 99; ++i) {
									if( users[i].estadoUsuario() == true) {
										System.out.print("id: ["+i+"] ");
										users[i].mostrarUsuario();
										System.out.println(" ");
									}
								}
							}else {
								System.out.println("La lista de usuarios esta vacia.");
							}

						break;
						
						case 2:					
							System.out.println("Ingrese el correo del nuevo usuario:");
							String nombreUsuario=sc.next();
							System.out.println("Ingrese la contrasena para el nuevo usuario:");
							String contraUsuario=sc.next();
														
							users[cantUs].crearUsuario(nombreUsuario,contraUsuario);
							System.out.println("******Usuario creado id:"+cantUs);
							users[cantUs].mostrarUsuario();
							users[cantUs].activarUsuario(true);
							
							cantUs++;
						break;
						
						case 3:
							if(cantUs>=0) {
								System.out.println("Ingrese el id del usuario");
								idUs=sc.nextInt();
								
								System.out.println("Informacion actual:");
								users[idUs].mostrarUsuario();
								
								System.out.println("Ingrese el correo del usuario:");
								nombreUsuario=sc.next();
								
								System.out.println("Ingrese la contrasena para el usuario:");
								contraUsuario=sc.next();

								System.out.println("Informacion actualizada:");
								users[idUs].editarUsuario(nombreUsuario,contraUsuario);
								users[idUs].mostrarUsuario();
								
							}else {
								System.out.println("La lista de usuarios esta vacia.");
							}
						break;
						
						case 4:
							if(cantUs>=0) {
								System.out.println("Ingrese el id del usuario");
								idUs=sc.nextInt();
								
								System.out.println("El usuario ha sido eliminado");
								
								users[idUs].eliminarUsuario(false);
								cantUs--;
							}else {
								System.out.println("La lista de usuarios esta vacia.");
							}
							break;
					}

				break;//fin case 1
				
				
				case 2://case 2
					String nombreSala;
					int idSala,capacidad;

					System.out.println("");
					System.out.println("");
					System.out.println("Selecciono:");
					System.out.println("**Seleccione:");
					System.out.println("|--> 1) Listar Salas");
					System.out.println("|--> 2) Crear  Sala");
					System.out.println("|--> 3) Editar Sala");
					System.out.println("|--> 4) Eliminar Sala");
					System.out.println("|--> 5) Salir");
					subop = sc.nextInt();
					switch(subop){
						case 1:
							if(cantSalas>=0) {
								for (i = 0; i < 99; ++i) {
									if( salas[i].estadoSala() == true) {
										System.out.print("id: ["+i+"] ");
										salas[i].mostrarSala();
										System.out.println(" ");
									}
								}
							}else {
								System.out.println("La lista de salas esta vacia.");
							}

						break;
						
						case 2:					
							System.out.println("Ingrese la nueva referencia de la nueva sala:");
							nombreSala=sc.next();
							System.out.println("Ingrese la capacidad de la nueva sala:");
							capacidad=sc.nextInt();
														
							salas[cantSalas].crearSala(nombreSala,capacidad);
							System.out.println("******Sala creada id:"+cantSalas);
							salas[cantSalas].mostrarSala();
							salas[cantSalas].activarSala(true);
							
							cantSalas++;
						break;
						
						case 3:
							if(cantSalas>=0) {
								System.out.println("Ingrese el id de sala");
								idSala=sc.nextInt();
								
								System.out.println("Informacion actual:");
								salas[idSala].mostrarSala();
								
								System.out.println("Ingrese la nueva referencia de la sala:");
								nombreSala=sc.next();
								System.out.println("Ingrese la capacidad de la nueva sala:");
								capacidad=sc.nextInt();
								
								System.out.println("Los cambios se han realizado");
								
								salas[idSala].editarSala(nombreSala,capacidad);
							}else {
								System.out.println("La lista de salas esta vacia.");
							}
						break;
						
						case 4:
							if(cantSalas>=0) {
								System.out.println("Ingrese el id de la sala");
								idSala=sc.nextInt();
								
								System.out.println("la sala ha sido eliminado");
								
								salas[idSala].eliminarSala(false);
								cantSalas--;
							}else {
								System.out.println("La lista de salas esta vacia.");
							}
							break;
					}
					
				break;//fin case 2
				
				
				case 3://case 3
					
					int idPelicula;

					System.out.println("");
					System.out.println("");
					System.out.println("Selecciono:");
					System.out.println("3) Peliculas");
					System.out.println("**Seleccione:");
					System.out.println("|--> 1) Listar Peliculas");
					System.out.println("|--> 2) Crear  Pelicula");
					System.out.println("|--> 3) Editar Pelicula");
					System.out.println("|--> 4) Eliminar Pelicula");
					System.out.println("|--> 5) Salir");
					subop = sc.nextInt();
					switch(subop){
						case 1:
							if(cantPelicula>=0) {
								for (i = 0; i < 99; ++i) {
									if( peliculas[i].estadoPelicula() == true) {
										System.out.print("id: ["+i+"] ");
										peliculas[i].mostrarPelicula();
										System.out.println(" ");
									}
								}
							}else {
								System.out.println("La lista de peliculas esta vacia.");
							}

						break;
						
						case 2:					
							System.out.println("Ingrese el nombre de la nueva  pelicula:");
							String nombrePelicula=sc.next();
							System.out.println("Ingrese el ano de lanzamiento de la nueva  pelicula:");
							int anoPelicula=sc.nextInt();
																			
							peliculas[cantPelicula].crearPelicula(nombrePelicula,anoPelicula);
							System.out.println("******Pelicula creada id:"+cantPelicula);
							peliculas[cantPelicula].mostrarPelicula();
							peliculas[cantPelicula].activarPelicula(true);
							
							
							cantPelicula++;
						break;
						
						case 3:
							if(cantPelicula>=0) {
								System.out.println("Ingrese el id de Pelicula");
								idPelicula=sc.nextInt();
								
								System.out.println("Pelicula seleccionada ["+idPelicula+"]");
								peliculas[idPelicula].mostrarPelicula();
								
								System.out.println("Ingrese el nombre de la nueva  pelicula:");
								nombrePelicula=sc.next();
								System.out.println("Ingrese el ano de la nueva  pelicula:");
								anoPelicula=sc.nextInt();
								
								peliculas[idPelicula].editarPelicula(nombrePelicula,anoPelicula);
								System.out.println("Los cambios se han realizado");
								
							}else {
								System.out.println("La lista de peliculas esta vacia.");
							}
						break;
						
						case 4:
							if(cantPelicula>=0) {
								System.out.println("Ingrese el id de la pelicula");
								idPelicula=sc.nextInt();
								
								System.out.println("la pelicula ha sido eliminado");
								
								peliculas[idPelicula].eliminarPelicula(false);
								cantPelicula--;
							}else {
								System.out.println("La lista de peliculas esta vacia.");
							}
							break;
					}
				break;//fin case 3
				
				
				case 4://case 4
					String horaBoleto,nombrePeliculaBoleto,referenciaSalaBoleto;
					int diaBoleto=0,mesBoleto=0,anoBoleto=0,idBoleto;
					int idPeliculaBoleto,idPeliculaSalaBoleto;

					System.out.println("");
					System.out.println("");
					System.out.println("Selecciono:");
					System.out.println("4) boletos");
					System.out.println("**Seleccione:");
					System.out.println("|--> 1) Listar Boletos Comprados");
					System.out.println("|--> 2) Comprar  Boletos");
					System.out.println("|--> 3) Editar Boletos");
					System.out.println("|--> 4) Eliminar Boletos");
					System.out.println("|--> 5) Salir");
					
					subop = sc.nextInt();
					switch(subop){
						case 1:
							if(cantBoleto>=0) {
								for (i = 0; i < 99; ++i) {
									if( boletos[i].estadoBoleto() == true) {
										System.out.print("id: ["+i+"] ");
										boletos[i].mostrarBoleto();
										System.out.println(" ");
									}
								}
							}else {
								System.out.println("La lista de Boletos comprados esta vacia.");
							}

						break;
						
						case 2:		
								
								System.out.println("Ingrese el id de la pelicula");
								idPeliculaBoleto=sc.nextInt();
								nombrePeliculaBoleto=peliculas[idPeliculaBoleto].nombrePelicula();
								System.out.println("Ingrese el id de la sala");
								idPeliculaSalaBoleto=sc.nextInt();
								referenciaSalaBoleto=salas[idPeliculaSalaBoleto].referenciaSala();
								
								System.out.println("Ingrese la hora de la pelicula:");
								horaBoleto=sc.next();
								System.out.println("Ingrese el dia de la pelicula:");
								diaBoleto=sc.nextInt();
								System.out.println("Ingrese el mes de la pelicula:");
								mesBoleto=sc.nextInt();
								System.out.println("Ingrese el ano de la pelicula:");
								anoBoleto=sc.nextInt();
								
								
								boletos[cantBoleto].crearBoleto(nombrePeliculaBoleto,horaBoleto,referenciaSalaBoleto,diaBoleto,mesBoleto,anoBoleto);
								System.out.println("******Boleto creada id:"+cantPelicula);
								boletos[cantBoleto].mostrarBoleto();
								boletos[cantBoleto].activarBoleto(true);
								
								cantBoleto++;

						break;
						
						case 3:
							if(cantBoleto>=0) {
								System.out.println("Ingrese el id del boleto");
								int idBoletoModificar=sc.nextInt();
								
								System.out.println("Ingrese el id de la pelicula");
								idPeliculaBoleto=sc.nextInt();
								nombrePeliculaBoleto=peliculas[idPeliculaBoleto].nombrePelicula();
								System.out.println("Ingrese el id de la sala");
								idPeliculaSalaBoleto=sc.nextInt();
								referenciaSalaBoleto=salas[idPeliculaSalaBoleto].referenciaSala();
								
								System.out.println("Ingrese la hora de la pelicula:");
								horaBoleto=sc.next();
								System.out.println("Ingrese el dia de la pelicula:");
								diaBoleto=sc.nextInt();
								System.out.println("Ingrese el mes de la pelicula:");
								mesBoleto=sc.nextInt();
								System.out.println("Ingrese el ano de la pelicula:");
								anoBoleto=sc.nextInt();
								
								boletos[idBoletoModificar].editarBoleto(nombrePeliculaBoleto,horaBoleto,referenciaSalaBoleto,diaBoleto,mesBoleto,anoBoleto);
								System.out.println("Los cambios se han realizado");
								
							}else {
								System.out.println("La lista de boletos comprados esta vacia.");
							}
						break;
						
						case 4:
							if(cantBoleto>=0) {
								System.out.println("Ingrese el id del boleto");
								idBoleto=sc.nextInt();
								
								System.out.println("el boleto ha sido eliminado");
								
								boletos[idBoleto].eliminarBoleto(false);
								cantBoleto--;
							}else {
								System.out.println("La lista de boletos comprados esta vacia.");
							}
							break;
					}
				break;//fin case 4

				
				case 5://case 5
					
					String nombreReservador,horaReserva;
					int diaReserva=0,mesReserva=0,anoReserva=0,idReserva;
					float pagoReserva;
					
					
					System.out.println("");
					System.out.println("");
					System.out.println("Selecciono:");
					System.out.println("5) reservas");
					System.out.println("**Seleccione:");
					System.out.println("|--> 1) Listar Reservas");
					System.out.println("|--> 2) Crear Reservas");
					System.out.println("|--> 3) Pagar Reservas");
					System.out.println("|--> 4) Editar Reservas");
					System.out.println("|--> 5) Eliminar Reservas");
					System.out.println("|--> 6) Salir");
					subop = sc.nextInt();
					switch(subop){
						case 1:
							if(cantReverva>=0) {
								for (i = 0; i < 99; ++i) {
									if( reservas[i].estadoReserva() == true) {
										System.out.print("id: ["+i+"]");
										reservas[i].mostrarReserva();
										System.out.println(" ");
									}
								}
							}else {
								System.out.println("La lista de reservas comprados esta vacia.");
							}

						break;
						
						case 2:
							if(cantReverva>=0) {
								System.out.println("Ingrese el id de la pelicula");
								idReserva=sc.nextInt();
								nombrePeliculaBoleto=peliculas[idReserva].nombrePelicula();
								
								System.out.println("Ingrese el nombre de la persona que reserva:");
								nombreReservador=sc.next();
								System.out.println("Ingrese la hora de la pelicula:");
								horaReserva=sc.next();
								System.out.println("Ingrese el dia de la pelicula:");
								diaReserva=sc.nextInt();
								System.out.println("Ingrese el mes de la pelicula:");
								mesReserva=sc.nextInt();
								System.out.println("Ingrese el ano de la pelicula:");
								anoReserva=sc.nextInt();
								
								reservas[cantReverva].crearReserva(nombreReservador,nombrePeliculaBoleto,horaReserva,diaReserva,mesReserva,anoReserva);
								System.out.println("******Reserva creada id:"+cantReverva);
								reservas[cantReverva].mostrarReserva();
								reservas[cantReverva].activarReserva();
								
								
								cantReverva++;
							}else {
								System.out.println("La lista de peliculas  esta vacia.");
							}
						break;
						
						case 3:
							System.out.println("Ingrese el id de la reserva");
							idReserva=sc.nextInt();
							
							if(reservas[idReserva].estadoPagoReserva() <= 0) {
								System.out.println("Ingrese el monto ha pagar:");
								pagoReserva = sc.nextFloat();
								reservas[idReserva].pagarReserva(pagoReserva);
							}else {								
								System.out.println("La reserva ya ha sido pagada, pero puede ser modificada.");
							}
						break;
						
						case 4:
							if(cantReverva>=0) {
								System.out.println("Ingrese el id de la reserva");
								idReserva=sc.nextInt();
								
								System.out.println("Ingrese el id de la pelicula");
								idReserva=sc.nextInt();
								nombrePeliculaBoleto=peliculas[idReserva].nombrePelicula();
								
								System.out.println("Ingrese el nombre de la persona que reserva:");
								nombreReservador=sc.next();
								System.out.println("Ingrese la hora de la pelicula:");
								horaReserva=sc.next();
								System.out.println("Ingrese el dia de la pelicula:");
								diaReserva=sc.nextInt();
								System.out.println("Ingrese el mes de la pelicula:");
								mesReserva=sc.nextInt();
								System.out.println("Ingrese el ano de la pelicula:");
								anoReserva=sc.nextInt();
								
								reservas[idReserva].editarReserva(nombreReservador,nombrePeliculaBoleto,horaReserva,diaReserva,mesReserva,anoReserva);
								System.out.println("Los cambios se han realizado");
								
							}else {
								System.out.println("La lista de reservas comprados esta vacia.");
							}
						break;
						
						case 5:
							if(cantReverva>=0) {
								System.out.println("Ingrese el id de la reserva");
								idReserva=sc.nextInt();
								
								System.out.println("la reserva ha sido eliminado");
								
								reservas[idReserva].eliminarReserva();
								cantReverva--;
							}else {
								System.out.println("La lista de reservas comprados esta vacia.");
							}
							break;
					}
				break;//fin case 5
				
				
				case 6:
					operando=false;
					System.out.println("");
					System.out.println("");
					System.out.println("Adios c:");
				break;
			}
			
			
		}
		
		

	}

}