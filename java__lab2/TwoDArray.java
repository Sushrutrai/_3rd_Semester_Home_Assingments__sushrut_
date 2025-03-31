package java__lab2;
//12.	Write a program to demonstrate two dimensional array using enhanced for loop.
public class TwoDArray {
    public static void main(String[] args){
        int [][]arr={{12,42},{88,45}};
            for(int []i: arr){
                for(int j: i){
                    System.out.print(j+" ");
                }
                System.out.println();
        }
    }
}
