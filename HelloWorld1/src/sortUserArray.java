import java.util.Arrays;
import java.util.Scanner;
public class sortUserArray {

    public static void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++)
        	{
         int temp = elements[i];
         int possibleIndex = i;
         
         while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
        	 
         	{
            elements[possibleIndex] = elements[possibleIndex - 1];
            possibleIndex--;
         	}
         	elements[possibleIndex] = temp;  
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want in your array?");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Please enter " + n + " numbers");
	        for(int i=0; i<n; i++)  
	            {  
	            array[i]=sc.nextInt();  
	            }  
	        
        sc.close();
        
        System.out.println("Here is your array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Here is your array in ascending order:");
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

}