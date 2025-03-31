<<<<<<< HEAD
package java__lab3;
//*10. Write a program to demonstrate static nested class.
public class StaticNestedDemo {
    static int a=5;
    static class StaticInner{
        void message(){
            System.out.println("insde the inner class");
            System.out.println("a: "+a);
        }
    }
        public static void main(String[] args){
            StaticInner object=new StaticInner();
                object.message();
        }
}
=======
package java__lab3;
//*10. Write a program to demonstrate static nested class.
public class StaticNestedDemo {
    static int a=5;
    static class StaticInner{
        void message(){
            System.out.println("insde the inner class");
            System.out.println("a: "+a);
        }
    }
        public static void main(String[] args){
            StaticInner object=new StaticInner();
                object.message();
        }
}
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
