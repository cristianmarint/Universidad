package ordenamientos;

import java.util.Scanner;
import java.util.Random; 

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// TODO Auto-generated method stub
		boolean menu = true;
		while(menu) {
			System.out.println("Seleccione un metodo");
			System.out.println("1) Insercion");
			System.out.println("2) Merge Sort");
			System.out.println("3) Heap  Sort");
			System.out.println("4) Quick Sort");
			System.out.println("5) Counting Sort");
			System.out.println("6) Radix    Sort");
			System.out.println("0) Salir");
			int op=sc.nextInt();
			switch(op) {
			case 1:
				menuInsercion();
				break;
			
			case 2:
				menuMergesort();
				break;
				
			case 3:
				menuHeapsort();
				break;
				
			case 4:
				menuQuicksort();
				break;
				
			case 5:
				menuCountingsort();
				break;
				
			case 6:
				menuRadixsort();
				break;
				
			default:
				opcionIncorrecta();
				break;		
			}
			
		}
	}
	
	public static void pausa() {
		System.out.println("Presione una tecla para continuar...");
			try{        
				System.in.read();
				}catch(Exception e){	
					e.printStackTrace();
				}
	}
	
	public static void llenarVector(int vector []) {
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random() * 100);
		}
	}
	
	public static void mostrarVector(int vector[]) {
		for(int i=0;i<vector.length;i++) {
			System.out.println("Posicion ("+(i+1)+") -> ["+vector[i]+"]");
		}
	}
	
	public static void opcionIncorrecta() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("-----------------");
		System.out.println("Opcion incorrecta");
		System.out.println("-----------------");
		System.out.println(" ");
	}

	
	public static void menuCountingsort() {
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random();
		System.out.println("*****ORDENAMIENTO-COUNTINGSORT*****");
		
		System.out.println("-- Seleccice la cantidad a ordenar");
		System.out.println("1) 100");
		System.out.println("2) 200");
		System.out.println("3) 500");
		System.out.println("4) 1000");
		System.out.println("5) 1200");
		int tamVec=0;
		int op=sc.nextInt();
		switch(op) {
				case 1:
					tamVec=100;
					break;
				case 2:
					tamVec=200;
					break;
				case 3:
					tamVec=500;
					break;
				case 4:
					tamVec=1000;
					break;
				case 5:
					tamVec=1500;
					break;
				default:
					opcionIncorrecta();
					break;
		}
		
		if(tamVec!=0) {
			int[] vector = new int[tamVec];
			
			llenarVector(vector);
			mostrarVector(vector);
			
			pausa();
			
			System.out.println("ORDENANDO...");
			countingsort ins = new countingsort();
			
			long tiempoInicio = System.currentTimeMillis();
			ins.countingsort(vector);
			long tiempoFin = System.currentTimeMillis();
			long duracion = tiempoFin - tiempoInicio;
			mostrarVector(vector);
			System.out.println("El ordenamiento tomo: "+duracion+" milisegundos");
		}
	}
	
	
	public static void menuHeapsort() {
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random();
		System.out.println("*****ORDENAMIENTO-HEAPSORT*****");
		
		System.out.println("-- Seleccice la cantidad a ordenar");
		System.out.println("1) 100");
		System.out.println("2) 200");
		System.out.println("3) 500");
		System.out.println("4) 1000");
		System.out.println("5) 1500");
		int tamVec=0;
		int op=sc.nextInt();
		switch(op) {
				case 1:
					tamVec=100;
					break;
				case 2:
					tamVec=200;
					break;
				case 3:
					tamVec=500;
					break;
				case 4:
					tamVec=1000;
					break;
				case 5:
					tamVec=1500;
					break;
				default:
					opcionIncorrecta();
					break;
		}
		
		if(tamVec!=0) {
			int[] vector = new int[tamVec];
			
			llenarVector(vector);
			mostrarVector(vector);
			
			pausa();
			
			System.out.println("ORDENANDO...");
			heapsort ins = new heapsort();
			
			long tiempoInicio = System.currentTimeMillis();
			ins.heapsort(vector);
			long tiempoFin = System.currentTimeMillis();
			long duracion = tiempoFin - tiempoInicio;
			mostrarVector(vector);
			System.out.println("El ordenamiento tomo: "+duracion+" milisegundos");
		}
	}
	
	public static void menuMergesort() {
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random();
		System.out.println("*****ORDENAMIENTO-MERGESORT*****");
		
		System.out.println("-- Seleccice la cantidad a ordenar");
		System.out.println("1) 100");
		System.out.println("2) 200");
		System.out.println("3) 500");
		System.out.println("4) 1000");
		System.out.println("5) 1500");
		int tamVec=0;
		int op=sc.nextInt();
		switch(op) {
				case 1:
					tamVec=100;
					break;
				case 2:
					tamVec=200;
					break;
				case 3:
					tamVec=500;
					break;
				case 4:
					tamVec=1000;
					break;
				case 5:
					tamVec=1500;
					break;
				default:
					opcionIncorrecta();
					break;
		}
		
		if(tamVec!=0) {
			int[] vector = new int[tamVec];
			
			llenarVector(vector);
			mostrarVector(vector);
			
			pausa();
			
			System.out.println("ORDENANDO...");
			mergesort ins = new mergesort();
			
			long tiempoInicio = System.currentTimeMillis();
			int size = vector.length ;
			ins.mergesort(vector,0,size-1);
			long tiempoFin = System.currentTimeMillis();
			long duracion = tiempoFin - tiempoInicio;
			mostrarVector(vector);
			System.out.println("El ordenamiento tomo: "+duracion+" milisegundos");
		}
	}
		

	public static void menuRadixsort() {
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random();
		System.out.println("*****ORDENAMIENTO-RADIXSHORT*****");
		
		System.out.println("-- Seleccice la cantidad a ordenar");
		System.out.println("1) 100");
		System.out.println("2) 200");
		System.out.println("3) 500");
		System.out.println("4) 1000");
		System.out.println("5) 1500");
		int tamVec=0;
		int op=sc.nextInt();
		switch(op) {
				case 1:
					tamVec=100;
					break;
				case 2:
					tamVec=200;
					break;
				case 3:
					tamVec=500;
					break;
				case 4:
					tamVec=1000;
					break;
				case 5:
					tamVec=1500;
					break;
				default:
					opcionIncorrecta();
					break;
		}
		
		if(tamVec!=0) {
			int[] vector = new int[tamVec];
			
			llenarVector(vector);
			mostrarVector(vector);
			
			pausa();
			
			System.out.println("ORDENANDO...");
			radixsort ins = new radixsort();
			
			long tiempoInicio = System.currentTimeMillis();
			ins.radixsort(vector,vector.length);
			long tiempoFin = System.currentTimeMillis();
			long duracion = tiempoFin - tiempoInicio;
			mostrarVector(vector);
			System.out.println("El ordenamiento tomo: "+duracion+" milisegundos");
		}
	}
	
	
	
	public static void menuQuicksort() {
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random();
		System.out.println("*****ORDENAMIENTO-QUICKSHORT*****");
		
		System.out.println("-- Seleccice la cantidad a ordenar");
		System.out.println("1) 100");
		System.out.println("2) 200");
		System.out.println("3) 500");
		System.out.println("4) 1000");
		System.out.println("5) 1500");
		int tamVec=0;
		int op=sc.nextInt();
		switch(op) {
				case 1:
					tamVec=100;
					break;
				case 2:
					tamVec=200;
					break;
				case 3:
					tamVec=500;
					break;
				case 4:
					tamVec=1000;
					break;
				case 5:
					tamVec=1500;
					break;
				default:
					opcionIncorrecta();
					break;
		}
		
		if(tamVec!=0) {
			int[] vector = new int[tamVec];
			
			llenarVector(vector);
			mostrarVector(vector);
			
			pausa();
			
			System.out.println("ORDENANDO...");
			
			
			quickshort ins = new quickshort();
			int size = vector.length;
			
			long tiempoInicio = System.currentTimeMillis();
			ins.quickshort(vector,0,size-1);
			long tiempoFin = System.currentTimeMillis();
			long duracion = tiempoFin - tiempoInicio;
			mostrarVector(vector);
			System.out.println("El ordenamiento tomo: "+duracion+" milisegundos");
		}		
	}
	
	
	
	public static void menuInsercion() {
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random();
		System.out.println("*****ORDENAMIENTO-INSERCION*****");
		
		System.out.println("-- Seleccice la cantidad a ordenar");
		System.out.println("1) 100");
		System.out.println("2) 200");
		System.out.println("3) 500");
		System.out.println("4) 1000");
		System.out.println("5) 1500");
		int tamVec=0;
		int op=sc.nextInt();
		switch(op) {
				case 1:
					tamVec=100;
					break;
				case 2:
					tamVec=200;
					break;
				case 3:
					tamVec=500;
					break;
				case 4:
					tamVec=1000;
					break;
				case 5:
					tamVec=1500;
					break;
				default:
					opcionIncorrecta();
					break;
		}
		
		if(tamVec!=0) {
			int[] vector = new int[tamVec];
			llenarVector(vector);
			mostrarVector(vector);
			
			pausa();
			
			System.out.println("ORDENANDO...");
			
			insercion ins = new insercion();
			long tiempoInicio = System.currentTimeMillis();
			ins.insercion(vector);
			long tiempoFin = System.currentTimeMillis();
			long duracion = tiempoFin - tiempoInicio;
			mostrarVector(vector);
			System.out.println("El ordenamiento tomo: "+duracion+" milisegundos");
		}		
	}

}
