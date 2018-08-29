package puntos;

import java.util.Scanner;

public class uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n,cua,cu;
		
		System.out.println("Ingrese el numero para conocer su cuadrado y cubo");
		
		n=sc.nextInt();
		
		cua=(int) Math.pow(n, 2);
		cu=(int) Math.pow(n, 3);
		
		System.out.println("El cuadrado de [ "+n+" ] es: "+ cua);
		System.out.println("El cuadrado de [ "+n+" ] es: "+ cu);
		
	}

}
