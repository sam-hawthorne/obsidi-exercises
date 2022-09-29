import java.util.Random;
public class printingRandomNumber {

		public static void main(String[] args) {
			Random random = new Random();
			System.out.println("Here's your random number:");
			int rand = random.nextInt();
			System.out.println(rand);
	
		}
}
