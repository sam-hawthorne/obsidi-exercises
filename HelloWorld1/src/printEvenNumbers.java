
public class printEvenNumbers {
	public static void main(String[] args) {
		
		int evenNum = 1;
		int max = 100;
		System.out.println("The even numbers from 0 to " +max+ " are: ");
		while (evenNum <= max)
		{
			if ((evenNum) % 2 == 0)
				System.out.print(evenNum + " ");
				evenNum = evenNum + 1;
		}
	
	}
	
}