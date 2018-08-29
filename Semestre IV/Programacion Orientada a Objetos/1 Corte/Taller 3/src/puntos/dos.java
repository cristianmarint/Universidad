package puntos;

import java.util.Scanner;

public class dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float r,a,b,c,d;
		
		System.out.println("Ingresa los valores A,B,C,D a continuacion:");
		
		
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		d=sc.nextFloat();
		
		r = (((a+b)/c)/d);
			
		System.out.println("El valor del area es de: "+r);
		
	}

}