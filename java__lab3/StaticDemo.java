package java__lab3;
//9.	Write a program to demonstrate static keyword in the instance variable, method and block.
public class StaticDemo {
    static  int count=0;
    static int a;
    String instance;
    static{
        System.out.println("this is a static method");
        a=1000;
    }
    //the static block is run before the main method
    StaticDemo(String name){
        instance=name;
        count++; 
    }
    static void show(){
        System.out.println("Count : "+count);
    } 
    void output(){
        System.out.println("This is the instance variable "+instance);
    }
    
    public static void main(String [] args){
        show();
        //static methods can be called without creating object 
        StaticDemo obj=new StaticDemo("Kumar");
        StaticDemo obj1=new StaticDemo("Kamles");
        obj.output();
        obj1.output();
        show();
        System.out.println(StaticDemo.a);
    }
}
