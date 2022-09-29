import java.util.Scanner;
public class swap {

public static void main(String[] args) {
// TODO Auto-generated method stub

int temp;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int x = sc.nextInt();
System.out.println("Enter the second number:");
int y = sc.nextInt();
temp = x;
x = y;
y = temp;
System.out.println("Your numbers are now swapped!");
System.out.println(x);
System.out.println(y);
}

}
