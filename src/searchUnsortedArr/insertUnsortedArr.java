package searchUnsortedArr;

public class insertUnsortedArr {
	// Function to insert a given key in  
    // the array. This function returns n+1  
    // if insertion is successful, else n.
	
	// N = arr.length - - -- -  - key = insert element  - - -- - - capacity = arr in saklama alaný.
    static int insertSorted(int arr[], int n,  
                            int key,  
                            int capacity) 
    { 
  
        // Eðer arr.length >= capacity ise return n else arr[n] = key; and return ( n + 1 )
        if (n >= capacity) 
           return n; 
       
        arr[n] = key; 
       
        return (n + 1); 
    } 
       
    // Driver Code 
    public static void main (String[] args) 
    {    
        int[] arr = new int[20]; //capacity 
        arr[0] = 12; 
        arr[1] = 16; 
        arr[2] = 20; 
        arr[3] = 40;  
        arr[4] = 50; 
        arr[5] = 70; 
        int capacity = 20; 
        int n = 6; // lenght
        int i, key = 26; 
       
        System.out.print("Before Insertion: "); 
        for (i = 0; i < n; i++) 
            System.out.print(arr[i]+" "); 
       
        // Inserting key 
        n = insertSorted(arr, n, key, capacity); 
       
        System.out.print("After Insertion: "); 
        for (i = 0; i < n; i++) 
            System.out.print(arr[i]+" "); 
    } 
}
