package java___lab1;

public class SumArray {
    public static void main(String[] arg){
        int[] arr={12,442,44,5,6,7};
        int sum=0;
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
            } 
            System.out.println("The sum of given array is "+sum);
    }
}
