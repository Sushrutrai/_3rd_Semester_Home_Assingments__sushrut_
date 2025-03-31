package oop_in_java.MId_term_prep;

public class Objects_Understanding {
    int height;
    int width;
    int length;
    Objects_Understanding(int h,int w,int l){
        height=h;
        length=l;
        width=w;
    }
    void details(int h,int w,int l){
        height=h;
        length=l;
        width=w;
    }
    void vol(){
        System.out.println(height*length*width+" is the volume");
    }
    public static void main(String [] args){
        Objects_Understanding Obj1=new Objects_Understanding(2,2,4);
        Obj1.vol();
    }
}
