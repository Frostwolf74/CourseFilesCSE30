package Activity;

import java.util.Scanner;

public class RecursiveSearchAssignment {
	static Scanner input = new Scanner(System.in);
	
	public static int recursiveBinary(int[] a, int low,int high) {				
		while(low+1 < high) {
			int temp = (low + high)/2;
			
			System.out.println("Input number to search: ");
			int numIn = input.nextInt();
			
			if(a[temp] > numIn) {
				return recursiveBinary(a, low, high);
			}
			else {
				return low;
			}
		}
	}
	
	public static void main(String[] args) {
		int OriginalArray[] = {4,10,6,1,8,10,9,12,14,6,15,6,7,10,8,2,7,3,9,1};
		
		recursiveBinary(OriginalArray, 0, OriginalArray.length-1); // TODO 	fix to accept returned value
	}
}