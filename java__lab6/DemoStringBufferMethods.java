package java__lab6;
//  7.	Write a program to demonstrate methods length(), capacity(), append(), insert(), reverse(), delete(), deleteCharAt(), and replace() of StringBuffer.
public class DemoStringBufferMethods {
    public static void main(String[] args){
        StringBuffer string=new StringBuffer("   This is a string ");
        System.out.println("The length of the string is "+string.length());
        System.out.println("The capacity is "+string.capacity());
        System.out.println(string.append(" buffer"));
        System.out.println(string.insert(19, "example "));
        System.out.println(string.reverse());
        System.out.println(string.reverse());
        System.out.println(string.delete(19, 26));
        System.out.println(string.deleteCharAt(21));
        System.out.println(string.replace(0, 3, "Now "));
    }
}
