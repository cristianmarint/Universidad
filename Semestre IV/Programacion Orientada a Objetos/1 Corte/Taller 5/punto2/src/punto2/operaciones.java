package punto2;

import java.util.Scanner;

public class operaciones {
	double n1=0,n2=0;
	
	public operaciones() {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Ingrese dos valores: ");
		this.n1 = sc.nextDouble();
		this.n2 = sc.nextDouble();
	}
	
	public void multiplicacion() {
		System.out.println(this.n1+" * "+this.n2+" = "+(this.n1*this.n2));
	}
}
