package ordenamientos;

public class quickshort {
	public void quickshort (int vector[],int limite_izq,int limite_der) {
		
		int izq,der,temporal,pivote;

		izq=limite_izq;
		der=limite_der;
		
		pivote=vector[(izq+der)/2];		
		do
		{
			while(vector[izq]<pivote && izq<limite_der)izq++;
			while(pivote<vector[der] && der > limite_izq)der--;
			
			if (izq<=der)
			{
				temporal= vector[izq];
				vector[izq]=vector[der];
				vector[der]=temporal;
				izq++;
				der--;
				
			}
		}while(izq<=der);
		
		if (limite_izq < der)
		{
			quickshort(vector,limite_izq,der);
		}
		if (limite_der > izq)
		{
			quickshort(vector,izq,limite_der);
		}
	}
	
}