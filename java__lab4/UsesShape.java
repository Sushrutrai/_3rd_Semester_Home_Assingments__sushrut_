package java__lab4;
//4.	Write an abstract class named Shape with draw() abstract method. 
//      Create Rectangle and Square class that uses the abstract class Shape. 
abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing Rectangle....");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Square....");
    }
}
public class UsesShape{
    public static void main(String [] args){
        Shape square=new Square();
        Shape rectangle=new Rectangle();
        rectangle.draw();
        square.draw();
    }
}