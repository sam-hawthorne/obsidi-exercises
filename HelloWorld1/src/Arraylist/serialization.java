package Arraylist;

import java.util.*;
import java.io.*;

public class serialization implements Serializable {

    public static void main(String[] args) throws ClassNotFoundException {
    // TODO Auto-generated method stub
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("This");
    arrayList.add("is");
    arrayList.add("Sparta");
    
    try {
       //Serialization
        FileOutputStream fileout = new FileOutputStream("/Users/samhawthorne/Desktop/Java.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(arrayList);
        out.close();
        fileout.close();
        
        System.out.println("Serialized data is saved into Java.txt");
        } 
        catch(IOException e) {
            e.printStackTrace();
        }
    
    }
    
    public class deserialization {
        
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            
            ArrayList<String> arrayList = new ArrayList<String>();
            
        try {
          //Deserialization
            FileInputStream filein = new FileInputStream("/Users/samhawthorne/Desktop/Java.txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            arrayList = (ArrayList<String>) in.readObject();
            filein.close();
            in.close();
            for (String i: arrayList) {
                System.out.println(i);
            }
            }
        catch(IOException e) {
            e.printStackTrace();
        }
        }
     }
    
}