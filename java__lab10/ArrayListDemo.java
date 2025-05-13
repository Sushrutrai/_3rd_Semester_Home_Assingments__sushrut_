package java__lab10;

import java.util.ArrayList;

//  2.	Write a program to create an ArrayList and illustrate its various methods.
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String> alist=new ArrayList<>();
        alist.add("Shiva");
        alist.add("Jwala");
        alist.addAll(alist);
        System.out.println(alist);
        if (alist.contains("Jwala")) {
            alist.remove("Jwala");
            System.out.println("Removed from the list");

            System.out.println(alist);
        }else{
            System.out.println("Not in the list");
        }
        System.out.println(alist.get(1));
        alist.clear();
       System.out.println( alist.size());
    }
}