<<<<<<< HEAD
package java__lab2;
import java.util.Scanner;
//8.	Write a program to check whether the user given number is positive, negative or zero.
public class CheckNum {
    public static void main(String[] args){
        try(Scanner num=new Scanner(System.in)){
            System.out.println("Enter a integer: ");
            int n=num.nextInt();
            if (n>0) {
                System.out.println(n+" is positive");
            }
            else if (n<0) {
                System.out.println(n+" is negative");
            }
            else
                System.out.println(n+" is zero");
        }

    }
}
=======
package java__lab2;
import java.util.Scanner;
//8.	Write a program to check whether the user given number is positive, negative or zero.
public class CheckNum {
    public static void main(String[] args){
        try(Scanner num=new Scanner(System.in)){
            System.out.println("Enter a integer: ");
            int n=num.nextInt();
            if (n>0) {
                System.out.println(n+" is positive");
            }
            else if (n<0) {
                System.out.println(n+" is negative");
            }
            else
                System.out.println(n+" is zero");
        }

    }
}
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
