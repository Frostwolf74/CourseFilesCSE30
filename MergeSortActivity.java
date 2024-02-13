package Activity;

import java.util.Arrays;

public class MergeSortActivity {
	public static void mergeSort(int[] numList) {
		int high = numList.length - 1;  
		int low = 0;	
		       
		int[] temp = Arrays.copyOf(numList, numList.length); // copies array into a temporary array
		 
		for (int size = 1; size <= high - low; size = 2 * size) { // while size is less than or equal to the highest element of the main array, double the size
		     for (int i = low; i < high; i += 2 * size) { // while i is less than the highest element of the main array, add double of size to i
		            int begin = i;
		            int mid = i + size - 1;
		            int end = Integer.min(i + 2 * size - 1, high);
		 
		            merge(numList, temp, begin, mid, end); // apply the array, the temporary array, the middle of the array and the end of the array to the merge sort
		       }
		  }
	}
			
	public static void merge(int[] numList, int[] temp, int start, int mid, int end) {
		 int k = start, i = start, j = mid + 1;
		 
		 // splitting into 2 parts to divide and conquer 
		       
		 while (i <= mid && j <= end) { // from the start to the middle of the array (first segment) check if the main array has an element of index i that is less than the main array of index j  
		      if(numList[i] < numList[j]) { 
		           temp[k++] = numList[i++]; // switch the places of the indexes
		        }
		      else {
		           temp[k++] = numList[j++];
		        }
		  }
	   
		  while (i < numList.length && i <= mid) { // while the index is less than the last element of the main array, switch the places of the temporary array and main array
		        temp[k++] = numList[i++]; 
		   }
		 
		   for (i = start; i <= end; i++) { // 
		        numList[i] = temp[i];
		   }
	}
	
	public static void main(String[] args) {
		int array[] = {5,3,7,8,2,1,9,4,10,6};
		
		mergeSort(array);
		
		for(int i = 0; i < array.length; ++i) {
			System.out.println(array[i]);
		}
	}
}
