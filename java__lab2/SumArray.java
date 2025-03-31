package java__lab2;
//11.	Write a program using enhanced for loop to display and sum the values of the array.
public class SumArray {
    public static void main(String[] args){
        int []arr={1,4,7,9,25};
        int sum_arr=0;
            for (int i : arr) {
                sum_arr+=i;
            }
            System.out.println(+sum_arr);
    }
}
