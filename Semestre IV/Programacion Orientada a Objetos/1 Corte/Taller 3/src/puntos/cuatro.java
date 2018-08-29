package puntos;

import java.util.Scanner;

public class cuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float x,y,a,b,c,d;
		
		System.out.println("Ingresa los valores X,A,B,C a continuacion:");
		
		x=sc.nextFloat();
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		y = ( (a*x*2) + (b*x) + c );
			
		System.out.println("El valor del area es de: "+y);
		
	}

}