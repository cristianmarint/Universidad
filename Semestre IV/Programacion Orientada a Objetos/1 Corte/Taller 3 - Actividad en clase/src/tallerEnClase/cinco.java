package tallerEnClase;

import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float n,x;
		
		System.out.println("Ingresa los valores dos continuacion:");
		
		
		n=sc.nextFloat();
		x=sc.nextFloat();
	
		System.out.println("El valor de la suma es de: "+(n+x));
		System.out.println("El valor de la multiplicacion es de: "+(n*x));
		System.out.println("El valor de la division es de: "+(n/x));
		
	}

}