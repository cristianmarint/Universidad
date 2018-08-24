package punto;

import java.util.Scanner;

public class cuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean val=false;
		Scanner sc = new Scanner (System.in);
		
		double valor=0,resultado=0;
		int op=0,actual=0,nuevo=0;
		
		while(val!=true) {
			System.out.println("Que es actualmente?");
			System.out.println("1) TeraBytes - TB");
			System.out.println("2) GigaBytes - GB");
			System.out.println("3) MegaBytes - MB");
			System.out.println("4) KiloBytes - KB");
			System.out.println("5) Bytes     - B");
			System.out.println("6) Bit       - b");
			
			actual=sc.nextInt();
			
			System.out.println("Ingrese el valor que desea convertir:");
			valor=sc.nextDouble();
			
			System.out.println("Deseas convertirlo a:");
			System.out.println("1) TeraBytes - TB");
			System.out.println("2) GigaBytes - GB");
			System.out.println("3) MegaBytes - MB");
			System.out.println("4) KiloBytes - KB");
			System.out.println("5) Bytes     - B");
			System.out.println("6) Bit       - b");	
			nuevo=(int) sc.nextInt();
			
			switch(actual) {
			
			case 1:
				switch(nuevo){
					case 1:
						resultado=valor;
					break;
					
					case 2:
						resultado=(valor*1024);
					break;
					
					case 3:
						resultado=(valor*1048575.91);
					break;
					
					case 4:
						resultado=(valor*1073741729.88);
					break;
					
					case 5:
						resultado=(valor*1099511531398.98);
					break;
					
					case 6:
						//resultado=(valor*8796093022208);
					break;
				}
			break;
			
			case 2:
			break;
			
			case 3:
			break;
			
			case 4:
			break;
			
			case 5:
			break;
			
			case 6:
			break;
			
			}
				
		}
		
		System.out.println("El resultado es: ["+resultado+"]");

	}

}
