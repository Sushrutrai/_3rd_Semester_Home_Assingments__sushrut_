package oop_in_java;

public class sus implements Demooo1 {
     
    public static void main(String[]args){
        System.out.println("hi,it's me.");
        sus obj = new sus();
        obj.display();
        obj.show();
    }
    @Override
    public void display() {
        System.out.println("Display method implemented in the class.");
    }
} 