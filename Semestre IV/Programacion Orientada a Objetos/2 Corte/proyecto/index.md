## PROYECTO METODOS DE ORDENAMIENTO [*](https://github.com/cristianmarint/Universidad/tree/master/Semestre%20IV/Programacion%20Orientada%20a%20Objetos/2%20Corte/proyecto/codigo) 

### Insercion [Codigo](https://github.com/cristianmarint/Universidad/blob/master/Semestre%20IV/Programacion%20Orientada%20a%20Objetos/2%20Corte/proyecto/codigo/src/ordenamientos/insercion.java)

El metodo de ordenamiento de Insercion representó la siguiente información ordenando vectores.

```markdown
public class `insercion`{
    public void `insercion`(int[] vector) {
        int aux,cont1,cont2;
        
        for(cont1=1;cont1<vector.length;cont1++) {
            aux = vector[cont1];
            for(cont2=cont1-1;cont2>=0 && vector[cont2]> aux;cont2--) {
                vector[cont2+1]=vector[cont2];
                vector[cont2]=aux;
            }
        }
    }
}
```

<iframe width="600" height="371" seamless frameborder="0" scrolling="no" src="https://docs.google.com/spreadsheets/d/e/2PACX-1vTtjdiuLVC8mR16Bu0ILHgs7Kd4JjlwGMsdxzZ5p1StYYGrlx5Xik-HpID62rsg3KqHT2TEfZ_MfuF_/pubchart?oid=1173122422&amp;format=interactive"></iframe>

Este metodo presenta una ventaja frente a los demas dado que su implementación es bastante simple,
sumado a esto, tenemos su velocidad es bastante decente frente a las contidades que se usaron como 
pruebas.

Por otra parte, al ser un ordenamiento tan simple y sin hacer uso de recursividad para agilizar sus 
procesos, nos topamos con un ordenamiento que al ser puesto a ordenar una cantidad considerable de
datos este va a tomar una cantidad considerable de tiempo.

