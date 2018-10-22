package ordenamientos;

public class countingsort {
    private static final int MAX_RANGE = 1000000;

    public void countingsort( int[] arr )
    {
        int N = arr.length;
        if (N == 0)
            return;
        /** find max and min values **/
        int max = arr[0], min = arr[0];
        for (int i = 1; i < N; i++)
        {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        int range = max - min + 1;
 
        /** check if range is small enough for count array **/
        /** else it might give out of memory exception while allocating memory for array **/
        if (range > MAX_RANGE)
        {
            System.out.println("\nError : Range too large for sort");
            return;
        }
 
        int[] count = new int[range];
        /** make count/frequency array for each element **/
        for (int i = 0; i < N; i++)
            count[arr[i] - min]++;
        /** modify count so that positions in final array is obtained **/
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];
        /** modify original array **/
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                arr[j++] = i + min;
    }

}

// fuente https://www.sanfoundry.com/java-program-implement-counting-sort/