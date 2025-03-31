package oop_in_java;

public class cont {
    public static void main(String[] args){
    for(int i=0;i<10;i++){
        System.out.println(+i);
        if(i==2){
            continue;
        }
        System.out.println("Not execute on iteration 2");

        }
    }
}
