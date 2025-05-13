package java__lab6;
//  2.	Write a program to get the character at the given index within the string.
public class GetFromString {
    public static void main(String[] args) {
        String string="This is a string";
        System.out.println(string.charAt(6));
        char ch[]=new char[15];
        string.getChars(5, 13, ch, 0);
        for (char c : ch) {
            System.out.print(c);
        }
    }
}
