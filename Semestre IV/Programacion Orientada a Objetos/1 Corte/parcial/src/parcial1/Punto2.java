package parcial1;
import java.util.Scanner;

class punto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f=32,c;
		
		System.out.println("Ingrese grados centigrados: ");
		c=sc.nextDouble();
		double resultado=f+(9*c/5);
		System.out.println("La conversion de centigrados a fahrenheit es: "+resultado);
		
		
		sc.close();
	}

}
