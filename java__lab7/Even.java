package java__lab7;
//2.	Write a program to create a thread by using Thread class that displays even numbers from 1 to 10.
public class Even extends Thread{
    public void run(){
        System.out.println("The even numbers are ");
        for (int i = 0; i <= 10; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Even even=new Even();
        even.start();
    }
}
