package java__lab3;

public class RecursiveSum {
    int sum(int n){
        if (n==0) {
            return 0;
        }
        else
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        RecursiveSum r1=new RecursiveSum();
        System.out.println(+r1.sum(10));
    }
}
