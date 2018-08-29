package puntos;

import java.util.Scanner;

public class once {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int a,b,c,d;
		
		System.out.println("Ingresa los valores A,B,C,D a continuacion:");
		
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		if( b == 0 || d == 0 ) {
			System.out.println("Indefinido");			
		}else if( a/b == c/d ) {
			System.out.println("Si");						
		}else {
			System.out.println("No");						
		}
		
	}

}