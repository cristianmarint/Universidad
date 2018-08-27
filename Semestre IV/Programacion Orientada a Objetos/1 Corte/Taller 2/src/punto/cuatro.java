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
						resultado=(valor*1000);
					break;
					
					case 3:
						resultado=(valor*1000000);
					break;
					
					case 4:
						resultado=(valor*1000000000);
					break;
					
					case 5:
//						resultado=(valor*1000000000000);
					break;
					
					case 6:
//						resultado=(valor*8000000000000);
					break;
				}
			break;
			
			case 2:
				switch(nuevo){
				case 1:
					resultado=(valor/0.001);
				break;
				
				case 2:
					resultado=(valor);
				break;
				
				case 3:
					resultado=(valor*1000);
				break;
				
				case 4:
					resultado=(valor*1000000);
				break;
				
				case 5:
					resultado=(valor*1000000000);
				break;
				
				case 6:
//					resultado=(valor*8000000000);
				break;
			}
			break;
			
			case 3:
				switch(nuevo){
				case 1:
					resultado=(valor/0.00002);
				break;
				
				case 2:
					resultado=(valor/0.001);
				break;
				
				case 3:
					resultado=(valor);
				break;
				
				case 4:
					resultado=(valor*1000);
				break;
				
				case 5:
					resultado=(valor*1000000);
				break;
				
				case 6:
					resultado=(valor*8000000);
				break;
			}
			break;
			
			case 4:
				switch(nuevo){
				case 1:
					resultado=(valor/0.000000001);
				break;
				
				case 2:
					resultado=(valor/0.000001);
				break;
				
				case 3:
					resultado=(valor/0.001);
				break;
				
				case 4:
					resultado=(valor);
				break;
				
				case 5:
					resultado=(valor*1000);
				break;
				
				case 6:
					resultado=(valor*8000);
				break;
			}
			break;
			
			case 5:
				switch(nuevo){
				case 1:
					resultado=(valor/0.000000000001);
				break;
				
				case 2:
					resultado=(valor/0.000000001);
				break;
				
				case 3:
					resultado=(valor/0.000001);
				break;
				
				case 4:
					resultado=(valor*0.001);
				break;
				
				case 5:
					resultado=(valor);
				break;
				
				case 6:
					resultado=(valor*8);
				break;
			}
			break;
			
			case 6:
				switch(nuevo){
				case 1:
					resultado=(valor/0.000000000000125);
				break;
				
				case 2:
					resultado=(valor/0.000000000125);
				break;
				
				case 3:
					resultado=(valor/0.0000000125);
				break;
				
				case 4:
					resultado=(valor/0.000125);
				break;
				
				case 5:
					resultado=(valor/0.125);
				break;
				
				case 6:
					resultado=(valor);
				break;
			}
			break;
			
			}
				
			System.out.println(" ---------> El resultado es: ["+resultado+"]");
			System.out.println(" --------- ");
			System.out.println(" --------- ");
			System.out.println(" --------- ");
		}
		

	}

}
