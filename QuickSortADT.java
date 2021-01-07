import java.util.*;
class QuickSort { 
    //selects last element as pivot, pi using which array is partitioned. 
    int partition(int intArray[], int low, int high) { 
        int pi = intArray[high];  
        int i = (low-1); // smaller element index   
        for (int j=low; j<high; j++) { 
            // check if current element is less than or equal to pi 
            if (intArray[j] <= pi) { 
                i++; 
                // swap intArray[i] and intArray[j] 
                int temp = intArray[i]; 
                intArray[i] = intArray[j]; 
                intArray[j] = temp; 
            } 
        } 
   
        // swap intArray[i+1] and intArray[high] (or pi) 
        int temp = intArray[i+1]; 
        intArray[i+1] = intArray[high]; 
        intArray[high] = temp; 
   
        return i+1; 
    } 
   
   
  //routine to sort the array partitions recursively
    void quick_sort(int intArray[], int low, int high) { 
        if (low < high) { 
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(intArray, low, high); 
   
            // sort each partition recursively 
            quick_sort(intArray, low, pi-1); 
            quick_sort(intArray, pi+1, high); 
        } 
    } 
}
 
class QuickSortADT{
    public static void main(String args[]) {
        //initialize a numeric array, intArray
        int intArray[];
        int n,i; 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter no of elements..");
	n = sc.nextInt();
	
	intArray = new int[n]; //  memory allocation for the array 'a'.

	System.out.println("Enter the elements..");
	for(i=0;i<n;i++)
		intArray[i] = sc.nextInt();

	System.out.println("\n Before sorting....\n");
	for(i=0;i<n;i++)
		System.out.print(intArray[i]+"  ");

	//call quick_sort routine using QuickSort object
        QuickSort obj = new QuickSort(); 
        obj.quick_sort(intArray, 0, n-1); 
		
	System.out.println("\n After sorting....\n");
	for(i=0;i<n;i++)
		System.out.print(intArray[i]+"  ");		
        
        
    } 
}