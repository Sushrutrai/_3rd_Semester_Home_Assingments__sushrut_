package oop_in_java;
import java.util.Scanner;

public class CheckData {
    static void check(int age) throws ValidateException{
        if (age<18) {
            throw new ValidateException("You are under the required age");
        }
        else{
            System.out.println("Age is valid "+age);
        }
    }
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age to validate:");
        int age=scanner.nextInt();
        try{
            CheckData.check(age);
        }catch(ValidateException e){
            System.out.println(e);
        }
        scanner.close();
    }
}
