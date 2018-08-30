package puntos;

import java.util.Scanner;

public class veinticuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("El capital de Petter por la compra de Manhattan en 1616 por 24 sera");
		
		double total=24;
		
		for(int i=1616;i<=1976;i++) {
			total = total + (total*0.12);
		}
		System.out.println("De "+total);		
		
	}


}
