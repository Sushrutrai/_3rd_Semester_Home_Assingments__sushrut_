package java__lab4;
//4.	Write an abstract class named Shape with draw() abstract method. 
//      Create Rectangle and Square class that uses the abstract class Shape. 
abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing Retangle....");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Square....");
    }
}
public class UsesShape{
    public static void main(String [] args){
        UsesShape obj=new UsesShape();
        Shape o=new Rectangle();
        o.draw();
    }
}