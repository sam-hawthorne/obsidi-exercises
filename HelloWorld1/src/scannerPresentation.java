import java.util.Scanner; // import the Scanner package in one step
public class scannerPresentation {

	public static void main(String[] args) {
		String bootcamp; // declare variable of the type you want user to input
		String obsidi = "Obsidi";
		Scanner sc = new Scanner(System.in); // declare scanner
		System.out.println("What bootcamp are you enrolled in?"); // prompt user for input
		bootcamp = sc.nextLine(); // user initializes both the variable and the scanner
		sc.close();
			if (bootcamp.equals(obsidi))
				System.out.println("Obsidi Academy is the best bootcamp ever!");
			else
			{
				System.out.println("Yikes.");
			}
			
	}

}
