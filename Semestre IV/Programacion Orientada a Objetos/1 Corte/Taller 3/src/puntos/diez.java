package puntos;

import java.util.Scanner;

public class diez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese un numero para conocer su valor absoluto:");
		float n=sc.nextFloat();
		System.out.println("El valor absoluto de |"+n+"| es: "+(n*-1)+"");
		
	}

}
