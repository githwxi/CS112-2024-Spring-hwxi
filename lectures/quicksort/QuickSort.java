import java.util.Arrays;

class QuickSort {

    private static void swap(int[] arr, int i, int j) {
	int tmp = arr[i];
	arr[i] = arr[j]; arr[j] = tmp;
	return;
    }

    private static int partition(int[] arr, int first, int last)
    {
	int pivot = arr[(first+last)/2];
	// int pivot = arr[(first + last)/2];
	int i = first - 1;
	// index going left to right
	int j = last + 1;
	// index going right to left
	while (true) {
	    do {
		i++;
	    } while (arr[i] < pivot);
	    do {
		j--;
	    } while (arr[j] > pivot);
	    if (i < j) {
		swap(arr, i, j);
	    } else {
		return j;
		// arr[j] = end of left array
	    }
	}
    }

    public static void quickSort(int[] arr) {
	// "wrapper" method
	qSort(arr, 0, arr.length - 1);
    }
    private static void qSort(int[] arr, int first, int last) {
	int split = partition(arr, first, last);
	if (first < split) {
	    // if left subarray has 2+ values
	    qSort(arr, first, split);
	    // sort it recursively!
	}
	if (last > split + 1) {
	    // if right has 2+ values
	    qSort(arr, split + 1, last);
	    // sort it!
	}
    } 

    public static void main(String[] argv) {
	System.out.println("QuickSort: main()");
	int input[] = {5,1,5,2,5};
	System.out.println("QuickSort: main: input = " + Arrays.toString(input));
	quickSort(input);
	System.out.println("QuickSort: main: input(sorted) = " + Arrays.toString(input));
	return;
    }
    
}
