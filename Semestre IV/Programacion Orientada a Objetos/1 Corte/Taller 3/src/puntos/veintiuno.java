package puntos;

import java.util.Scanner;

public class veintiuno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese un numero entero:");
		int n=sc.nextInt(),ant;
		
		if(n<0) {
			ant=(n*-1);
			}else {
				ant=n;
			}
		
		while(ant>1) {
			System.out.print(" , "+ant+"-2="+(ant-2) );
			ant-=2;
		}
		System.out.println("");
		if(ant==0) {
			System.out.println("El numero ["+n+"] es par");
		}else {
			System.out.println("El numero ["+n+"] es impar");
		}
	}

}
