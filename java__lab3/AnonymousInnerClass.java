<<<<<<< HEAD
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
=======
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
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
