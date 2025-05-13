package java__lab7;
//  3.	Write a program to set and get priorities of threads.
public class Priorities {
    public static void main(String[] args){
        Thread t1=new Thread("first");
        t1.setPriority(2);
        System.out.println("priority fo thread is "+t1.getPriority());
        t1.start();
    }
}
