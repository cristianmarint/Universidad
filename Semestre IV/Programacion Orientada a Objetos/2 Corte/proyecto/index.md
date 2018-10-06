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
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(arr, i, 0); 
        } 
    } 
  
    // To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
    void heapify(int arr[], int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    }

}
}
```

<iframe width="600" height="371" seamless frameborder="0" scrolling="no" src="https://docs.google.com/spreadsheets/d/e/2PACX-1vTtjdiuLVC8mR16Bu0ILHgs7Kd4JjlwGMsdxzZ5p1StYYGrlx5Xik-HpID62rsg3KqHT2TEfZ_MfuF_/pubchart?oid=253292140&amp;format=interactive"></iframe>

Este metodo presenta una ventajas en el ordenamiento de pocos datos, pero su gran desventaja radica en su tiempo de 
ordenamiento ya que este se dublica al mismo ritmo que aumenta la cantidad de datos que se desea ordenar.

![Diagrama Heapsort](https://i.imgur.com/iNUhuhR.png)














**------------------------------------------------------------------------------------------------------------------------------------------**

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```