<<<<<<< HEAD
package java__lab3;
//3.Write a program called Calculate with various forms of sum method. Demonstrate the concept of method overloading.
public class MethodOverloading {
    void sum(int a,int b){
       System.out.println(+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println(+(a+b+c));
    }
    void sum(double a,double b){
       System.out.println(+(a+b));
    }
    public static void main(String[] args) {
        MethodOverloading s1=new MethodOverloading();
        s1.sum(13, 10);
        s1.sum(99.3434, 32.5);
        s1.sum(44, 6, 50);
    }
}
=======
package java__lab3;
//3.Write a program called Calculate with various forms of sum method. Demonstrate the concept of method overloading.
public class MethodOverloading {
    void sum(int a,int b){
       System.out.println(+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println(+(a+b+c));
    }
    void sum(double a,double b){
       System.out.println(+(a+b));
    }
    public static void main(String[] args) {
        MethodOverloading s1=new MethodOverloading();
        s1.sum(13, 10);
        s1.sum(99.3434, 32.5);
        s1.sum(44, 6, 50);
    }
}
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
