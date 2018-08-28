package tallerEnClase;

import java.util.Scanner;

public class nueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float segundos,minutos,horas,dias;
		
		System.out.println("Ingrese el numero de horas");
		
		horas=sc.nextFloat();
		
		segundos=((horas*60)*60);
		minutos=(horas*60);
		dias = (horas/24);
		
		System.out.println("[ "+horas+" ] horas en segundos son:  "+ segundos);
		System.out.println("[ "+horas+" ] horas en minutos son:  "+ minutos);
		System.out.println("[ "+horas+" ] horas en horas son:  "+ horas);
		System.out.println("[ "+horas+" ] horas en dias son:  "+ dias);
		
	}

}
