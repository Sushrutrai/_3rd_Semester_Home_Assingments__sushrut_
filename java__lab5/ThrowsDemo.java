package java__lab5;
//  5.	Write a program to demonstrate throws keyword.
public class ThrowsDemo {
    static void check(int num) throws Exception{
        int n=0;
        int res=num/n;
        System.out.println(res);
    }
    public static void main(String []args){
      try{
        check(90);
      }catch(Exception e){
        System.out.println(e);
      }
    }
}
