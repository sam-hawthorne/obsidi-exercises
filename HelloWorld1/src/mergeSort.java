
public class mergeSort {
	public static void main(String[] args) { // NOTE: this is last step but needs to be moved to top
		int[] array = {21, 9, 4, 11, 88, 90, 92, 30}; // unsorted array
		sort(array, array.length); // call on function to execute sorting, note size parameter = array.length
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i] + " "); // print every value now that it's sorted
	}
	
	public static void sort (int[] array, int size) {
		if (size < 2) { // can't have an array with fewer than 2 elements
			return;
		}
		int mid = size / 2; // the midpoint of the array is half the total size
		int[] begin = new int[mid]; // first temporary array is split into the first half
		int[] end = new int[size - mid]; // second temp array is right half, where index starts at mid
		
		for (int i = 0; i < mid; i++) { // increment upper bound is mid
			begin[i] = array[i]; // temp left array values = first half values from main array
		}
		
		for (int i = mid; i < size; i++) { // increment starts from middle, upper bound is total size (end)
			end[i - mid] = array[i]; // need to subtract mid so that index 0 is equal to middle index from main array
		}
		
		sort(begin, mid); // this calls the above function 'sort' to do the same operation for our new temp array! note that size param is assigned 'mid'
		sort(end, size - mid);
		
		merge(array, begin, end, mid, size - mid); // this will call the merge function that compares our temp array elements and places them into the input array
	}
	
	public static void merge(int[] array, int[] begin, int[] end, int left, int right) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < left && j < right) { // increment until mid and end respectively from left and right arrays
			if (begin[i] <= end[j]) { // if left element is smaller than right element
				array[k++] = begin[i++]; // input array counts left array value
			}
			else {
				array[k++] = end[j++]; // input array counts right array value
			}
		} // when this is complete, left array and right array should both be sorted
		
		while (i < left) {
			array[k++] = begin[i++]; // assembling input array with sorted left values
		}
		
		while (j < right) {
			array[k++] = end[j++]; // assembling input array with sorted right values
		}
	}
	
}
