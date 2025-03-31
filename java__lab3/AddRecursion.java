package java__lab3;
// 7.  Write a program that calculates the sum of the first 10 numbers using recursion.
public class AddRecursion {
    int add1(int n){
        if (n==0) {
            return 0;
        }
        else
            return n+add1(n-1);
    }
        public static void main(String[] args) {
                AddRecursion a1=new AddRecursion();
                   System.out.println("obj sum is: "+ a1.add1(10));
        }
}
