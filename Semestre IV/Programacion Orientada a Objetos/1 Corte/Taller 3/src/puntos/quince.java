package puntos;

import java.util.Scanner;

public class quince {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int n1,n2,n3;
		
		System.out.println("Ingresa los valores n1,n2,n3 a continuacion:");
		
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();


        if(n1 > n2 && n1 > n3){
        System.out.println("El numero mayor es " + n1);
        }else{
            if(n2 > n1 && n2 > n3){
            System.out.println("El numero mayor es " + n2);
            }else{
            System.out.println("El numero mayor es " + n3);
            }
        }
		
        if(n1 < n2 && n1 < n3){
        System.out.println("El numero menor es " + n1);
        }else{
            if(n2 < n1 && n2 < n3){
            System.out.println("El numero menor es " + n2);
            }else{
            System.out.println("El numero menor es " + n3);
            }
        }
		
	}

}