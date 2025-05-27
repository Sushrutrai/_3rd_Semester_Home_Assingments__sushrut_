package java__lab9;

import java.util.Stack;

//  5.	Write a program that shows the stack implementation using Stack class.
public class StackDemo {
    public static void main(String[]args){
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
