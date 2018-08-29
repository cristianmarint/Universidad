package puntos;

import java.util.Scanner;

public class diecisiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa el dato:");
		
		String c=sc.next().substring(0, 1);

		if(numero(c)) {
			System.out.println("Es un numero ["+c+"]");
		}else {
			boolean voc=false;
			switch(c) {
				case "a":
					voc= true;
					break;
					
				case "e":
					voc= true;
					break;
					
				case "i":
					voc= true;
					break;
					
				case "o":
					voc= true;
					break;
					
				case "u":
					voc= true;
					break;
					
				default:
					System.out.println("El caracter ingresado no es una vocal");
					break;
			}
			if(voc) {
				System.out.println("Es una vocal  ["+c+"]");
			}
		}
			
	}
	
	public static boolean numero(String cadena)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(cadena);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}

}
