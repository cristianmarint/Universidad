package puntos;

import java.util.Scanner;

public class seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float area,l1,l2,l3,l4;
		
		System.out.println("Ingresa los valores L1,L2 continuacion:");
		
		
		l1=sc.nextFloat();
		l2=sc.nextFloat();
		
		
		area=l1*l2;
	
		System.out.println("El area del cuadrado es: "+area);
		
	}


}