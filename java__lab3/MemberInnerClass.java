<<<<<<< HEAD
package java__lab3;
//11. Write a program to demonstrate member inner class.
public class MemberInnerClass {
    int b=5;
    class InsideClass{
        int a=10;
        void display(){
            System.out.println("This is inside member inner class.");
            System.out.println("Sum of variables is "+(a+b));
        }
    }
    public static void main(String[] args) {
        MemberInnerClass obj=new MemberInnerClass();
        MemberInnerClass.InsideClass obj1=obj.new InsideClass();
        obj1.display();
    }
}
=======
package java__lab3;
//11. Write a program to demonstrate member inner class.
public class MemberInnerClass {
    int b=5;
    class InsideClass{
        int a=10;
        void display(){
            System.out.println("This is inside member inner class.");
            System.out.println("Sum of variables is "+(a+b));
        }
    }
    public static void main(String[] args) {
        MemberInnerClass obj=new MemberInnerClass();
        MemberInnerClass.InsideClass obj1=obj.new InsideClass();
        obj1.display();
    }
}
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
