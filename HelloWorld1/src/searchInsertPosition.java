
public class searchInsertPosition {

	public static int searchInsertPositions (int[] nums, int target) { //note that target variable is declared in the method arguments
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target)
				return i;
		}
	return 0;
	}
	public static void main (String[] args) {
	    int[] array = {1, 9, 12, 30, 36};
	    System.out.println(searchInsertPositions(array, 10)); // the number at the end corresponds to the targets variable because that's what we declared in the array method arguments
	}  // note that the above line prints literally the integer method with our new array and target set to the method arguments
}