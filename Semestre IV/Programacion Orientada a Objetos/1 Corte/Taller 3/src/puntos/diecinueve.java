package puntos;

import java.util.Scanner;

public class diecinueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		 
		float[] vector = new float[10];
		float negativo=0,nCeros=0,positivo=0;
		int i;
		 
		 System.out.println("Ingresa 10 numero: ");
		 for( i=0;i<=9;i++) {
			 vector[i]=sc.nextFloat();
			 
			 if(vector[i]<0) {
				 negativo+=vector[i];
			 }else if(vector[i]==0) {
				 nCeros++;
			 }else {
				 positivo+=vector[i];
			 }
		 }
		
		 System.out.println("Numero de ceros: "+nCeros);
		 System.out.println("Suma de positivos: "+positivo);
		 System.out.println("Suma de negativos: "+negativo);
		 
		 System.out.println(" - - - ");
		 System.out.println(" - - - ");
		 System.out.println(" - - - ");
		 
		 for( i=0;i<=9;i++) {
			 System.out.println("Numeros Ingresados: "+vector[i]);
		 }
		 

	}

}
