import java.util.Scanner; // imported Scanner class cmd + shift + O

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1, 2, 3, 4, 5");
		int var1 = 12;
		int var2 = 30;
		int var3;
		var3 = 12 + 30;
		String name = "Sam";
		System.out.println("The sum is: " +var3);
		System.out.println(name);
		
		int[] test = new int [6];
		test[0] = 1;
		test[1]	= 2;
		test[2]	= 3;
		test[3]	= 4;
		test[4]	= 5;
		test[5] = 6;
		
		System.out.println(test.length);
		// declared scanner and declared number variable
		Scanner myObj = new Scanner(System.in);
		int num;
		
		System.out.println("Please enter a number:");
		num = myObj.nextInt(); // initialized number variable with user input
		
		if (num > 0) {
			System.out.println("The number is: " + num);
		}
		else {
			System.out.println("The number is negative");
		}
	}
}
