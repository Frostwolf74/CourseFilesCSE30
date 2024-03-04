package Activity;

import java.util.Scanner;

public class IterativeSearchAssignment {
	static Scanner input = new Scanner(System.in);
	
	static void linearSearch(int[] a) {
		System.out.println("(Linear) Input a number to search: ");
		int numIn = input.nextInt();
		
		int i=0;
		boolean indexIdentified = false;
		int numAmt=0;
		
		for(i = 0; i < a.length; ++i) { // runs through and identifies matching numbers and prints each one with its respective index 
			if(numIn == a[i]) {
				System.out.printf("The number is at index %d or position %d\n", i, i+1);
				indexIdentified = true;
				++numAmt; // number of instances 
			}
		}
		
		if(i == a.length && indexIdentified == false) { // if it reaches the end of the array and no numbers have been identified
			System.out.println("That number is not in the array"); 
		}
		if(indexIdentified == true) { // if numbers have been identified, print the amount
			System.out.printf("There are %d instance(s) of this number in the array", numAmt);
		}
	}
	
	static int binarySearch(int[] a) {
		// sorting
		
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
		
		System.out.println("\n");
		for(int l = 0; l < a.length; ++l) {
			System.out.print(a[l]+ " ");
		}
		
		// binary search with sorted array
		
		System.out.println("\n\n(Binary) Input a number to search: ");
		int numIn = input.nextInt();
		
		int mid = 0;
		
		int low = 0;
		int high = a.length-1;
		int count = 0;
		while(low <= high) {
				
			mid = (low + high)/2;
				
			if(a[mid] == numIn) { // if a exact match is found, print its index
				++count; // keeps track of number instances
				
				for(int k = mid+1; k <= a.length-1; ++k) { 
					if( a[k] == numIn )
						count++;
				}
				for(int k = mid-1; k > -1; --k) { 
					if( a[k] == numIn)
						count++;
				}
				return count;
			}
				
			if(a[mid] > numIn) {
				high = mid-1; // if the target number is lower than the current index, set the middle of the array to be the highest available index effectively eliminating the upper half of the array
			}
			else {
				low = mid+1; // vice versa eliminate the lower half of the array
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		int[] OriginalArray = {4,10,6,1,8,10,9,12,14,6,15,6,7,10,8,2,7,3,9,1};
		int[] newOriginalArray = {4,10,10,6,1,8,10,9,12,14,6,15,6,7,10,8,2,7,3,9,1};
		int count;
		linearSearch(OriginalArray);
		count = binarySearch(OriginalArray);

		System.out.printf("There are %d instances of the number in the array", count);
	}
}
