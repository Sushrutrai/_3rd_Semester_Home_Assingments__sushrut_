package oop_in_java;
import java.util.Scanner;

public class Lcm {
    void solve(int n,int m){
        int val,num;
        if (n>=m) {
            val=n;
            num=m;
        }
        else{
            val=m;
            num=n;
        }
        for(int i=1;i<=val;i++){
            int temp1=val*i;
            if (temp1%num==0) {
                System.out.println("The LCM is "+temp1);
                break;
            }
        }
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two integers to find out LCM:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        Lcm obj=new Lcm();
        obj.solve(a, b);
        scanner.close();
    }
}