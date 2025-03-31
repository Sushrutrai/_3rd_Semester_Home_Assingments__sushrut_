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
