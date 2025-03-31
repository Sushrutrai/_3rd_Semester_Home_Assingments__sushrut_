package java__lab3;
//13. Write a program to demonstrate anonymous inner class.
public class AnonymousInnerClass {
    void show(){
        System.out.println("text");
    }
    public static void main(String[] args) {
        AnonymousInnerClass a=new AnonymousInnerClass(){
            void show(){
                System.out.println("new text");
            }
        };
        a.show();
    }
}
