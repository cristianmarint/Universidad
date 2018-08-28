package tallerEnClase;

import java.util.Scanner;

public class catorce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float n;
		
		System.out.println("Ingresa el valor a continuacion:");
		
		n=sc.nextFloat();
		
		if(n>100) {
			n+=20;
		}else if(n==100) {
			n+=1;
			}else {
				n-=20;
				}

		System.out.println("Resultado: "+n);
		
	}

}