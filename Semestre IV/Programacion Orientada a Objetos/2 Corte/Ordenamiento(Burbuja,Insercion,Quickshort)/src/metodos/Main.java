package metodos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglo =  {15,23,43,42,51,22,3,5,66,7,8,8,99,12,23,45};
		int[] arreglo1 =  {15,23,43,42,51,22,3,5,66,7,8,8,99,12,23,45};
		int[] arreglo2 = {15,23,43,42,51,22,3,5,66,7,8,8,99,12,23,45};
		int[] arreglo3 = {15,23,43,42,51,22,3,5,66,7,8,8,99,12,23,45};
		int i;
		
		burbuja o = new burbuja();
		o.burbuja(arreglo);

		insercion in = new insercion();
		in.insercion(arreglo2);
		
		
		int size = arreglo3.length;
		quickshort q = new quickshort();
		q.quickshort(arreglo3, 0, size-1);

		System.out.println("------------Original--------------");
		for( i=0; i< arreglo1.length; i++) {
			System.out.println(arreglo1[i]);
		}

		System.out.println("------------burbuja--------------");
		for( i=0; i< arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		System.out.println("------------Insercion-------------");
		for( i=0; i< arreglo2.length; i++) {
			System.out.println(arreglo2[i]);
		}
		
		
		System.out.println("------------Quickshort-----------");
		for (i = 0;i<arreglo3.length;i++)
		{
			System.out.println(arreglo3[i]);
		}
			
		
	}

}
