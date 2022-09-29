import java.util.Scanner;
import static java.lang.Math.sqrt;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner operation = new Scanner(System.in);
			double operations[] = {1, 2, 3, 4, 5, 6, 7};
			
			System.out.println("Press 1 for addition \nPress 2 for subtraction \nPress 3 for multiplication \nPress 4 for division \nPress 5 for finding square \nPress 6 for finding square root \nPress 7 for finding reciprocal");
			
			double input = operation.nextDouble();
			
			if (input == operations[0]) {
				System.out.println("Enter the first number");
				double add1 = operation.nextDouble();
				System.out.println("Enter the second number");
				double add2 = operation.nextDouble();
				System.out.println(add1 + add2);
			}
			
				else if (input == operations[1]) {
				System.out.println("Enter the first number");
			double sub1 = operation.nextDouble();
			System.out.println("Enter the second number");
			double sub2 = operation.nextDouble();
			System.out.println(sub1 - sub2);
			}
			
				else if (input == operations[2]) {
				System.out.println("Enter the first number");
			double mult1 = operation.nextDouble();
			System.out.println("Enter the second number");
			double mult2 = operation.nextDouble();
			System.out.println(mult1 * mult2);
			}
			
				else if (input == operations[3]) {
				System.out.println("Enter the first number");
			double divi1 = operation.nextDouble();
			System.out.println("Enter the second number");
			double divi2 = operation.nextDouble();
			System.out.println(divi1 / divi2);
			}
			
				else if (input == operations[4]) {
					System.out.println("Enter the number");
				double sqr = operation.nextDouble();
				System.out.println(sqr * sqr);
				}
			
				else if (input == operations[5]) {
				System.out.println("Enter the number");
			double root = operation.nextDouble();
			System.out.println(sqrt(root));
			}
			
				else if (input == operations[6]) {
					System.out.println("Enter the number");
				double rcp = operation.nextDouble();
				System.out.println(1 / rcp);
				}
			
			
	}

}
