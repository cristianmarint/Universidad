package punto;

import java.util.Scanner;

public class seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=99;
		Scanner sc = new Scanner(System.in);
		
		while(op!=0) 
		{
			System.out.println("Seleccion:");
			System.out.println("1) Sumar los números del 0 al 100");
			System.out.println("2) Sumar los números pares del 0 al 50.");
			System.out.println("3) Sumar los números impares del 0 al 50.");
			op=sc.nextInt();
			
			switch(op) 
			{
				case 1:
					SumaHastaCien();
				break;
				
				case 2:
					ParesHastaCincuenta();
				break;
				
				case 3:
					ImparesHastaCincuenta();
				break;
			}
			
		}

	}
	
	
	public static void SumaHastaCien() {
		
		int c=0 , n=0;
		
		while(c<=100)
		{
			n+=c;
			c++;
		}
		System.out.println("La suma de los numeros del 1 al 100 es de: "+n);
		System.out.println("  ---  ");
		System.out.println("  ---  ");
		System.out.println("  ---  ");
	}
	
	public static void ParesHastaCincuenta() {
		
		int i=0,n=0;
		
		for(i=0;i<=50;i++)
		{
			if((i%2)==0) {
				n+=i;
			}
		}
		System.out.println("La suma de  los numeros pares del 0 al 50 es de: "+n);
		System.out.println("  ---  ");
		System.out.println("  ---  ");
		System.out.println("  ---  ");
	}

	public static void ImparesHastaCincuenta() {
		
		int i=0,n=0;
		
		for(i=0;i<=50;i++)
		{
			if( i%2 !=0) {
				n+=i;
			}
		}
		System.out.println("La suma de  los numeros impares del 0 al 50 es de: "+n);
		System.out.println("  ---  ");
		System.out.println("  ---  ");
		System.out.println("  ---  ");
	}
}
