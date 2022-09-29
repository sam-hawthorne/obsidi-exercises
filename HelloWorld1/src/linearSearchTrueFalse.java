public class linearSearchTrueFalse {
	public static boolean arrayTrueFalse(int[] values, int target) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] == target)
			{
			return true;
			}
		}
			return false;
		}
	
	public static void main (String[] args) {
		int[] array = {21, 4, 88, 11, 7, 90};
		System.out.println(arrayTrueFalse(array, 11));
		System.out.println(arrayTrueFalse(array, 22));
	}
}
