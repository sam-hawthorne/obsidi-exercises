import java.util.Scanner;
import java.util.Random;
public class guessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Guess a number from 0-100");
		int guess = sc.nextInt();
		int answer = random.nextInt(100);
		while (guess != answer) {
			if (guess < answer) {
				System.out.println("Too low! Try again");
				guess = sc.nextInt();
			}
			else if (guess > answer) {
				System.out.println("Too high! Try again");
				guess = sc.nextInt();
			}
			
			}	
		System.out.println("Perfect! You got it right!");
		sc.close();
	}
}
