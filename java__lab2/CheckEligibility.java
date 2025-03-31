package java__lab2;
import java.util.Scanner;
/*7.	Write a program to check eligibility for Bungee Jumping at Bhotekoshi 
on the basis of the user's weight and age using 'nested if'. 90kgs 18yrs*/
public class CheckEligibility {
    public static void main(String[] args){
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("enter user weight and age:");
                int weight=scanner.nextInt();
                int age=scanner.nextInt();
                if (weight<=90) {
                    if (age>=18) {
                        System.out.println("you are eligible");
                    }
                    else
                    System.out.println("you are under the age of 18");
                    
                }
                else
                        System.out.println("your weight exceeds the limit ");
        }
    }

}
