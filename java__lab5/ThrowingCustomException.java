package java__lab5;
import java.util.Scanner;
//8.	Create your own exception called InvalidAgeException.
//      Write a program that throws InvalidAgeException when the provided age is below 0 or above 150. 
class InvalidAgeException extends Exception{
    public InvalidAgeException(String string){
        super(string);
    }
}   
public class ThrowingCustomException{
    static void validate(int age) throws InvalidAgeException{
        if (age<0 || age>150) {
            throw new InvalidAgeException("You do not meet the requirement");                
        }
        else{
            System.out.println("you meet the requirement");
        }
    }  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age :");
        int age=scanner.nextInt();
        try {
            validate(age);
        } catch (InvalidAgeException e) {
           System.out.println(e);
        }
        scanner.close();
    }
}