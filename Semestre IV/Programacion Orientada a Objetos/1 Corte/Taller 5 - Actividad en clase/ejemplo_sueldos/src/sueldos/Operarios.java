package sueldos;
import java.util.Scanner;

public class Operarios {
		private Scanner te;
		private int[] sueldos;
		
		public Operarios() {
			te = new Scanner(System.in);
			sueldos=new int[5];
			for(int f=0;f<5;f++) {
				System.out.println("Ingrese el salario de los empleado:");
				sueldos[f]=te.nextInt();
			}
		}
		
		public void imprimir() {
			for(int f=0;f<5;f++) {
				System.out.println(sueldos[f]);
			}
		}
		
}
