package punto;

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float cen,fah;
		
		System.out.println("Ingrese el valor en grados centigrados para su conversion a Fahrenheit.");
		
		cen=sc.nextFloat();
		
		fah = (32+((9*cen)/5));
		
		System.out.println(+cen+" centigrados equivalen a "+fah+ " Fahrenheit");
		
		sc.close();
	}

}
