package codigo;

public class Cheque {
	int numero;
	String nombre;
	float saldo;

	
	public Cheque() {
		numero=9999;
		nombre="Sin registrar";
		saldo=0;		
	}
	
	public void crearCheque(int numeroCuenta,String nombreCliente,float saldoCuenta) {
		numero = numeroCuenta;
		nombre = nombreCliente;
		saldo = saldoCuenta;
	
	}
	
	public int getNumero() {
		return numero;
	}
	

	public void mostrarCheque() {
		System.out.println("Los datos del cheque son:");
		System.out.println("Numero de cuenta: "+numero);
		System.out.println("Nombre del cliente: "+nombre);
		System.out.println("Saldo de cheque: "+saldo);
	}
	
	public void depositar(float cantidadDeposito) {
		saldo += cantidadDeposito;
	}
		


	public void retirar(float cantidadRetiro) {
		
		if(saldo>0) {
			if(saldo >= cantidadRetiro) {
					saldo -= cantidadRetiro;			
					System.out.println("Senor/a "+nombre+" su retiro fue realizado");
					System.out.println("Saldo restante: "+saldo);					
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