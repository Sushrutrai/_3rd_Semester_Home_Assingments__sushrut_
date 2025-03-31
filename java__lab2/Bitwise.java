package java__lab2;
//3.	Write a program to demonstrate all bitwise and shift operators.
public class Bitwise {
    public static void main(String[] args){
        int a=10;
        int b=3;
        int y;
        y=a&b;
        System.out.println(y);
        y=a|b;
        System.out.println(y);
        y=a^b;
        System.out.println(y);
        y=~a;
        System.out.println(y);
        System.out.println(a<<2);
        System.out.println(a>>2);
        System.out.println(a>>>2);
    } 
}
