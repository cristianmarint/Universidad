package punto;

import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float km,ms;
		
		System.out.println("Ingrese la velocidad que desea convertir a metros por segundo");
		
		km=sc.nextFloat();
		
		ms = ((km*5)/18);
		
		System.out.println("La velocidad ["+km+"] kilometros equivalen a ["+ms+"] metros por segundo");
		
		sc.close();
	}

}
