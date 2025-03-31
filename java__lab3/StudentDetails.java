package java__lab3;
//4.  Create a Student class with id, name, and age instance variables.
// Use the constructor overloading concept to initialize the instance variables. 
//Write a display method to display the details of a student. 
public class StudentDetails {
    int id;
    String name;
    int age;

    StudentDetails(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    StudentDetails(){
        this.id=404;
        this.name="Unknown user";
        this.age=404;
        
    }
    void display(){
        System.out.println("ID: "+id+"  Name: "+name+"  Age: "+age);
    }
        public static void main(String[] args) {
            StudentDetails std1=new StudentDetails(1, "Smira", 18);
            StudentDetails std2=new StudentDetails();
                std1.display();
                std2.display();
        }
}
