   


import java.util.Random;
public class MergeSort {
	
	   
	    void merge(int arr[], int l, int m, int r)
	    {
	       
	        int n1 = m - l + 1;
	        int n2 = r - m;
	 
	        
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	 
	   
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	 
	       
	        int i = 0, j = 0;
	 
	        
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	       
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	    
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	 
	    
	    void sort(int arr[], int l, int r)
	    {
	        if (l < r) {
	            // Find the middle point
	            int m = (l + r) / 2;
	 
	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	 
	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }
	 
	 
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	    // Driver code
	    public static void main(String args[])
	    {    MergeSort ob = new MergeSort();  

	    Random rd = new Random(); 
		int[] arr = new int[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(1000); 	}


		long start = System.nanoTime();
		ob.sort(arr, 0, arr.length-1);
		long end = System.nanoTime();

		                               // ascending order
		long start1 = System.nanoTime();
		ob.sort(arr, 0, arr.length-1);
		long end1 = System.nanoTime();

		                               //descending order
		int b[] = new int[arr.length]; 
		for (int i=0; i<arr.length; i++) 
			b[i] = arr[arr.length-i-1];

		long start2 = System.nanoTime();
		ob.sort(b, 0, b.length-1);
		long end2 = System.nanoTime();

		                               // same number
		int[] c =new int[10000];
		for(int i=0;i<c.length;i++) {
			c[i]=505;
		}

		long start3 = System.nanoTime();
		ob.sort(c, 0, c.length-1);
		long end3 = System.nanoTime();


		System.out.println("Time taken by random array= "+(end - start) + " ns"); 
		System.out.println("Time taken by ascending order array= "+(end1 - start1) + " ns"); 
		System.out.println("Time taken by descending order array= "+(end2 - start2) + " ns"); 
		System.out.println("Time taken by same no. array= "+(end3 - start3) + " ns"); 

	}
}
