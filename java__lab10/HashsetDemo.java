package java__lab10;

import java.util.HashSet;
import java.util.Iterator;

//  4.	Write a program to create a HashSet and illustrate its various methods.
public class HashsetDemo {
    public static void main(String[] args){
        HashSet<String> set=new HashSet<>();
        set.add("Hira");
        set.add("Milan");
        set.add("Kritik");
        Iterator <String> it=set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        set.clear();
        System.out.println(set);
    }
}