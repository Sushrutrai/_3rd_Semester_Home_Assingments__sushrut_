package java__lab6;
import java.util.Scanner;
//  8.	Write a program to find if the given string is palindrome or not.
public class CheckPalindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String text=scanner.nextLine();
        StringBuffer string=new StringBuffer(text);
        string.reverse();
        if (text.equals(string.toString())) {
            System.out.println("String is palindrome.");
        }else{
            System.out.println("Not a palindrome.");
        }
        scanner.close();
    }
}
