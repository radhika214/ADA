
public class sorting {
static void selectionSort(int arr[])
	    {
	        int n = arr.length;
            for (int i = 0; i < n-1; i++) 
            {
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	             if (arr[j] < arr[min_idx])
	                  min_idx = j;
	 
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	    
static void bubbleSort(int[] arr) 
        {  
	        int n = arr.length;  
	        int temp = 0;
	        for(int i=0; i < n; i++)
	          {
	            for(int j=1; j < (n-i); j++)
	                {
	                    if(arr[j-1] > arr[j])
	                    {  
	                       temp = arr[j-1];  
	                       arr[j-1] = arr[j];  
	                       arr[j] = temp;  
	                    }
	                }
	          }
	    }
	 
static void insertionSort(int array[]) 
        {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) 
	          {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) 
	               {  
	                   array [i+1] = array [i];  
	                    i--;  
	               }  
	            array[i+1] = key;  
	         }  
	    } 

void merge(int arr[], int l, int m, int r)
{
    // Find sizes of two subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;

    /* Create temp arrays */
    int L[] = new int[n1];
    int R[] = new int[n2];

    /*Copy data to temp arrays*/
    for (int i = 0; i < n1; ++i)
        L[i] = arr[l + i];
    for (int j = 0; j < n2; ++j)
        R[j] = arr[m + 1 + j];

    /* Merge the temp arrays */

    // Initial indexes of first and second subarrays
    int i = 0, j = 0;

    // Initial index of merged subarry array
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

    /* Copy remaining elements of L[] if any */
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}

// Driver code

public static void main(String[] args)
       {
	        int i = 0;
	        int arr1[] = new int[10000];
	        int arr2[] = new int[10000];
	        int arr3[] = new int[10000];
	        int arr4[] = new int[10000];
	        for(i=0;i<10000;i++) 
	        {
	            int x = (int)(Math.random()*10000);
	            arr1[i] = x;
	            arr2[i] = x;
	            arr3[i] = x;
	            arr4[i] = x;
	        }
	        
	    long startTime1, startTime2, startTime3, endTime1, endTime2, endTime3,startTime4, endTime4;
	    startTime1 = System.currentTimeMillis();
	    bubbleSort(arr1);
	    endTime1 = System.currentTimeMillis();
	        
	    startTime2 = System.currentTimeMillis();
	    insertionSort(arr2);
	    endTime2 = System.currentTimeMillis();
	        
	     startTime3 = System.currentTimeMillis();
	     selectionSort(arr3);
	     endTime3 = System.currentTimeMillis();
	        
	     startTime4 = System.currentTimeMillis();
	     selectionSort(arr4);
	     endTime4 = System.currentTimeMillis();
	        
	        
	      System.out.println("time bubble sort : "+    (endTime1-startTime1));
	      System.out.println("time insertion sort : "+ (endTime2-startTime2));
	      System.out.println("time selection sort : "+ (endTime3-startTime3));
	      System.out.println("time merge sort : "+     (endTime4-startTime4));
       }

}
	 