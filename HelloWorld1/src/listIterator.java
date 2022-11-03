import java.util.*;
public class listIterator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> newList = new ArrayList<String>();
        
        newList.add("Mango");
        newList.add("Apple");
        newList.add("Banana");
        newList.add("Orange");
        
        System.out.println("List: " + newList);
        
        ListIterator<String> it = newList.listIterator();
        
        while (it.hasNext()) {
            System.out.println("Value at " + it.nextIndex() + " is " + it.next());
        }
    }
    

}
