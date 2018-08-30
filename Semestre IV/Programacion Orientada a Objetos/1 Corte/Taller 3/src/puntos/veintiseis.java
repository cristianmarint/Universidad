package puntos;

import java.util.Scanner;
import java.util.*;

public class veintiseis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		List<Integer> menoresA60 = new ArrayList<Integer>();
		List<Integer> menoresA90 = new ArrayList<Integer>();
		
		int vel=0;
		boolean limite=true;
		
		
		
		while(limite==true) {
			
			System.out.println("Ingrese la velocidad del vehiculo");
			
			vel = sc.nextInt();
			
			
			if(vel<=60) {
				System.out.println("BIEN");
				menoresA60.add(vel);
			}else if(vel<=90) {
				System.out.println("RAPIDO");					
				menoresA90.add(vel);
			}else if(vel>160){
				System.out.println("DETENIENDO REGISTROS");					
				limite=false;
			}

			System.out.println(" - - - ");
			System.out.println(" - - - ");
			System.out.println(" - - - ");
			
			if(limite==false) {
				System.out.println("Velocidades menores o iguales a 60KM/H");
				for(int i=0;i<menoresA60.size();i++) {
					 System.out.println( (i+1)+" - "+menoresA60.get(i));
				}
				System.out.println("");
				System.out.println("Velocidades menores o iguales a 90KM/H");
				for(int i=0;i<menoresA90.size();i++) {
					System.out.println((i+1)+" - "+menoresA90.get(i));
				}
			}
			
		}
		
		
	}


}
