package java__lab2;
//4.	Write a program to demonstrate all conditional, auto-increment and auto-decrement operators.
public class MentOptrs {
    public static void main(String[] args){
        int a=5,b=10;
        String out=a!=b?"yes":"no";
            System.out.println("result :"+out);
        int i=0;
        System.out.println("i: "+i);
        System.out.println("++i: "+ ++i);
        System.out.println("i++: "+i++);
        System.out.println("i: "+i);
        System.out.println("--i: "+ --i);
        System.out.println("i--: "+ i--);
        System.out.println("i: "+ i);
    }
}
