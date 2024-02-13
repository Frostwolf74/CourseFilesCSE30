package Activity;

import java.util.Scanner;

public class IterativeSearchAssignment {
	static Scanner input = new Scanner(System.in);
	
	static void iterativeSearch(int[] a) {
		System.out.println("Input a number to search: ");
		int numIn = input.nextInt();
		int i=0;
		boolean indexIdentified = false;
		int numAmt=0;
		
		for(i = 0; i < a.length; ++i) {
			if(numIn == a[i]) {
				System.out.printf("The number is at index %d or position %d\n", i, i+1);
				indexIdentified = true;
				++numAmt;
			}
		}
		
		if(i == a.length && indexIdentified == false) {
			System.out.println("That number is not in the array");
		}
		if(indexIdentified == true) {
			System.out.printf("There are %d instance(s) of this number in the array", numAmt);
		}
	}
	
	
	public static void main(String[] args) {
		int[] OriginalArray = {4,10,6,1,8,10,9,12,14,6,15,6,7,10,8,2,7,3,9,1};
		
		iterativeSearch(OriginalArray);
	}
}
