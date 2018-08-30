package puntos;

import java.util.Scanner;

public class veintiocho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] [ ] matriz = { {1,2,2,1},{3,4,4,3},{5,6,6,4},{7,8,8,7} } ;
		int [ ] vector = new int [ 4 ] ;
		int sumaFilas=0,sumaColumnas=0;
		int i=0,j=0,k=0,l=0;
		
		System.out.println("Contenido de la matriz:");
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print(" "+matriz[i][j]);
			}
			System.out.println("  ");
		}
		for(j=0;j<4;j++) {
			for(i=0;i<4;i++) {
				k += matriz[i][j];
				vector[l]=k;
			}
			k = 0;
			l++;
		}
		
		for(i=0;i<4;i++) {
			System.out.println("Suma de las columnas "+(1+i)+" - "+vector[i]);
		}
		
	}

}
