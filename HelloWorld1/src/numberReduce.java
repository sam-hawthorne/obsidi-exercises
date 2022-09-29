import java.util.Scanner;
public class numberReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = input.nextInt();
		input.close();
		int count = 0;
			while (num > 0)
				if (num % 2 == 0) // checks if the number is even
				{
					num = num/2;
					count++; //this increases the counter of steps
				}
			
				else
				{
					num = (num - 1);
					count++;
				}
		
			System.out.println("The number of steps to reduce your number to 0 is " + count);
	}

}