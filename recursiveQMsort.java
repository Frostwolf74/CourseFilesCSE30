package Activity;

public class recursiveQMsort {
	public static int[] mergeSort(int[] a) {
		if (a.length <= 1) {
            return a;
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
        
        return a;
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
	
	///
	
	static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static int[] quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
        	int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }
    
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }	

	public static void main(String[] args) {
		int[] array = {5,3,7,8,2,1,9,4,10,6}, out1, out2;
		
		out1 = mergeSort(array);
		out2 = quickSort(array, 0, array.length-1);

		System.out.println("(merge)");
		
		for(int i = 0; i < array.length; ++i) {
			System.out.println(out1[i]);
		}
		
		System.out.println("\n(quick)");
		
		for(int i = 0; i < array.length; ++i) {
			System.out.println(out2[i]);
		}
	}
}