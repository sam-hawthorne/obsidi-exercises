import java.util.Scanner;
public class printDiamond {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for diamond pattern");
        int rows = sc.nextInt();
        int space = rows - 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < space; j++) 
            	System.out.print(" ");
            
            for (int j = 0; j <= i; j++) 
            	System.out.print("* ");
            	System.out.print("\n");
            	space--;
            
    
        }
        
        space = 0;
        for (int i = rows; i > 0; i--) {
        	for (int j = 0; j < space; j++) 
        		System.out.print(" ");
        	
        	for (int j = 0; j < i; j++) 
        		System.out.print("* ");
        		System.out.print("\n");
        		space++;
        	
        }
        sc.close();
	}

}
