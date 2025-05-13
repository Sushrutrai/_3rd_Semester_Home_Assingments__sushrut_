package java__lab10;

import java.util.LinkedList;

//  3.	Write a program to create a LinkedList and illustrate its various methods.
public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.addFirst(0);
        list.add(4);
        list.add(3);
        System.out.println(list);
        list.remove();
        list.removeFirst();
        list.removeLast();
        System.out.println(list);      
    }
}
