package Activity;

public class sortingActivity {
	public static void BubbleSort(int a[]) {
		boolean loopSomeMore;
		do{
			loopSomeMore = false; // sets loop to false
			for(int j = 0; j < a.length -1; j++) { // checks when j is less than the length of the array 'a', if true, add 1 to j
				if(a[j] < a[j+1]) { // check when the array 'a' of j is greater than the next slot in the array then sorts it down if true
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					loopSomeMore = true; // sets loop to true since it needs to check again if there are more unsorted numbers
				}
			}
		}while(loopSomeMore);
	}
	
	public static void InsertionSort(int a[]) { // TODO sort backwards
		int itemToInsert, j;
		boolean keepGoing;
		
		for(int k = 1; k < a.length; k++) {
			itemToInsert = a[k]; // sets the inserted variable to the be the second index of the array
			j = k-1; // sets the next index variable to correlate with the for loop but starting at 0
			keepGoing = true;
			
			while((j >= 0) && keepGoing) {
				if (itemToInsert > a[j] ) { // checks if the inserted variable (the one directly in front of the selected array element) is less than the selected array element, if true when swap them
					a[j + 1] = a[j];
					j--;
					if(j == -1)
					a[0] = itemToInsert;
				}
				else { // moves the inserted variable up by 1
					keepGoing = false;
					a[j + 1] = itemToInsert;
				}
			}
		}
	}
	
	public static void SelectionSort(int a[]) { // TODO sort backwards
		int min, minIndex;
		
		for(int i = 0; i < a.length; ++i) {
			min = a[i]; // [first pass, i = 0] the minimum is set to the first element of the array 
			minIndex = i; // the index of the first element is saved 
			
			for (int j = i + 1; j < a.length; ++j) { // the secondary index is set equal to the index directly in front of the current index 
				if (a[j] > min) { // the element directly in front of the index i is compared to min, if it is less than min, min will be set to that array index value
					min = a[j];
					minIndex = j;
				}
			}
			
			a[minIndex] = a[i]; // the array of the min index is set to the array of the index i
			a[i] = min;
		}
	}
	
	public static void main(String[] args) {
		int i=0;
		int array[] = {5,3,7,8,2,1,9,4,10,6};
		BubbleSort(array);
		
		System.out.println("\nBubble sort: \n");
		
		for(i = 0; i < array.length; ++i) {
			System.out.println(array[i]);
		}
		
		///////
		
		int array2[] = {5,3,7,8,2,1,9,4,10,6};
		InsertionSort(array2);
		
		System.out.println("\nInsertion sort: \n");
		
		for(i = 0; i < array2.length; ++i) {
			System.out.println(array2[i]);
		}
		
		///////
		
		int array3[] = {5,3,7,8,2,1,9,4,10,6};
		SelectionSort(array3);
		
		System.out.println("\nSelection sort: \n");
		
		for(i = 0; i < array3.length; ++i) {
			System.out.println(array3[i]);
		}
	}
}