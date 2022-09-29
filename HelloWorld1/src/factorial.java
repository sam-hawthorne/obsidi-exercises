import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner factorialInput = new Scanner(System.in);
		long num1 = 1;
		long next = 1;
		long factorial = 1;
		System.out.println("Please enter a number:");
		
		num1 = factorialInput.nextLong();
		
		if (num1 < 0)
			System.out.println("Don't enter a negative number, silly!");
		
		else {

		for (next = 1; next <= num1; next++) 
		
			factorial = factorial*next;
		
		System.out.println("The factorial of your number is " + factorial);
		}
	}

}
