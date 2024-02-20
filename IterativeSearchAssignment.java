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
	
	static void binarySearch(int[] a) {
		/// sorting
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
		
		/// binary search with sorted array
		
		System.out.println("\n\n(Binary) Input a number to search: ");
		int numIn = input.nextInt();
		
		int low = 0;
		int high = a.length;
		int m = 0;
		int n = 0;
		
		do {
			m = 0;
			int temp=0;
			while(low+1 < high) {
				
				temp = (low + high)/2;// move index to middle of array
				
				if(a[temp] > numIn) { // if the currently selected element is greater than the input number then set the index to the high variable, otherwise set it to the low variable
					high = temp;
				}
				else {
					low = temp;
				}
			}
			
			if(a[low] == numIn) { // if a exact match is found, print its index
				System.out.printf("The number is at index %d or position %d\n", low, low+1);
				
				//System.out.printf("The first instance of the number is at index %d or position %d\n", low, low+1);
				m++;
				n++;
				if(numIn != 0) { // need some way to add in an element to replace and eliminate a found element when identifying multiple instances of the element
					a[low] = 0;
				}
				else {
					a[low] = 1; 
				}
				for(int k = 1; k < a.length; k++) { // re-sort
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
			}
			else {
				System.out.println("\nThat number is not in the array");
			}
		}while(m == 1);
		
		System.out.printf("There is %d instances of this number in the array", n);
	}
	
	
	public static void main(String[] args) {
		int[] OriginalArray = {4,10,6,1,8,10,9,12,14,6,15,6,7,10,8,2,7,3,9,1};
		int[] newOriginalArray = {4,10,6,1,8,10,9,12,14,6,15,6,7,10,8,2,7,3,9,1};
		
		linearSearch(OriginalArray);
		binarySearch(newOriginalArray);
	}
}
