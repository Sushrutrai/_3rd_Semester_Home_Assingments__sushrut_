package java__lab10;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args){
    TreeSet<Integer> treeSet=new TreeSet<>();
    treeSet.add(190);
    treeSet.add(140);
    treeSet.add(140);
    treeSet.add(120);
    treeSet.add(100);
    treeSet.add(130);
        Iterator<Integer> iterate=treeSet.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
        System.out.println(treeSet.contains(200));
        treeSet.clear();
    }
}
