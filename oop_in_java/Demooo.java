package oop_in_java;
abstract class test {
    abstract void display();
    public void show() {
        System.out.println("This is a concrete method in the abstract class.");
    }
}
public class Demooo extends test{
    void display() {
        System.out.println("Display method implemented in the class.");
    }
    public static void main(String[] args) {
      Demooo demoInstance = new Demooo();
      demoInstance.display();
      demoInstance.show();
    }
}

