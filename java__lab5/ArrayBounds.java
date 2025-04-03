package java__lab5;
//1.	Write a program to catch ArrayIndexOutOfBoundsException.
public class ArrayBounds {
    public static void main(String[]args){
        int [] arr={1,2,2,1,4,4};
        try{
            System.out.println(arr[8]);
        }catch(Exception e){
            System.out.println("Exception caught : "+e);
        }
        System.out.println("After exception has been caught.");
    }
}