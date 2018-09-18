package cinema;

import java.util.Scanner;

public class Reserva {

	Scanner sc = new Scanner(System.in); 
	
	String nombre,hora,pelicula;
	int dia,mes,ano;
	float pago;
	boolean estado=false;
	
	public Reserva(){			
	 	this.nombre="No registrada";
	 	this.pago=0;
	}
	
	public void mostrarReserva() {
		System.out.println("Reserva hecha por: "+this.nombre+" Para las "+this.hora+" De la fecha "+this.dia+"/"+this.mes+"/"+this.ano);
		System.out.println( "Pelicula "+this.pelicula);
		System.out.println( "Pago "+this.pago);
	}

	public void crearReserva(String nombreReserva,String nombrePeliculaBoleto,String hora,int dia,int mes,int ano){
		this.nombre=nombreReserva;
		this.pelicula=nombrePeliculaBoleto;
		this.hora=hora;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}

	public void pagarReserva(float pagoReserva){
		this.pago=pagoReserva;
	}
	
	public float estadoPagoReserva(){
		return pago;
	}

	public void editarReserva(String nombreReserva,String nombrePeliculaBoleto,String hora,int dia,int mes,int ano){
		this.nombre=nombreReserva;
		this.pelicula=nombrePeliculaBoleto;
		this.hora=hora;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	public boolean estadoReserva() {
		return estado;
	}
	
	public void activarReserva() {
		this.estado= true;
	}

	public void eliminarReserva() {
		this.estado=false;	
	}
	
}
