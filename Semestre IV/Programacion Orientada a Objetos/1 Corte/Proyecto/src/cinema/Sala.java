package cinema;

import java.util.Scanner;

public class Sala {
	Scanner sc = new Scanner(System.in); 
	
	String refe;
	int capacidad;
	boolean estado;
	
	public Sala(){			
	 	this.refe="Referencia no registrada";
	 	this.capacidad=999;
	}
	
	public void crearSala(String nombreSala,int capacidad){
		this.refe=nombreSala;
		this.capacidad=capacidad;
	}

	public void editarSala(String nuevaRefe,int capacidad) {
		this.refe=nuevaRefe;
		this.capacidad=capacidad;
	}

	public void mostrarSala() {
		System.out.println("Sala: ["+this.refe+"] capacidad "+this.capacidad);	
	}
	
	public String referenciaSala() {
		return refe;
	}
	
	public boolean estadoSala() {
		return estado;
	}

	public void activarSala(boolean nestado) {
		this.estado= nestado;
	}

	public void eliminarSala(boolean estado) {
		this.estado=false;	
	}
}
