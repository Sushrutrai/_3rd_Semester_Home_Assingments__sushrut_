package java__lab3;
//12. Write a program to demonstrate method-local inner class.
public class MethodLocalNestedDemo {
    void message(){
        class LocalInnerClass{
            void display(){
                System.out.println("Inside local inner class");
            }
        }
        LocalInnerClass obj=new LocalInnerClass();
        obj.display();
    }
    public static void main(String[] args) {
        MethodLocalNestedDemo a=new MethodLocalNestedDemo();
        a.message();
    }
}
