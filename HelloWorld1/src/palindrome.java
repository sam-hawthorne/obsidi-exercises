import java.util.Scanner ;
public class palindrome {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner numberInput = new Scanner(System.in);
		System.out.println("Please enter a palindrome number");
		int num = numberInput.nextInt(); //the input number is initialized
		numberInput.close();
		int rev = 0; //the reverse number is given a temporary value
		int remainderSum = 0; //sum is needed for calculation to reverse a number
		int dummy = num; //this is to save the value of the user input -- because we manipulate the input's value in the loop
			while (num > 0) // when num is reduced to zero, the reversed number should be complete and loop concludes
			{
				rev = num % 10; //grabs the last digit -- doing this in loops pulls digits from the back one by one
				remainderSum = (remainderSum * 10) + rev; // adding the digits back in reverse order i.e. 
				num = num / 10; //removes the last digit from number so it's ready to get the remainder plucked again
				
			}
			if (dummy==remainderSum) //is the original input equal to our new reversed sum?
				System.out.println("Palindrome!");
			else
				System.out.println("Not a palindrome :(");
	}

}