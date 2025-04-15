package oop_in_java.HomeTasks;

//  wap to illustrate the concept of NullPointerException & NumberFormatException.

public class Question3 {
    public static void main(String[] args) {
        try {
            String name=null;
        System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            String number="one";
        int num=Integer.parseInt(number);
        System.out.println(num);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}