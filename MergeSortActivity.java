package Activity;

import java.util.Arrays;

public class MergeSortActivity {
	public static void mergeSort(int[] numList) {
		int high = numList.length - 1;  
		int low = 0;	
		       
		int[] tempArray = Arrays.copyOf(numList, numList.length); // copies array into a temporary array
		 
		for (int size = 1; size <= high - low; size = 2 * size) { // separates into segments consisting of 2 integers each
		     for (int i = low; i < high; i += 2 * size) { // builds more segments and assigns indexes to placeholder variables at key points 
		            int begin = i;
		            int mid = i + size - 1;
		            int end = Integer.min(i + 2 * size - 1, high);
		 
		            merge(numList, tempArray, begin, mid, end); // apply the array, the temporary array, the first index of the array, the middle of the array and the end of the array to the merge sort
		       }
		  }
	}
			
	public static void merge(int[] numList, int[] tempArray, int begin, int mid, int end) {
		 int k = begin, i = begin, j = mid + 1; // k and i are both set to be the beginning index while j is set to the middle  
		       
		 while (i <= mid && j <= end) { // from the start to the middle of the array (first segment) check if the main array has an element of index i that is less than the main array of index j  
		      if(numList[i] < numList[j]) { 
		           tempArray[k++] = numList[i++]; // switch places with the start 
		        }
		      else {
		           tempArray[k++] = numList[j++]; // switch places with the middle  
		        }
		  }
	   
		  while (i < numList.length && i <= mid) { // while the index is less than the last element of the main array, switch the places of the temporary array and main array
		        tempArray[k++] = numList[i++]; 
		   }
		 
		   for (i = begin; i <= end; i++) { // 
		        numList[i] = tempArray[i];
		   }
	}
	
	public static void main(String[] args) {
		int[] array = {5,3,7,8,2,1,9,4,10,6};
		
		mergeSort(array);
		
		for(int i = 0; i < array.length; ++i) {
			System.out.println(array[i]);
		}
	}
}
