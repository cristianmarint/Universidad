package puntos;

import java.util.Scanner;

public class dieciocho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Ingresa nombre del empleado");
		String nombre = sc.next();
		System.out.println("Ingresa horas trabajadas del empleado");
		float horas = sc.nextFloat();
		System.out.println("Ingresa sueldo por hora del empleado");
		float porHora = sc.nextFloat();
		
		double total=0;
		
		if(horas<40) {
			total = (porHora*horas); 
		}else {
			total =  ( (40 * porHora) + ((horas-40)*porHora*1.5) );
		}
		 System.out.println("El sueldo del empleado ["+nombre+"] sera de ["+total+"]");
	}

}