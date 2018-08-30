package puntos;

import java.util.Scanner;

public class veintinueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] [ ] matriz1 = { {1,2},{3,4},{5,6},{7,8} } ;
		int [ ] [ ] matriz2 = { {9,10},{11,12},{13,14},{15,16} } ;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Numeros ingresados:");
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("  ");
		}

		
	}

}
