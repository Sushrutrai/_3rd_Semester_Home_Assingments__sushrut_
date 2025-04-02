package java__lab4;
//1.	Write a program to demonstrate the use of super keyword to access instance variable and 
//      method of super class in the child class.
class Father{
    String last_name;
    String first_name;
    Father(String first_name,String last_name){
        this.first_name=first_name;
        this.last_name=last_name;
    }
    void display(){
        System.out.println("Name is "+first_name+" "+last_name);
    }
}
class Child extends Father{
    Child(String first_name,String last_name){
        super(first_name,last_name);
    }
}
public class SuperExample {
    public static void main(String[] args) {
        Child obj=new Child("Rames", "Majhi");
        obj.display();
    }
}
