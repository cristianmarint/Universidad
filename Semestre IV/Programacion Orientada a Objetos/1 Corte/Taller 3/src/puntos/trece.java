package puntos;

import java.util.Scanner;

public class trece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		double x1,x2,a,b,c;
		
		System.out.println("Ingresa los valores A,B,C a continuacion:");
		
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		double discriminante = ((Math.pow(b,2))-(4*a*c));
		System.out.println(a+" | "+b+" | "+c+" | ->Dis"+discriminante);		
		
		if(discriminante<0) {
			System.out.println ("La hay solucion para la ecuacion");
			}else if(discriminante==0) {
				x1 = (-b)/(2*a);
				System.out.println ("La ecuacion solo tiene una solucion X1 y X2 son iguales, resultado: ["+x1+"]");
				}else if(discriminante>0){
						x2 = (-b)-Math.sqrt(discriminante)/(2*a);
						x1 = (-b)+Math.sqrt(discriminante)/(2*a);
						System.out.println ("La ecuacion tiene dos soluciones X1 ["+x1+"] y X2 ["+x2+"]");
					}
		
	}

}