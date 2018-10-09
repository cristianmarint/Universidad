package codigo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		boolean operando = true;
		
		CuentaAhorro[] cuentas = new CuentaAhorro[99];
		Cheque[] cheques = new Cheque [99];
		
		for(int j =0;j<99;j++) {
			cuentas[j]= new CuentaAhorro();
			cheques[j] = new Cheque(); 
		}
		 
		int cantCA=0,cantC=0,op;
				
		while(operando) {
			System.out.println("***   Bienvenido Cajero   ***");
			System.out.println("");
			System.out.println("Seleccione:");
			System.out.println("1) Crear cuenta corriente");
			System.out.println("2) Mostrar cuentas");
			System.out.println("3) Depositar a cuenta");
			System.out.println("4) Depositar interes mensual");
			System.out.println("5) Retirar saldo total");
			
			System.out.println(") Crear cheque ");
			System.out.println("6) Terminar Ejecucion");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
					System.out.println("Ingrese el numero de la cuenta:");
					int numeroCuenta=sc.nextInt();
					System.out.println("Ingrese el nombre del cliente:");
					String nombreCliente = sc.next();
					System.out.println("Ingrese el saldo");
					float saldoCuenta = sc.nextInt();
					System.out.println("Ingrese la fecha de vencimiento: (con el formato numerico dia/mes/ano)");
					String fechavencimientoCuenta = sc.next();
					System.out.println("Ingrese el porcentaje de interes:");
					float interesCuenta = sc.nextFloat();
					System.out.println("Ingrese el numero de meses:");
					float numeroMeses = sc.nextInt();
					
					cuentas[cantCA].CuentaAhorro(numeroCuenta,nombreCliente,saldoCuenta,fechavencimientoCuenta,interesCuenta,numeroMeses);
				break;
			}
			 
		 }
		
		
	}
	

}
