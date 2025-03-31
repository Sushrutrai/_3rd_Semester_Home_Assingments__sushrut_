package java__lab2;
//13.	Write a program that iterates for 50 times but terminates the loop in the 5th iteration.
public class Terminate {
    public static void main(String[] args){
        for (int i = 0; i < 50; i++) {
            if (i==4) {
                break;
            }
                System.out.println(i+" iteration");
        }
    }
}
