package oop_in_java.MId_term_prep;
class shape{
    void area(){
      
    }
}
class Triangle extends shape{
    void area(float l,float b){
        System.out.println((1.0/2)*l*b);
    }
}
public class OOPs {
 public static void main(String[] args) {
    Triangle t=new Triangle();
    t.area(1.5f,6);
 
}
}