package puntos;

import java.util.Scanner;

public class trece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float x1,x2,a,b,c;
		
		System.out.println("Ingresa los valores A,B,C a continuacion:");
		
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		double discriminante = ((Math.pow(b,2))-(4*(a*c)));
		
		
		double superior = ( (-b) * ( Math.sqrt( (Math.pow(b,2) - (-4*a*c) )  ) )  );
		
		double inferior = (2*a);
		
		double res = inferior/superior;

		System.out.println("X1 = "+res);
		
	}

}