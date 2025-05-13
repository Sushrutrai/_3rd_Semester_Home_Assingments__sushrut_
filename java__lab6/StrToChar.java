package java__lab6;
//  5.	Write a program to convert string to character array.
public class StrToChar {
    public static void main(String[] args){
        String string="Life";
        char ch[]=string.toCharArray();
        for (char c : ch) {
            System.out.print(c);
        }
    }
}
