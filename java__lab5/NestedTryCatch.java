package java__lab5;
//  7.	Write a program to demonstrate nested try-catch block.
public class NestedTryCatch {
    public static void main(String [] args){
        try {
            int ar[]=new int[2];
            ar[3]=9; 
            try {
                int arr[]=new int[2];
                arr[3]=9;                 
            } catch (ArithmeticException e) {
               System.out.println(e);
            }
        } catch (Exception e) {
         System.out.println(e);
        }
    }
}
