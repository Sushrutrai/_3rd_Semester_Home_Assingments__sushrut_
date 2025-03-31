<<<<<<< HEAD
package oop_in_java;

public class BreakState {
    public static void main(String[] args) {
    boolean  b=true;
    first:{
        second:{
            third:{
                System.out.println("before the break");
                if (b) {
                    break second;
                    }
                    System.out.println("this won't execute");
                   
                }
                System.out.println("this won't execute");
            }
            System.out.println("This is after the second block");
        }
    }
=======
package oop_in_java;

public class BreakState {
    public static void main(String[] args) {
    boolean  b=true;
    first:{
        second:{
            third:{
                System.out.println("before the break");
                if (b) {
                    break second;
                    }
                    System.out.println("this won't execute");
                   
                }
                System.out.println("this won't execute");
            }
            System.out.println("This is after the second block");
        }
    }
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
}