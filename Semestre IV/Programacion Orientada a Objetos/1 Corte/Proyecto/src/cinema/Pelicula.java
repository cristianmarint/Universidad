package cinema;

import java.util.Scanner;

public class Pelicula {
	
	Scanner sc = new Scanner(System.in); 
	
	String nombre;
	int ano;
	boolean estado;
	
	public Pelicula(){			
	 	this.nombre="Registre la pelicula";
	 	this.ano=0000;
	}
	
	public void crearPelicula(String nombrePelicula,int nuevoAno){
		this.nombre=nombrePelicula;
		this.ano=nuevoAno;
	}

	public void editarPelicula(String nuevoNombre,int nuevoAno) {
		this.nombre=nuevoNombre;
		this.ano=nuevoAno;
	}

	public void mostrarPelicula() {
		System.out.println("Pelicula: ["+this.nombre+"] Ano: ("+this.ano+")");	
	}
	
	public String nombrePelicula() {
		return nombre;
	}

	public boolean estadoPelicula() {
		return estado;
	}
	
	public void activarPelicula(boolean nestado) {
		this.estado= nestado;
	}

	public void eliminarPelicula(boolean estado) {
		this.estado=estado;	
	}

}
