package ordenamientos;

public class mergesort {
	
	public  void mergesort(int vector[],int izq, int der){
	    if (izq<der){
	            int m=(izq+der)/2;
	            mergesort(vector,izq, m);
	            mergesort(vector,m+1, der);
	            merge(vector,izq, m, der);
	    }
	}
	
	public static void merge(int vector[],int izq, int m, int der){
		   int i, j, k;
		   int [] vector2 = new int[vector.length]; //array auxiliar//
		   for (i=izq; i<=der; i++) //copia ambas mitades en el array auxiliar
		             vector2[i]=vector[i];

		             i=izq; j=m+1; k=izq;
		             while (i<=m && j<=der){ //copia el siguiente elemento m�s grande
				if (vector2[i]<=vector2[j]){
					vector[k++]=vector2[i++];
				}else{
					vector[k++]=vector2[j++];
				}
				while (i<=m){ //copia los elementos que quedan de la
						vector[k++]=vector2[i++]; //primera mitad (si los hay)
				}
			     }
		 }

}
