package java__lab4;
//3.Create a parent class called Staff with instance variables id, name and address. 
//Create a class called Teacher that inherits the Staff class. Demonstrate the concept of method overriding.
public class DemoMethodOverloading {
    public static void main(String[] arg){
        Teacher hire=new Teacher(1,"Hira","ktm","Dept.Head");
        hire.display();
        Staff hire1=new Staff(2,"Mohit","Pkr");
        hire1.display();
    }
}
