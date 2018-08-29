package puntos;

import java.util.Scanner;

public class trece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float x1,x2,a,b,c;
		double res;
		
		System.out.println("Ingresa los valores A,B,C a continuacion:");
		
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		float n = -4;
		double raiz = (Math.sqrt(n*a*c)/ 2*a )  ;

		System.out.println("X = "+raiz);
		
	}

}