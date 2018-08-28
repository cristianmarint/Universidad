package tallerEnClase;

import java.util.Scanner;

public class doce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		float cat,x,a,b,c,d;
		
		System.out.println("Ingresa los valores X,A,B,C a continuacion:");
		
		
		x=sc.nextFloat();
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		d=sc.nextFloat();

		if(x<0) {
			cat = (a+b-c+d);			
		}else if(x==0) {
				cat = ( (a+b)/(c+d) );			
			}else {		
					cat = ( (a+b)*(c+d) );
				}
		
		System.out.println("El valor de CAT es: "+cat);
		
	}

}
