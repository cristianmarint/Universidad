package puntos;

import java.util.Scanner;

public class nueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese el numero de horas");
		
		float horas=sc.nextFloat();
		
		System.out.println("[ "+horas+" ] horas en segundos son:  "+ ((horas*60)*60) );
		System.out.println("[ "+horas+" ] horas en minutos son:  "+ (horas*60) );
		System.out.println("[ "+horas+" ] horas en horas son:  "+ horas);
		System.out.println("[ "+horas+" ] horas en dias son:  "+ (horas/24) );
		
	}


}