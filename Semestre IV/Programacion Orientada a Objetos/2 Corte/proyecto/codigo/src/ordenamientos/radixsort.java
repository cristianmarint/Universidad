package ordenamientos;

public class radixsort {

	
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
	 
	public void radixsort(int vector[], int n) {
	    int m = getMax(vector, n);
	 
	    int exp;
	    for (exp = 1; m / exp > 0; exp *= 10)
	        countSort(vector, n, exp);
	}
	
}