package alumno;

import java.util.Scanner;

public class persona {
	
	int edad;
	String nombres;
	
	public void getNombre() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el nombre del alumno:");
		this.nombres = sc.nextLine();
	}
	
	public void getEdad() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la edad del alumno:");
		this.edad = sc.nextInt();
	}

	public void showNombre() {
		System.out.println("El nombre del estudiante es de: "+this.nombres);
	}
	
	public void showEdad() {
		System.out.println("La edad del estudiante es de: "+this.edad);
	}
	
	public void verificar_edad() {
		if(this.edad>=18) {
			System.out.println("El alumno "+this.nombres+" es mayor de edad");
		}else {
			System.out.println("---- El alumno "+this.nombres+" es no mayor de edad");
		}
		
	}
}
