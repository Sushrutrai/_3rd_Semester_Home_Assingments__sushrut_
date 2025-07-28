package oop_in_java;

public interface Demooo1 {
        void display();
        default void show() {
            System.out.println("This is a default method in the interface.");
        }
}
