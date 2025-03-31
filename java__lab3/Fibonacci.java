package java__lab3;
//8.  Write a program to calculate the nth number in the Fibonacci sequence using recursion.
public class Fibonacci {
    int fibo(int n){
        if (n==0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Fibonacci f1=new Fibonacci();
        System.out.println(+f1.fibo(32));
    }
}
