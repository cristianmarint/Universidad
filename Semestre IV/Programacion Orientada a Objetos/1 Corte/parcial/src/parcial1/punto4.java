package parcial1;

import java.util.Scanner;

public class punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el salario de Juan:");
		
		double salario=sc.nextDouble();
		//double salario=100000;
		
		double treintaPor30 = (salario*0.3);
		double capacidad = (treintaPor30-(treintaPor30*0.02));
	
		System.out.println("Monto Solicitado :"+capacidad);
			System.out.println("PLAZO MESES|INTERES |TOTAL A PAGAR MENSUAL|TOTAL A PAGAR TOTAL");
		for(int i = 12;i<=72; i+=12 ) {
			System.out.println(+i+"         | "+String.format("%.1f", interes(i,100))+"   | "+ String.format("%.2f", ( (salario+capacidad+interes(i,100))/i ))+"            | "+ String.format("%.2f", ( (salario+capacidad+interes(i,100)) )) );
		}

		
		
		
	}
	
	private static double interes(int meses,float monto) {
		
		double interesMensual = monto*0.025,total=0; 
		
		for(int i=1;i<=meses;i++) {
			total = total+(interesMensual);
		}
		
		return total; 
	}

}
