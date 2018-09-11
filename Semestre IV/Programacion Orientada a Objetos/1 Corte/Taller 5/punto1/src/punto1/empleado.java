package punto1;
import java.util.Scanner;
public class empleado {
	
	String nombre;
	float salario;
	
	public empleado() {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado: ");
		this.nombre = sc.nextLine();
		System.out.println("Ingrese el salario del empleado: ");
		this.salario = sc.nextFloat();
	}
	
	public void showDatos() {
		System.out.println("El nombre del empleado es "+this.nombre+" y su salario de: "+this.salario);
	}
	
	public void impuestos() {
		if(this.salario>1500000) {
			System.out.println("El empleado "+this.nombre+" deberá pagar impuestos");
		}else {
			System.out.println("El empleado "+this.nombre+" no deberá pagar impuestos");
		}
	}

}
