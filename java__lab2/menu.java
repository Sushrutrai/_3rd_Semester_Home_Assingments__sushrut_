<<<<<<< HEAD
package java__lab2;
//10.	Write a menu-driven program to calculate arithmetic operation like addition, subtraction, division and multiplication.
import java.util.Scanner;

public class menu {
    double n1=0;
    double n2=0;
    void question(){
        System.out.println("enter first and second number: ");
    }
    void Scan(Scanner sc){
        n1=sc.nextDouble();
        n2=sc.nextDouble();
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int choice=0;
            menu m=new menu();
            do{
                System.out.println("Menu");
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Division");
                System.out.println("5.Exit");
                choice=scan.nextInt();
                
                switch (choice) {
                    case 1:
                        m.question();
                        m.Scan(scan);
                        double sum=m.n1+m.n2;
                        System.out.println("Sum: "+sum);
                        
                        break;
                    case 2:
                        m.question();
                        m.Scan(scan);
                        double diff=m.n1-m.n2;
                        System.out.println("Difference: "+diff);
                        
                        break;
                    case 3:
                        m.question();
                        m.Scan(scan);
                        double mul=m.n1*m.n2;
                        System.out.println("Product: "+mul);
                        
                        break;
                    case 4:
                        m.question();
                        m.Scan(scan);
                        if (m.n2!=0) {
                            double div=m.n1/m.n2;
                            System.out.println("Result: "+div);
                        }
                        else
                            System.out.println("Division not possible.");
                       
                        break;   
                    case 5:
                        System.out.println("You have exited the program.");

                        break; 
                    default:
                        System.out.println("invalid");

                        break;
                }
            }while(choice!=5);
        }
    }  
=======
package java__lab2;
//10.	Write a menu-driven program to calculate arithmetic operation like addition, subtraction, division and multiplication.
import java.util.Scanner;

public class menu {
    double n1=0;
    double n2=0;
    void question(){
        System.out.println("enter first and second number: ");
    }
    void Scan(Scanner sc){
        n1=sc.nextDouble();
        n2=sc.nextDouble();
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int choice=0;
            menu m=new menu();
            do{
                System.out.println("Menu");
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Division");
                System.out.println("5.Exit");
                choice=scan.nextInt();
                
                switch (choice) {
                    case 1:
                        m.question();
                        m.Scan(scan);
                        double sum=m.n1+m.n2;
                        System.out.println("Sum: "+sum);
                        
                        break;
                    case 2:
                        m.question();
                        m.Scan(scan);
                        double diff=m.n1-m.n2;
                        System.out.println("Difference: "+diff);
                        
                        break;
                    case 3:
                        m.question();
                        m.Scan(scan);
                        double mul=m.n1*m.n2;
                        System.out.println("Product: "+mul);
                        
                        break;
                    case 4:
                        m.question();
                        m.Scan(scan);
                        if (m.n2!=0) {
                            double div=m.n1/m.n2;
                            System.out.println("Result: "+div);
                        }
                        else
                            System.out.println("Division not possible.");
                       
                        break;   
                    case 5:
                        System.out.println("You have exited the program.");

                        break; 
                    default:
                        System.out.println("invalid");

                        break;
                }
            }while(choice!=5);
        }
    }  
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
}