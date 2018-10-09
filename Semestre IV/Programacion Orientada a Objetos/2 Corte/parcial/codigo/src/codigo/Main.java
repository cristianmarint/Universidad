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
		 
		int cantCA=0,cantC=0,op,idCuenta=0;
		float cantidadDeposito=0;
		boolean repetido=false;
				
		while(operando) {
			System.out.println("***   Bienvenido Cajero   ***");
			System.out.println("");
			System.out.println("Seleccione para Cuentas:");
			System.out.println("1) Crear cuenta corriente");
			System.out.println("2) Mostrar cuentas");
			System.out.println("3) Depositar Saldo");
			System.out.println("4) Depositar interes mensual");
			System.out.println("5) Retirar saldo total");
			System.out.println("");
			System.out.println("------------------------------");		
			System.out.println("");
			System.out.println("Seleccione para Cheques:");
			System.out.println("6) Crear cheque");
			System.out.println("7) Mostrar cheques");
			System.out.println("8) Depositar saldo");
			System.out.println("9) Retirar monto");
			System.out.println("0) Terminar Ejecucion");
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
					String fechaVencimientoCliente = sc.next();
					System.out.println("Ingrese el porcentaje de interes: (Ejemplo: 25% = 0,25)");
					float interesCliente = sc.nextFloat();
					System.out.println("Ingrese el numero de meses:");
					int numeroMesesCliente = sc.nextInt();
					
					repetido=false;
					for(int j =0;j<cantCA;j++) {
						if(numeroCuenta==cuentas[j].getNumero()) {
							repetido=true;
						}
					}
					if(!repetido) {
						cuentas[cantCA].crearCuenta(numeroCuenta,nombreCliente,saldoCuenta,fechaVencimientoCliente,interesCliente,numeroMesesCliente);
						cantCA++;
					}else {
						espacios();
						System.out.println("Numero de cuenta repetido");
					}
				break;
				
			case 2: 
				espacios();
				for(int j =0;j<cantCA;j++) {
					System.out.println("Numero de ID de cuenta: ["+j+"]");
					cuentas[j].mostrarCliente();
					espacios();
				}
				break;
				
			case 3:
				cantidadDeposito=0;
				System.out.println("Ingrese el numero de ID de cuenta");
				idCuenta=sc.nextInt();
				System.out.println("Señor/a ingrese la cantidad de dinero:");
				cantidadDeposito=sc.nextFloat();
				cuentas[idCuenta].depositar(cantidadDeposito);
				break;

			case 4:
				cantidadDeposito=0;
				System.out.println("Ingrese el numero de ID de cuenta");
				idCuenta=sc.nextInt();
				System.out.println("Señor/a ingrese la cantidad de dinero:");
				cantidadDeposito=sc.nextFloat();
				System.out.println("Ingrese la fecha de pago: (con el formato numerico dia/mes/ano), recuerde que debe de ser 1º de mes");
				String fechaDeposito = sc.next();
				cuentas[idCuenta].depositarInteres(cantidadDeposito, fechaDeposito);
				break;

			case 5:
				System.out.println("Ingrese el numero de ID de cuenta");
				idCuenta=sc.nextInt();
				System.out.println("Ingrese la fecha actual, debe de coincidir con la fecha de vencimiento.");
				String fechaRetiro = sc.next();
				System.out.println("Señor/a esta a punto de sacar todo el dinero de la cuenta, esta seguro? (s/n):");
				String validacion = sc.next();
				if(validacion.equals("s")) {
					cuentas[idCuenta].retirar(fechaRetiro);					
				}
				break;
				

				
				
			case 6:
				System.out.println("Ingrese el numero de cheque:");
				int numeroCheque =sc.nextInt();
				System.out.println("Ingrese el nombre del cliente:");
				String nombreCheque = sc.next();
				System.out.println("Ingrese el saldo");
				float saldoCheque = sc.nextInt();

				
				repetido=false;
				for(int j =0;j<cantC;j++) {
					if(numeroCheque==cheques[j].getNumero()) {
						repetido=true;
					}
				}
				if(!repetido) {
					cheques[cantC].crearCheque(numeroCheque,nombreCheque,saldoCheque);
					cantC++;
				}else {
					espacios();
					System.out.println("Numero de cheque repetido");
				}
				break;
				
			case 7:
				espacios();
				for(int j =0;j<cantC;j++) {
					System.out.println("Numero de ID de cheque: ["+j+"]");
					cheques[j].mostrarCheque();
					espacios();
				}
				break;
				
			case 8:
				cantidadDeposito=0;
				System.out.println("Ingrese el numero de ID de cuenta");
				idCuenta=sc.nextInt();
				System.out.println("Señor/a ingrese la cantidad de dinero:");
				cantidadDeposito=sc.nextFloat();
				cheques[idCuenta].depositar(cantidadDeposito);
				break;
				
			case 9:
				cantidadDeposito=0;
				System.out.println("Ingrese el numero de ID de cuenta");
				idCuenta=sc.nextInt();
				System.out.println("Señor/a ingrese la cantidad de dinero:");
				cantidadDeposito=sc.nextFloat();
				cheques[idCuenta].retirar(cantidadDeposito);
				break;
				
				
				
				
				
				
				

			case 0:
				System.out.println("Adios c:");
				operando=false;
			break;
			
			default:
				System.out.println("Opcion invalida");
			break;
			}
			
			 
			espacios();
		 }
		
		
	}
	
	public static void espacios() {
		System.out.println(" ");
		System.out.println(" ");
	}
	

}