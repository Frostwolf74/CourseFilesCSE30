package Activity;

public class recursiveQMsort {
	public static void mergeSort(int[] a) {
		if (a.length <= 1) {
            return;
        }
		
        int mid = a.length / 2; // find mid point
        int[] leftArray = new int[mid]; // create the left side of the merge sort 
        int[] rightArray = new int[a.length - mid]; // create the right side of the merge sort
 
        System.arraycopy(a, 0, leftArray, 0, mid); // copy the input array into each side
 
        if (a.length - mid >= 0) {
            System.arraycopy(a, mid, rightArray, 0, a.length - mid);
        }
 
        mergeSort(leftArray); // sort the left side
        mergeSort(rightArray); // sort the right side
        merge(a, leftArray, rightArray); // recur until length is less than or equal to 1

	}

	public static void merge(int[] a, int[] leftArray, int[] rightArray) {
		int i=0, j=0, k=0;

		while (i < leftArray.length && j < rightArray.length) { // shift numbers in ascending or
			if (leftArray[i] <= rightArray[j]) {
				a[k++] = leftArray[i++];
			} else {
				a[k++] = rightArray[j++];
			}
		}
		while (i < leftArray.length) {
			a[k++] = leftArray[i++];
		}
		while (j < rightArray.length) {
			a[k++] = rightArray[j++];
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