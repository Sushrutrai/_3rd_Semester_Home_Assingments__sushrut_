package java__lab5;
//  4.	Write a program that throws ArithmeticException and handle using try handle try-catch block
public class HandleArithmeticException {
    public static void main(String[] args) {
    try{
        int res=10/0;
        System.out.println(res);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }
}
