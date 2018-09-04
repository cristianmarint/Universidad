package taller;

import java.util.Scanner;

class Punto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		double diat,sueldoh,horax,festivo;
		double sal;
		double salariom=781242;
		int op;
		System.out.println("Ingrese el nombre del empleado: ");
		nombre=sc.nextLine();
		System.out.println("Ingrese el sueldo que se le paga por hora: ");
		sueldoh=sc.nextDouble();
		System.out.println("Ingrese los dias trabajados: ");
		diat=sc.nextDouble();
		System.out.println("Ingrese la cantidad de dias festivos trabajados: ");
		festivo=sc.nextDouble();
		System.out.println("Escoja una opcion dependiendo del tipo de horas extras laboradas: ");
		System.out.println("");
		System.out.println("1.)Jornada Diurna.");
		System.out.println("2.)Jornada Nocturna.");
		System.out.println("3.)Jornada Diurna dominical/festivo");
		System.out.println("4.)Jornada Nocturna dominical/festivo");
		System.out.println("Escoja opcion: ");
		op=sc.nextInt();
		switch(op) {
		case 1:
			sal=diat*sueldoh*8;
			if(sal>salariom) {
				horax=8*4069*0.25;
				System.out.println("El empleado "+nombre+" gana por las horas extras un valor de "+horax);
				System.out.println("El usuario trabajo "+diat*8+" horas en total.");
				System.out.println("El salario que gana el empleado es de "+sal);
			}else {
				System.out.println("El empleado no tiene un salario de mas del minimo.");
			}
			
			System.out.println("El empleado trabaja en tipo de jornada diurna. ");
			break;
		case 2:
			sal=diat*sueldoh*8;
			if(sal>salariom) {
				horax=8*5697*0.75;
				System.out.println("El empleado "+nombre+" gana por las horas extras un valor de "+horax);
				System.out.println("El usuario trabajo "+diat*8+" horas en total.");
				System.out.println("El salario que gana el empleado es de "+sal);
			}else {
				System.out.println("El empleado no tiene un salario de mas del minimo.");
			}
			
			System.out.println("El empleado trabaja en tipo de jornada nocturna. ");
			break;
		case 3:
			sal=diat*sueldoh*8;
			if(sal>salariom) {
				horax=8*6510*0.75*festivo*0.25;
				System.out.println("El empleado "+nombre+" gana por las horas extras un valor de "+horax);
				System.out.println("El usuario trabajo "+diat*8+" horas en total.");
				System.out.println("El salario que gana el empleado es de "+sal);
			}else {
				System.out.println("El empleado no tiene un salario de mas del minimo.");
			}
			
			System.out.println("El empleado trabaja en tipo de jornada diurna dominical/festivo. ");
			break;
		case 4:
			sal=diat*sueldoh*8;
			if(sal>salariom) {
				horax=8*6510*0.75*festivo*0.75;
				System.out.println("El empleado "+nombre+" gana por las horas extras un valor de "+horax);
				System.out.println("El usuario trabajo "+diat*8+" horas en total.");
				System.out.println("El salario que gana el empleado es de "+sal);
			}else {
				System.out.println("El empleado no tiene un salario de mas del minimo.");
			}
			
			System.out.println("El empleado trabaja en tipo de jornada nocturna dominical/festivo. ");
			break;
		}
		
	
	
    sc.close();
	}

}
