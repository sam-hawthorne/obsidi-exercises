import java.util.Scanner;
public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = inputNumber.nextInt();
		inputNumber.close();
		int r = 0;
		int sum = 0;
		
		while (num > 0)
		{
			
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
			System.out.println(sum);
	}

}
