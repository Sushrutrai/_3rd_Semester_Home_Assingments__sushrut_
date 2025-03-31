package java__lab2;
import java.util.Scanner;
//9.	Write a program to demonstrate switch case.
public class Switching {
    public static void main(String[] args){
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Enter subject(java/web/stats/sad/dsa):");
                String choice=scanner.nextLine();
                switch (choice) {
                    case "java":
                        System.out.println("Sujita Khadgi");
                        break;
                    case "web":
                        System.out.println("Tika Raj Shrestha");
                        break;
                    case "dsa":
                        System.out.println("Ramesh Singh Saud");
                        break;
                    case "sad":
                        System.out.println("Shib Kumar");
                        break;
                    case "stats":
                        System.out.println("Lila Chaudhary");
                        break;
                    default:
                        System.out.println("We don't have that subject");
                        break;
            }
        }  
    }
}