![Diagrama Insercion](https://i.imgur.com/k5dl8l0.png)

**------------------------------------------------------------------------------------------------------------------------------------------**

### Mergesort [Codigo](https://github.com/cristianmarint/Universidad/blob/master/Semestre%20IV/Programacion%20Orientada%20a%20Objetos/2%20Corte/proyecto/codigo/src/ordenamientos/mergesort.java)

El metodo de ordenamiento de Mergesort representó la siguiente información ordenando vectores.

```markdown
public class `mergesort` {
	
	public  void `mergesort`(int vector[],int izq, int der){
	    if (izq<der){
	            int m=(izq+der)/2;
	            mergesort(vector,izq, m);
	            mergesort(vector,m+1, der);
	            merge(vector,izq, m, der);
	    }
	}
	
	public static void `merge`(int vector[],int izq, int m, int der){
		   int i, j, k;
		   int [] vector2 = new int[vector.length];
		   for (i=izq; i<=der; i++)
           {
		             vector2[i]=vector[i];
		             i=izq; 
                     j=m+1; 
                     k=izq;
		             while (i<=m && j<=der){ 
                        if (vector2[i]<=vector2[j]){
                            vector[k++]=vector2[i++];
                        }else{
                            vector[k++]=vector2[j++];
                        }
                        while (i<=m){ 
                                vector[k++]=vector2[i++];
                        }
			        }
           }
		 }

}
```

<iframe width="600" height="371" seamless frameborder="0" scrolling="no" src="https://docs.google.com/spreadsheets/d/e/2PACX-1vTtjdiuLVC8mR16Bu0ILHgs7Kd4JjlwGMsdxzZ5p1StYYGrlx5Xik-HpID62rsg3KqHT2TEfZ_MfuF_/pubchart?oid=478154806&amp;format=interactive"></iframe>

Este metodo presenta una ventajas en el ordenamiento de pocos datos, pero su gran desventaja radica en su tiempo de 
ordenamiento ya que este se dublica al mismo ritmo que aumenta la cantidad de datos que se desea ordenar.

![Diagrama Mergesort](https://i.imgur.com/Ic0rR8v.png)

**------------------------------------------------------------------------------------------------------------------------------------------**
### Heapsort [Codigo](https://github.com/cristianmarint/Universidad/blob/master/Semestre%20IV/Programacion%20Orientada%20a%20Objetos/2%20Corte/proyecto/codigo/src/ordenamientos/heapsort.java)

El metodo de ordenamiento de Heapsort representó la siguiente información ordenando vectores.

```markdown
public class `heapsort`{
    public void `heapsort`(int arr[]) 
    { 
        int n = arr.length; 
  
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        for (int i=n-1; i>=0; i--) 
        { 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            heapify(arr, i, 0); 
        } 
    } 
  
    void heapify(int arr[], int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            heapify(arr, n, largest); 
        } 
    }

}
}
```

<iframe width="600" height="371" seamless frameborder="0" scrolling="no" src="https://docs.google.com/spreadsheets/d/e/2PACX-1vTtjdiuLVC8mR16Bu0ILHgs7Kd4JjlwGMsdxzZ5p1StYYGrlx5Xik-HpID62rsg3KqHT2TEfZ_MfuF_/pubchart?oid=253292140&amp;format=interactive"></iframe>

Este metodo presenta una ventajas ya que su velocidad de procesado es bastante baja, viendo solo un 
aumento considerable cuando los datos a ordenar se triplican, en ese punto el tiempo de procesado se ve duplicado.
Este velocidad que lo puede a ventajar con cantidades menores no destaca al hacerlo con cantidades mucho mas grandes 
dado que la cantidad de recursos que consumiria se duplica al triplicar la cantidad de datos

![Diagrama Heapsort](https://i.imgur.com/iNUhuhR.png)

**------------------------------------------------------------------------------------------------------------------------------------------**

### Quicksort [Codigo](https://github.com/cristianmarint/Universidad/blob/master/Semestre%20IV/Programacion%20Orientada%20a%20Objetos/2%20Corte/proyecto/codigo/src/ordenamientos/quicksort.java)

El metodo de ordenamiento de Quicksort representó la siguiente información ordenando vectores.

```markdown
public class `quickshort` {
	public void `quickshort` (int vector[],int limite_izq,int limite_der) {
		
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
```

<iframe width="600" height="371" seamless frameborder="0" scrolling="no" src="https://docs.google.com/spreadsheets/d/e/2PACX-1vTtjdiuLVC8mR16Bu0ILHgs7Kd4JjlwGMsdxzZ5p1StYYGrlx5Xik-HpID62rsg3KqHT2TEfZ_MfuF_/pubchart?oid=172213764&amp;format=interactive"></iframe>

Este metodo presenta una ventajas en al ser el más rapido de todos los ordenamiento que se analizaron, presentado
una reduccion particular al aumentar la cantidad de datos que se seleccionan a ordenar, este metodo hace un uso excepcional
de la recursividad para disminuir el tiempo que le toma hacer ciertas tareas.


![Diagrama Quicksort](https://i.imgur.com/cU6EMdE.png)

**------------------------------------------------------------------------------------------------------------------------------------------**

### Countingsort [Codigo](https://github.com/cristianmarint/Universidad/blob/master/Semestre%20IV/Programacion%20Orientada%20a%20Objetos/2%20Corte/proyecto/codigo/src/ordenamientos/countingsort.java)

El metodo de ordenamiento de Countingsort representó la siguiente información ordenando vectores.

```markdown
public class `countingsort` {
    private static final int MAX_RANGE = 1000000;

    public void `countingsort`( int[] arr )
    {
        int N = arr.length;
        if (N == 0)
            return;

        int max = arr[0], min = arr[0];
        for (int i = 1; i < N; i++)
        {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        int range = max - min + 1;
 
        if (range > MAX_RANGE)
        {
            System.out.println("\nError : Range too large for sort");
            return;
        }
 
        int[] count = new int[range];
        for (int i = 0; i < N; i++)
            count[arr[i] - min]++;

        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];

        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                arr[j++] = i + min;
    }

}
```

<iframe width="600" height="371" seamless frameborder="0" scrolling="no" src="https://docs.google.com/spreadsheets/d/e/2PACX-1vTtjdiuLVC8mR16Bu0ILHgs7Kd4JjlwGMsdxzZ5p1StYYGrlx5Xik-HpID62rsg3KqHT2TEfZ_MfuF_/pubchart?oid=1146364100&amp;format=interactive"></iframe>

Este metodo presenta una ventajas en al ser uno de los más constantes en cuanto a su tiempo de ordenamiento,
cuando las cantidades variaron de 500 a 1500 el tiempo que le tomó ordenarlas fue el mismo, esto resulta
destacable dado que su consumo de recursos es facil de conocer. Por otra parte este metodo no hace uso de la
recursividad en sus proceso lo cual lo prodría hacer mucho más efeciciente con cantidades de datos mayores.
Ademas el limite de datos esta dado por una varible *MAX_RANGE*,esta pone un limite para evitar problemas al
alojar en memoria el vector.


![Diagrama Countingsort](https://i.imgur.com/cYoYkEo.png)

**------------------------------------------------------------------------------------------------------------------------------------------**

### Radixsort [Codigo](https://github.com/cristianmarint/Universidad/blob/master/Semestre%20IV/Programacion%20Orientada%20a%20Objetos/2%20Corte/proyecto/codigo/src/ordenamientos/radixsort.java)

El metodo de ordenamiento de Radixsort representó la siguiente información ordenando vectores.

```markdown
public class `radixsort` {

	
	public int getMax(int vector[], int n) {
	    int mx = vector[0];
	    int i;
	    for (i = 1; i < n; i++)
	        if (vector[i] > mx)
	            mx = vector[i];
	    return mx;
	}
	 
	public void countSort(int vector[], int n, int exp) {
	    int [] output = new int[n];
	    int [] count  = new int[10];
	    int i;
	 
	    for (i = 0; i < n; i++)
	        count[(vector[i] / exp) % 10]++;
	 
	    for (i = 1; i < 10; i++)
	        count[i] += count[i - 1];
	 
	    for (i = n - 1; i >= 0; i--) {
	        output[count[(vector[i] / exp) % 10] - 1] = vector[i];
	        count[(vector[i] / exp) % 10]--;
	    }
	 
	    for (i = 0; i < n; i++)
	        vector[i] = output[i];
	}
	 
	public void `radixsort`(int vector[], int n) {
	    int m = getMax(vector, n);
	 
	    int exp;
	    for (exp = 1; m / exp > 0; exp *= 10)
	        countSort(vector, n, exp);
	}
	
}
```

<iframe width="600" height="371" seamless frameborder="0" scrolling="no" src="https://docs.google.com/spreadsheets/d/e/2PACX-1vTtjdiuLVC8mR16Bu0ILHgs7Kd4JjlwGMsdxzZ5p1StYYGrlx5Xik-HpID62rsg3KqHT2TEfZ_MfuF_/pubchart?oid=545522873&amp;format=interactive"></iframe>

1231231


![Diagrama Radixsort]((https://i.imgur.com/9HvtMJ6.png))

**------------------------------------------------------------------------------------------------------------------------------------------**

# CONCLUSIONES:
## Cristian Marín
 - Conclusión 1
 - Conclusión 2
 - Conclusión 3