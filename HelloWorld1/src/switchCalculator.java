import java.util.Scanner;
public class switchCalculator {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int x = sc.nextInt();
	int y = sc.nextInt();
	System.out.println("Enter an operator: \n 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division");
	int operator = sc.nextInt();
	sc.close();
	    switch (operator) {
	        case 1:
	        System.out.println(x + " + " + y + " is: " + (x + y));
	        break;
	
	        case 2:
	        System.out.println(x + " - " + y + " is: " + (x - y));
	        break;
	
	        case 3:
	        System.out.println(x + " * " + y + " is: " + (x * y));
	        break;
	
	        case 4:
	        System.out.println(x + " / " + y + " is: " + (x / y));
	
	        default:
	        System.out.println("Invalid input");
	    }
	}

}