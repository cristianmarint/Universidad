package puntos;

import java.util.Scanner;

public class veinticinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner sc = new Scanner (System.in);
		
	
		int prestamo=200,anos=5,i;
		double totalAPagar=prestamo;			
		for(i=0;i<5;i++) {		
			totalAPagar = totalAPagar + (prestamo*0.06);			
		}
		double cuota = (totalAPagar/anos);
		double deuda= (totalAPagar);
		
		System.out.println("Miguel debera pagar cada año así:");
		//System.out.println(totalAPagar+" | "+cuota+" | "+deuda);
		
		for(i=0;i<5;i++) {
			System.out.println("Año:"+i+" Cuota:"+cuota+" Deuda:"+(deuda-(cuota*i))+" Pagado:"+ (  cuota*i) );
		}
		
		
		
	}


}
