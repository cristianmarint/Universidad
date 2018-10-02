package metodos;

public class quickshort {
	
	public void quickshort (int vector[],int limite_izq,int limite_der) {
		
		//primero se elije un pivote de la mitad del vector, con base a este se ordenaran las sub partes que se van generando
		//a la izq los menores al pivote, en la mitad el pivote y a la derecha los mayores
		
		//despues de ordenar la primera parte izq se repite el proceso con la parte derecha
		//creando un nuevo pivote y volviendo a seccionar
		
		int izq,der,temporal,pivote;
		
		//se re asignan los elementos de cada lado
		izq=limite_izq;
		der=limite_der;
		
		pivote=vector[(izq+der)/2];//se encuentra un elemento que este en la mitad y se usa como pivote par organizar
		
		do
		{
		
			//recorre toda la izq hasta que llega al limite derecho
			// cuando se cumple la condicion vuelve reemplaza los valores
			// repite el mismo proceso de derecha a izquierda
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
