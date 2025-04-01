package java__lab4;
//6.	Write an interface called Area with methods circle() and square(). 
//Write a class called ShapeArea that implements the interface Area and display the area of circle and square.
public interface Area {
    void circle(double n);
    void square(double n);
    //- **Circle:** \( A = \pi r^2 \) (where \( r \) is the radius)  
    //**Square:** \( A = s^2 \) (where \( s \) is the side length)
}
    class ShapeArea implements Area{
        static double pi=3.14;
        public void circle(double r) {
            double A=pi*(r*r);
            System.out.println("Area of circle "+A);
        }
        public void square(double n) {
            double A=n*n;
            System.out.println("Area of square "+A);       
        }
        public static void main(String[] args){
            Area obj=new ShapeArea();
            obj.circle(3.45);
            obj.square(45);
        }
    }

