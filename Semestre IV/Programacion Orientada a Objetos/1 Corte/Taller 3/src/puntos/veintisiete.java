package puntos;

import java.util.Scanner;

public class veintisiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] vector = new float[5];
		float suma=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese 5 numeros:");
		for(int i=0;i<5;i++) {
			vector[i]=sc.nextInt();
		}
		System.out.println("Numeros ingresados:");
		for(int i=0;i<5;i++) {
			System.out.println(vector[i]);
			suma+=vector[i];
		}
		System.out.println("Suma de valores ingresados: "+suma);
		
	}

}
