package java__lab7;
//1.	Write a program to create a thread by implementing Runnable interface that displays odd numbers from 1 to 10.
class Task implements Runnable{
    public void run(){
        System.out.println("The odd numbers are ");
        for (int i = 0; i <= 10; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
public class Odd {
    public static void main(String[] args) {
        Task task=new Task();
        Thread t1=new Thread(task);
        t1.start();
    }
}
