<<<<<<< HEAD
package java__lab3;
//6.Write a program to find the factorial of a given number using recursion.
public class Factorial {
    int fact(int n){
        if (n==0) {
            return 1;
        }
        else
         return n*fact(n-1);
    }
    public static void main(String[] args){
        Factorial f1=new Factorial();
        System.out.println(+f1.fact(6));
    }
}
=======
package java__lab3;
//6.Write a program to find the factorial of a given number using recursion.
public class Factorial {
    int fact(int n){
        if (n==0) {
            return 1;
        }
        else
         return n*fact(n-1);
    }
    public static void main(String[] args){
        Factorial f1=new Factorial();
        System.out.println(+f1.fact(6));
    }
}
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
