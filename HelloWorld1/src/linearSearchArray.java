
public class linearSearchArray {

	public static int linearSearchArrays (int[] values, int target) { //note that target variable is declared in the method arguments
		for (int i = 0; i < values.length; i++) {
			if (values[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main (String[] args) {
	    int[] array = {1, 9, 12, 30, 36};
	    System.out.println(linearSearchArrays(array, 10));
	    System.out.println(linearSearchArrays(array, 12));
	}  
}
