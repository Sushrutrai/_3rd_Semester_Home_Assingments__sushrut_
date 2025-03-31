package java__lab3;
//5.	Write a program to demonstrate copy constructor.
public class CopyConstructor {
    int a;
    int b;
    CopyConstructor(int a,int b){
        this.a=a;
        this.b=b;
    }   
    CopyConstructor(CopyConstructor c){
        this.a=c.a;
        this.b=c.b;
    }
    void display(){
        System.out.println("a: "+a+"\nb: "+b);
    }
        public static void main(String[] args) {
            CopyConstructor a=new CopyConstructor(1,3);
            CopyConstructor b=new CopyConstructor(a);
            a.display();
            b.display();

        }
}
