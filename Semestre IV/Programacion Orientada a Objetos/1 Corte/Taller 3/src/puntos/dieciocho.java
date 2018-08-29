package puntos;

import java.util.Scanner;

public class dieciocho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float monto,deuda;
		
		System.out.println("Ingresa el monto a continuacion:");
		monto=sc.nextFloat();
		System.out.println("Ingresa la deuda a continuacion:");
		deuda=sc.nextFloat();
		
		if(monto==deuda) {
			System.out.println("El cliente esta ha pagado toda sus deudas");
		}else if(monto>deuda) {
			System.out.println("Creadito a favor por: "+(monto-deuda));
		}else {
			System.out.println("La nueva deuda es de: "+ ((deuda-monto)+(monto*0.03)) );
		}
		
	}

}