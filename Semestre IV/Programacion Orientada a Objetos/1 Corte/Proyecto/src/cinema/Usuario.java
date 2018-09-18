package cinema;

import java.util.Scanner;

public class Usuario {
	
	Scanner sc = new Scanner(System.in); 
	
	String nombre,contra;
	boolean estado;
	
	public Usuario(){			
	 	this.nombre="Correo no registrado";
	 	this.contra="Contrasena no registrada";
	 	this.estado=false;
	}
	
	
	public void mostrarUsuario() {
		System.out.println("Correo: ["+this.nombre+"] -> contrasena: {"+this.contra+"}");	
	}
	
	public void crearUsuario(String nombreUsuario,String contraUsuario){
		this.nombre=nombreUsuario;
		this.contra=contraUsuario;
	}

	public void editarUsuario(String nuevoNombreUsuario,String nuevaContraUsuario){
		this.nombre=nuevoNombreUsuario;
		this.contra=nuevaContraUsuario;	
	}
	
	public boolean estadoUsuario() {
		return estado;
	}

	public void activarUsuario(boolean nestado) {
		this.estado= nestado;
	}

	public void eliminarUsuario(boolean estado) {
		this.estado=false;	
	}
	

}
