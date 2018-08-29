package puntos;

import java.util.Scanner;

public class siete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		double area;
		float l2,l1;
		
		System.out.println("Ingresa los valores L1 (Cateto) ,L2 (Cateto) continuacion:");
		
		
		l1=sc.nextFloat();
		l2=sc.nextFloat();
		
		
		area= ( Math.pow(l1, 2) + Math.pow(l2, 2) ) ;
	
		System.out.println("La hipotenusa del triangulo es: "+ Math.sqrt(area) );
		
	}


}