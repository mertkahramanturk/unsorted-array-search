package searchUnsortedArr;

public class search {
// n = arr.lenght  -----   key = searching element in array.
	static int findElement(int arr[], int n,  
            int key) 
{ 
for (int i = 0; i < n; i++) 
	//Eðer döngüde aradýðýmýz eleman varsa Ý yi döndür
if (arr[i] == key) 
 return i; 
// Yoksa sonucu -1 e eþitle (false)
return -1; 
} 

// Driver Code 
public static void main(String args[]) 
{ 
int arr[] = {12, 34, 10, 6, 40}; 
int n = arr.length; 

// Using a last element as search element 
int key = 40; 
int position = findElement(arr, n, key); 

if (position == - 1) 
System.out.println("Element not found"); 
else
// Index numaralarý 0 dan baþladýðý için yerini göstermek için bulunduðu index + 1 þeklide konumuna ulaþiriz.
System.out.println("Element Found at Position: " 
                 + (position + 1)); 
} 
} 

