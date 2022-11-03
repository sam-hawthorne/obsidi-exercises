import java.util.Scanner;
public class customException {
    
    public static void main() {
        System.out.println("Enter a file name");
        Scanner sc = new Scanner(System.in);
        String fileName;
        fileName = sc.nextLine();
        TestFunction();
    }

    class FileExtensionException extends Exception {
        public FileExtensionException(String message) {
            super(message);
        }
    }

    public class TestCustomException throws FileExtensionException {
        public void TestFunction() {
        if (fileName.endsWith(".txt")) {
            System.out.println("Good");
        }
        System.out.println("Bad!");
    }
    } 
}
