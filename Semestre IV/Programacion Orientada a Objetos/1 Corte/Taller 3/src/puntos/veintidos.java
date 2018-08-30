package puntos;

import java.util.Scanner;

public class veintidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Altura inicial de la pelota: 10 pies (3.048 metros)");
		double altura=10,AlFinal=0;
		for(int i=0;i<40;i++) {
			altura = ( altura * 0.66666666666666666666666666666667 );
			AlFinal+=altura;
		}
		System.out.println("La altura recorrida en el salta 40 es de: "+(AlFinal+40));		
	}

}
