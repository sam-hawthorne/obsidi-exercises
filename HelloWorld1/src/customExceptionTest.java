import java.util.Scanner;
public class customExceptionTest {
   
    public static void main(String args[]) {
        System.out.println("Enter a file name");
        Scanner sc = new Scanner(System.in);
        String fileName;
        fileName = sc.nextLine();
        sc.close();
        try {
        TestFunction(fileName);
        }
        catch (FileExtensionException e) {
            System.out.println(e);
        }
    }

        static void TestFunction(String fileName) throws FileExtensionException {
            if (fileName.endsWith(".txt")) {
                System.out.println("Good");
            }
            else {
            throw new FileExtensionException("File doesn't have .txt extension");
            }
        }
    }

class FileExtensionException extends Exception {
    public FileExtensionException(String message) {
        super(message);
    }
}