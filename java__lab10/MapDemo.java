package java__lab10;

import java.util.HashMap;

//  1.	Write a program to demonstrate Map interface using HashMap class.
public class MapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "Ram");
        map.put(2, "Sonu");
        map.put(3, "Krish");
        
        for(int i=1;i<=map.size();i++){
            System.out.println(map.get(i));
        }
    }
}
