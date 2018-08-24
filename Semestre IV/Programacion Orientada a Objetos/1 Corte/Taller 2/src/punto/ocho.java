package punto;

//scanner
import java.util.Scanner;

//fechas
import java.text.SimpleDateFormat;
import java.util.Date;

//para lower Case
import java.io.*; 

public class ocho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=99;
		String carac;
		
		Scanner sc = new Scanner(System.in);
		
		while(op!=0) 
		{
			System.out.println("Seleccion:");
			System.out.println("1) Mes del sistema");
			System.out.println("2) Letra en codigo ASCII");
			System.out.println("0) Salir");
			op=sc.nextInt();
						
			switch(op) 
			{
				case 1:					   
				       Date now = new Date(); // variable tipo fecha
				        SimpleDateFormat simpleDateformat = new SimpleDateFormat("MM"); //variable para dar formato a now https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
				        int mes = Integer.parseInt( simpleDateformat.format(now) );
				        meses(mes);
				break;
				
				case 2:
					System.out.println("Ingrese la letra:");
					carac=sc.next();
					letraAscii( carac.toLowerCase() );
				break;
				
				case 3:
					op=0;
					sc.close();
				break;
				
			}
			
			System.out.println(" - - - ");
			System.out.println(" - - - ");
			System.out.println(" - - - ");
			
		}
		
	}
	
public static void meses(int num){
	switch(num) {
		case 1:
			System.out.println("El mes actual es enero");
		break;
		case 2:
			System.out.println("El mes actual es febrero");
		break;
		case 3:
			System.out.println("El mes actual es marzo");
		break;
		case 4:
			System.out.println("El mes actual es abril");
		break;
		case 5:
			System.out.println("El mes actual es mayo");
		break;
		case 6:
			System.out.println("El mes actual es junio");
		break;
		case 7:
			System.out.println("El mes actual es julio");
		break;
		case 8:
			System.out.println("El mes actual es agosto");
		break;
		case 9:
			System.out.println("El mes actual es septiembre");
		break;
		case 10:
			System.out.println("El mes actual es octubre");
		break;
		case 11:
			System.out.println("El mes actual es noviembre");
		break;
		case 12:
			System.out.println("El mes actual es diciembre");
		break;
	}
}
	
public static void letraAscii(String letra){
	//char character = "a";    
	//int ascii = (int) character;
	int numero=0;
	switch(letra) {
	
		case "a":
			numero=97;
		break;
		
		case "b":
			numero=98;
		break;

		case "c":
			numero=99;
		break;
		
		case "d":
			numero=100;
		break;
		
		case "e":
			numero=101;
		break;
		
		case "f":
			numero=102;
		break;
		
		case "g":
			numero=103;
		break;
		
		case "h":
			numero=104;
		break;
		
		case "i":
			numero=105;
		break;
		
		case "j":
			numero=106;
		break;
		
		case "k":
			numero=107;
		break;
		
		case "l":
			numero=108;
		break;

		case "m":
			numero=109;
		break;
		
		case "n":
			numero=110;
		break;
		
		
		case "o":
			numero=111;
		break;
		
		case "p":
			numero=112;
		break;
		
		case "q":
			numero=113;
		break;
		
		case "r":
			numero=114;
		break;
		
		case "s":
			numero=115;
		break;
		
		case "t":
			numero=116;
		break;
		
		case "u":
			numero=117;
		break;
		
		case "v":
			numero=118;
		break;
		
		case "w":
			numero=119;
		break;
		
		case "x":
			numero=120;
		break;
		
		case "y":
			numero=121;
		break;
		
		case "z":
			numero=122;
		break;	
	}
	System.out.println("El codigo ASCII de la letra ["+letra+"]  a  es  ( "+numero+" )");
	
}

}
