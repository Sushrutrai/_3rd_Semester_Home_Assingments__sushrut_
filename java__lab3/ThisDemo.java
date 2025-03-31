package java__lab3;
//2.	Write a program to demonstrate this keyword.
public class ThisDemo {
    double num1;
    double num2;
        double sum(double num1,double num2){
            this.num1=num1;
            this.num2=num2;
                return this.num1+this.num2;
        }
        public static void main(String [] args){
            ThisDemo obj=new ThisDemo();
            System.out.println("Result of operation:"+obj.sum(33.34, 44.5354));
            ThisDemo obj1=new ThisDemo();
            System.out.println("Result of operation:"+obj1.sum(33, 44));
        }
}
