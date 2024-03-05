package Activity;

import java.util.Scanner;

public class RecursiveSearchAssignment {
	static Scanner input = new Scanner(System.in);
	
	static int[] insertionSort(int[] a) { // array sorter
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
		return a;
	}
	
	public static int recursiveBinary(int[] a, int low, int high, int numIn) {
		int mid = 0;
		int count = 0;
		
		while(low <= high) {
			
			//Find mid point
			mid = (low + high)/2; 
			
			//is value at mid equal to target
			//return mid
			//index++;
			if(a[mid] == numIn) { 
				++count; // keeps track of number instances

				for(int k = mid+1; k <= a.length-1; ++k) { 
					if(a[k] == numIn)
						count++;
				}
				for(int k = mid-1; k > -1; --k) { 
					if(a[k] == numIn)
						count++;
				}
				return count;
			}
			
			//is it greater?
			//recursively call function but with low and mid-1 for high
			else if(a[mid] > numIn) {
				return recursiveBinary(a, low, mid-1, numIn);
			}
			
			//is it less
			//recursively call function but with mid+1 for low and high
			else {
				recursiveBinary(a, mid+1, high, numIn);
			}
		}
		return 0;	
	}
	
	public static void main(String[] args) {
		int[] OriginalArray = {4,10,6,1,8,10,9,12,14,6,15,6,7,10,8,2,7,3,9,1};
		
		System.out.println("Input number to search: "); // input target number
		int numIn = input.nextInt();
		
		int[] sortedArray = insertionSort(OriginalArray);
		int count = recursiveBinary(sortedArray, 0, sortedArray.length-1, numIn); // new sorted array put into recursive binary search then a count is returned
										// a    low		high	         target
		System.out.println("\n\nThere are " + count + " instances of this number in the array");
	}
}