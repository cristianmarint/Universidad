package punto;

import java.util.Scanner;

public class siete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=99,x=0;
		Scanner sc = new Scanner(System.in);
		
		while(op!=0) 
		{
			System.out.println("Seleccion:");
			System.out.println("1) Tabla de Multiplicar de X numero (1-12)");
			System.out.println("2) Factorian de X numero");
			System.out.println("3) Fibonacci");
			System.out.println("0) Salir");
			op=sc.nextInt();
			
			switch(op) 
			{
				case 1:
					System.out.println("Ingrese el numero.");
					x=sc.nextInt();
					tablas(x);
				break;
				
				case 2:
					System.out.println("Ingrese el numero.");
					x=sc.nextInt();
					factorial(x);
				break;
				
				case 3:
					System.out.println("Ingrese la cantidad de que desea conocer:");
					x=sc.nextInt();
					fibo(x);
				break;
				
				case 4:
					op=0;
					sc.close();
				break;
			}
			
			System.out.println(" - - - ");
			System.out.println(" - - - ");
			System.out.println(" - - - ");
			
		}

	}
	
	
	public static void tablas(int n) {
		int i=0;
		for(i=1;i<=12;i++) {
			System.out.println("["+ i + "] x "+n+" = "+(i*n));
		}
	}

	
	public static void factorial(int n) {	
        int r = 1,n2 = n;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
		System.out.println("El factorial de "+n2+" es: "+r);

	}

	

	private static void fibo(int limite) {
		int i=0,siguiente=0,uno=0,dos=1;
		  for (i = 0; i < limite; i++)
		  {
		    if (i <= 1)
		      siguiente = i;
		    else
		    {
		    	siguiente = uno + dos;
		      uno = dos;
		      dos = siguiente;
		    }
		    System.out.println(" [ "+siguiente+" ] ");
		  }
	}
	
}
