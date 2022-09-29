import java.util.Arrays;
import java.util.Random;

public class Main {
	
public void Start(){
        
        boolean foundkey;
        int sizeOfArray = 10;
        int[] Array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 2;

        Arrays.sort(Array);

        //sort array
        //foundkey = binarySearch(Array,sizeOfArray,key, key);

        //Print values in array after sort
       // System.out.println(foundkey);

    }

    boolean binarySearch(int[] array, int size, int key){
        int first = 0;
        int last = size - 1;
        	while (first <= last)
        	{
        		int mid = (first + last) /2;
        			if (key < array[mid])
        			{
        				last = mid - 1;
        				return binarySearch(array, mid - 1, key);
        	}
        	else if (key > array[mid])
        	{
        		first = mid + 1;
        	}
        	else 
        	{
        	System.out.println(mid);
        	return true;
        				
        }

        	}
			return false;

    }
    
       public static void main(String[] args) {
        Main main = new Main();
        main.Start();
       }
}