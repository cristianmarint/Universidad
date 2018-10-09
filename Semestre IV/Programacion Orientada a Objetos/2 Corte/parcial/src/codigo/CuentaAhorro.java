package codigo;

public class CuentaAhorro {
	String nombre;
	String fechaVencimiento;
	int numero;
	float saldo;
	float interes;
	float interesMensual;
	
	public CuentaAhorro() {
		numero=9999;
		nombre="Sin registrar";
		saldo=0;
		fechaVencimiento="00-00-0000";
		interes=0;
		interesMensual=0;
	}
	
	
	public CuentaAhorro(int numeroCuenta,String nombreCliente,float saldoCuenta,String fechaVencimientoCliente,float interesCliente,int numeroMesesCliente) {
		numero = numeroCuenta;
		nombre = nombreCliente;
		saldo = saldoCuenta;
		fechaVencimiento = fechaVencimientoCliente;
		interes=interesCliente;
		
		interesMensual=((interes*saldo)*numeroMesesCliente);
		
	}
	

	public void mostrarCliente() {
		System.out.println("Los datos del cliente son:");
		System.out.println("Numero de cuenta: "+numero);
		System.out.println("Nombre del cliente: "+nombre);
		System.out.println("Saldo de la cuenta: "+saldo);
	}
	
	public void depositar(float cantidadDeposito) {
		saldo += cantidadDeposito;
	}
		
	

	public void depositarInteres(float cantidadDeposito,String fechaDeposito) {
		String[] partesFechaDeposito = fechaDeposito.split("/");
		if(interesMensual>0)
		{
			if(partesFechaDeposito[0]=="1" || partesFechaDeposito[0]=="01") {
				interesMensual -= cantidadDeposito;
				System.out.println("Su pago a sido registrado.");
				System.out.println("saldo de interes mensual restante:"+interesMensual);
			}
		}else {
			System.out.println("Su interes mensual es de 0");
			return;
		}
	}
	

	public void retirar(String fechaActual,float cantidadRetiro) {
		
		if(saldo>0) {
			if(saldo == cantidadRetiro) {
				if(fechaActual.equals(fechaVencimiento)) {
					saldo = 0;			
					System.out.println("Senor/a "+nombre+" su retiro fue realizado");
					System.out.println("Saldo restante: "+saldo);					
				}
			}else {
				System.out.println("No puede retirar ese monto.");
				return;
			}
			
		}else {
			System.out.println("Su cuenta no tiene saldo.");
			return;
		}
		
	}
}
