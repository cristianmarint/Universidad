package cinema;

import java.util.Scanner;

public class Boleto {
	
	Scanner sc = new Scanner(System.in); 
	
	String hora,pelicula,referenciaSala;
	int dia=0,mes=0,ano=0;
	boolean estado=false;
	
	public Boleto(){			
	 	this.hora="No registrado";
		this.dia=99;
		this.mes=99;
	}
	
	public void crearBoleto(String pelicula,String hora,String referenciaSala,int dia,int mes,int ano){
		this.pelicula=pelicula;
		this.hora=hora;
		this.referenciaSala=referenciaSala;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}

	public void editarBoleto(String pelicula,String hora,String referenciaSala,int dia,int mes,int ano){
		this.pelicula=pelicula;
		this.hora=hora;
		this.referenciaSala=referenciaSala;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}

	public void mostrarBoleto() {
		System.out.println("Pelicula "+this.pelicula+" Sala "+this.referenciaSala+" Hora: "+this.hora+" fecha "+this.dia+"/"+this.mes+"/"+this.ano);	
	}
	
	
	public boolean estadoBoleto() {
		return estado;
	}

	public void activarBoleto(boolean nestado) {
		this.estado= nestado;
	}

	public void eliminarBoleto(boolean estado) {
		this.estado=false;	
	}

}
