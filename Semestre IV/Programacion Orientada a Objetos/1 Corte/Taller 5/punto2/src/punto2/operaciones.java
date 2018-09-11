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
	
	public void division() {
		if(this.n2>0) {
			System.out.println(this.n1+" ÷ "+this.n2+" = "+(this.n1/this.n2));
		}else {
			System.out.println("El segundo valor debe de ser mayor a cero, numero ingresado ["+this.n2+"]");
		}
	}
	
	public void suma() {
		System.out.println(this.n1+" + "+this.n2+" = "+(this.n1+this.n2));
	}
	
	public void resta() {
		System.out.println(this.n1+" - "+this.n2+" = "+(this.n1-this.n2));
	}
	
}
