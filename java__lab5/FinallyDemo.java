package java__lab5;
//  6.	Write a program to demonstrate finally block.
public class FinallyDemo {
    public static void main(String[] args) {
        try{
            int res=10/0;
            System.out.println(res);
            }catch(ArithmeticException ae){
                System.out.println(ae);
            }
            finally{
                System.out.println("After try-catch block");
            }
        }
}
