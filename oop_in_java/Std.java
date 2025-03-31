package oop_in_java;

public class Std {
    int Id;
    String Name;
    String Address;
        Std(int i,String n,String a){
            Id=i;
            Name=n;
            Address=a;
        }    
        void Display(){
            System.out.println(Id+" "+Name+" "+Address);
        }
}
