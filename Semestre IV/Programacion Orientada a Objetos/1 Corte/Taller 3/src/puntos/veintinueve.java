package puntos;

import java.util.Scanner;

public class veintinueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] [ ] matriz = { {},{},{},{} } ;
		int [ ] vector = new int [ 4 ] ;
		int sumaFilas=0,sumaColumnas=0;
		int i=0,j=0,k=0,l=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese 16 numeros:");
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				matriz[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Numeros ingresados:");
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("  ");
		}

		
	}

}
