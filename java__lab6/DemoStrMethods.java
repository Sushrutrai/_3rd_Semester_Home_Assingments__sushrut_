package java__lab6;
//1.	Write a program to demonstrate few methods of String such as length(), compareTo(),
//   compareToIgnoreCase(), equals(), equalsIgnoreCase(), concat(), trim(), isEmpty(), toLowerCase(), and toUpperCase().
public class DemoStrMethods {
    public static void main(String[] args) {
        String text3="Hello, World";
        String text2="   Hello, World";
        String text1=new String();
        text1="HELLO, WORLD";
        System.out.println(text3.length());
        System.out.println(text3.compareTo(text1));
        System.out.println(text3.compareToIgnoreCase(text1));
        if (text3.equals(text2)) {
            System.out.println("text 3 and 2 are same");
        }
        if (text3.equalsIgnoreCase(text1)) {
            System.out.println("text 1 and 3 are same");
        }
        System.out.println(text1.concat(text2));
        System.out.println(text2.trim());
        System.out.println(text1.isEmpty());
        System.out.println(text1.toLowerCase());
        System.out.println(text3.toUpperCase());
    }
}
