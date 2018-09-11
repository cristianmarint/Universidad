package punto2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean veri = true;
		while(veri) {
			operaciones oper=new operaciones();
			
			System.out.println("Seleccione la operacion:");
			System.out.println("1) Suma:");
			System.out.println("2) Resta:");
			System.out.println("3) Multiplicacion:");
			System.out.println("4) Division:");
			System.out.println("5) Salir:");

			Scanner  sc = new Scanner(System.in);
			int op=sc.nextInt();
			switch(op) {
			
				case 1:
					oper.suma();
					break;
				case 2:
					oper.resta();
					break;
				case 3:
					oper.multiplicacion();
					break;
				case 4:
					oper.division();
					break;
				case 5:
					veri=false;
					break;
			}
		}
		
	}

}
