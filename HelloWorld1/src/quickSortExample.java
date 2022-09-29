
public class quickSortExample {

	public static void main(String[] args) {
		int[] array = {808, 420, 616, 741, 555, 556}; // input array unsorted
		quickSort(array, 0, array.length - 1); // call quicksort function
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}

	public static void quickSort(int[] array, int begin, int end) {
		if (begin < end) {
			int pivot = partition(array, begin, end); // setting pivot point to correct location per function below
			
			quickSort(array, begin, pivot - 1); // sorted elements in 'less than' partition
			quickSort(array, pivot + 1, end); // sorted elements in 'greater than' partition
		}
	}
	
	public static int partition(int[] array, int begin, int end) { // recursively sort partitions on each side of pivot
		int pivot = array[end]; // pivot point assigned to final element
		int i = (begin - 1); // start search from first element
		
		for (int j = begin; j < end; j++) { 
			if (array[j] <= pivot) {
				i++;
				
				int swap = array[i]; // temp variable to change element positions
				array[i] = array[j]; 
				array[j] = swap; // j moves backward to the spot before i because it's smaller
			}
		}
		
		int swap = array[end]; // move elements greater than pivot to the next position
		array[end] = array[i + 1];
		array[i + 1] = swap;
		
		return (i + 1);
	}
}
