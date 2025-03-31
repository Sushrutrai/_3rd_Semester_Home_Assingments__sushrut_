package oop_in_java;
class Teacher extends Staff{
    String post;
        Teacher(int id,String name,String address,String post){
            super(id, name, address);
            this.post=post;
        }
        void display(){
            System.out.println("Id: "+id+"  Name: "+name+"  Address: "+address+"  Post: "+post);
        }


}
