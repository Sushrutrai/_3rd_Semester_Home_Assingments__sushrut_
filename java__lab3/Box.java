<<<<<<< HEAD
package java__lab3;
//
//1.Create a Box class with width, height and depth instance variables. Use the constructor to initialize the instance 
//variables. Write a volume() method that returns the volume of the box. Create two objects of box and volume their volumes. 
//
public class Box {
    double width;
    double height;
    double depth;
    void box_details(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    void volume(){
       double Vol=(width*height*depth);
       System.out.println("volume :"+Vol);
    }
        public static void main(String[] args) {
            Box b1=new Box();
            Box b2=new Box();
            b1.box_details(31, 22, 50);
            b1.volume();
            b2.box_details(11, 2, 5);
            b2.volume();
    }
}
=======
package java__lab3;
//
//1.Create a Box class with width, height and depth instance variables. Use the constructor to initialize the instance 
//variables. Write a volume() method that returns the volume of the box. Create two objects of box and volume their volumes. 
//
public class Box {
    double width;
    double height;
    double depth;
    void box_details(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    void volume(){
       double Vol=(width*height*depth);
       System.out.println("volume :"+Vol);
    }
        public static void main(String[] args) {
            Box b1=new Box();
            Box b2=new Box();
            b1.box_details(31, 22, 50);
            b1.volume();
            b2.box_details(11, 2, 5);
            b2.volume();
    }
}
>>>>>>> 79eedcdaf8035c8fb55deef46abdc7cdbd8a02de
