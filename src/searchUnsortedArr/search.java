package searchUnsortedArr;

public class search {
// n = arr.lenght  -----   key = searching element in array.
	static int findElement(int arr[], int n,  
            int key) 
{ 
for (int i = 0; i < n; i++) 
	//E�er d�ng�de arad���m�z eleman varsa � yi d�nd�r
if (arr[i] == key) 
 return i; 
// Yoksa sonucu -1 e e�itle (false)
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
// Index numaralar� 0 dan ba�lad��� i�in yerini g�stermek i�in bulundu�u index + 1 �eklide konumuna ula�iriz.
System.out.println("Element Found at Position: " 
                 + (position + 1)); 
} 
} 

