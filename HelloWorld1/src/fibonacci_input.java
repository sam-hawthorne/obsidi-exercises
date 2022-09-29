import java.util.Scanner;
public class fibonacci_input {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		int n;
			System.out.println("How many elements would you like in your Fibonacci sequence?");
			n = myObj.nextInt();
			myObj.close();
				if (n < 0)
					System.out.println("Positive numbers only!");
				else 
					System.out.println("Your Fibonacci sequence with " + n + " elements is:");
					 for (int i = 1; i <= n; ++i)
						{ 
							System.out.print(num1 + " ");
							int num3 = num1 + num2;
							num1 = num2;
							num2 = num3;
						}

			}
}
