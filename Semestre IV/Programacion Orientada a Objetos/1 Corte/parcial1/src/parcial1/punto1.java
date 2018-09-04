package parcial1;

import java.util.Scanner;

public class punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float a=0,b=0;
		
		System.out.println("Ingrese dos valores");
		
		a=sc.nextFloat();
		b=sc.nextFloat();
		
		System.out.println("Los valores sumados son iguales a:"+(a+b));
		System.out.println("Los valores restados son iguales a:"+(a-b));
		System.out.println("Los valores multiplicados son iguales a:"+(a*b));
		
		if(verificar(b)) {
			System.out.println("Los valores divididos son iguales a:"+(a/b));
		}else {
			System.out.println("El segundo valor es menor a cero (0)");
		}
		
	}
	
	private static boolean verificar(float x) {
		if(x>0) {
			return true;
		}else {
			return false;
		}
	}

}
