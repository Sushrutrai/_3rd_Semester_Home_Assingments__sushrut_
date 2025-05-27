package java__lab9;

import java.util.Vector;

//  4.	Write a program to create a vector of size 5. Insert 5 data, display them and remove the element of position 2.
public class VectorDemo {
    public static void main(String[]args){
        Vector<Integer> list=new Vector<>(5);
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
