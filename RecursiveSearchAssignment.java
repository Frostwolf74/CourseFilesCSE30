package Activity;

import java.util.Scanner;

public class RecursiveSearchAssignment {
	static Scanner input = new Scanner(System.in);
	
	static int[] insertionSort(int[] a) { // throw the array into a sorter and return it sorted
			int itemToInsert, j;
			boolean reset;
				
			for(int k = 1; k < a.length; k++) {
				itemToInsert = a[k]; 
				j = k-1; 
				reset = false;
					
				while((j >= 0) && !reset) {
					if (itemToInsert < a[j] ) {
						a[j + 1] = a[j];
						j--;
						if(j == -1)
						a[0] = itemToInsert;
					}
					else {
						reset = true;
						a[j + 1] = itemToInsert;
					}
				}
			}
			// XXX debug
			System.out.print("Sorted array: ");
			for(int l = 0; l < a.length; ++l) {
				System.out.print(a[l]+ " ");
			}
			return a;
	}
	
	public static int recursiveBinary(int[] a, int low, int high, int numIn) {						
		if(low == numIn) {
			return index;
		}
		
		//Find mid point
		
		
		//is value at mid equal to target
		//return mid
		
		//is it greater?
		//recursively call function but with low and mid-1 for high
		
		//is it less
		//recursively call function but with mid+1 for low and high
		
		++index;
		return recursiveBinary(a, low+1, high, numIn, index);
	}
	
	public static void main(String[] args) {
		int[] OriginalArray = {4,10,6,1,8,10,9,12,14,6,15,6,7,10,8,2,7,3,9,1};
		int index = 0;
		
		System.out.println("Input number to search: ");
		int numIn = input.nextInt();
		
		int[] newArray = insertionSort(OriginalArray);
		int output = recursiveBinary(newArray, 0, newArray.length-1, numIn, index); // new sorted array put into recursive search 
		
		System.out.println("\n\n" + output);
	}
}