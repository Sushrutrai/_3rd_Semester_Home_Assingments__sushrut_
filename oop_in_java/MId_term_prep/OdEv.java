package oop_in_java.MId_term_prep;

public class OdEv {
    void check(int n){
        if (n%2==0){
            System.out.println("even");
        }
        else
        System.out.println("Odd");
    }
    void checker(int m){
        if (m<0) {
            System.out.println("negative");
        }
        else if (m>0) {
            System.out.println("POsitive");
        }
        else
            System.out.println("zero");
    }
    public static void main(String[]args){
        OdEv number=new OdEv();
        number.check(5);
        number.check(90);
        number.checker(50);
        number.checker(-3);
        number.checker(0);
        int[][] arr={{1,2,3,4,5,6,7,8},{4,10}};
        int sum=0;
        for(int ar[]:arr){
            for(int art:ar){
                sum+=art;
                System.out.print(art+" ");
            }
            System.out.println();
        }
        System.out.println(+sum);
    }
}
