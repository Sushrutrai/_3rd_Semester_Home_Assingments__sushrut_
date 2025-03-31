<<<<<<< HEAD
package java__lab2;
import java.util.Scanner;
//6.	Write a program to check whether the user given number is even or odd.
public class OddEven {
    public static void main(String[] args){
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("enter integer:");
            int n=scanner.nextInt();
                if (n%2==0) {
                    System.out.println(n+" is even.");
                }
                else
                    System.out.println(n+" is odd.");
        }
    }
}
=======
package java__lab2;
import java.util.Scanner;
//6.	Write a program to check whether the user given number is even or odd.
public class OddEven {
    public static void main(String[] args){
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("enter integer:");
            int n=scanner.nextInt();
                if (n%2==0) {
                    System.out.println(n+" is even.");
                }
                else
                    System.out.println(n+" is odd.");
        }
    }
}
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
