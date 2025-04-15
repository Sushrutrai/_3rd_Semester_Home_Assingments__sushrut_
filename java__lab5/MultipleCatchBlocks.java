package java__lab5;
//  2.	Write a program to demonstrate multiple catch blocks.

public class MultipleCatchBlocks {
    public static void main(String []args){
        try {
            int arr[]=new int[2];
            arr[10]=10/2;
            int n=10/0;       
        } catch (ArithmeticException e) {
           System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("after multiple catch blocks");
    }
}