package javaStack;

import java.util.Stack;

public class stackTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
        
        Stack num = new Stack();
        
        num.push(5);
        
    }
    
    class stack {
        int[] stack = new int[5];
        int top = 0;
        
        public void push(int data) {
            stack[top] = data;
            top++;
        }
    }

}
