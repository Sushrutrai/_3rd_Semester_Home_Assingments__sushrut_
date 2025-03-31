package oop_in_java.MId_term_prep;

public class Overload {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }
    void add(int a ,int b ,float c){
        System.out.println(a+b+c);
    }
    public static void main( String [] args){
        Overload newer=new Overload();
            newer.add(2, 04);
            newer.add(2, 04,45);
            newer.add(2, 4.56);
    }
}
