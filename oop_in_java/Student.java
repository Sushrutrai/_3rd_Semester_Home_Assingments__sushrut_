package oop_in_java;

public class Student {
    int Id;
    String Name;
    String Address;   

    void setId(int id) {
        Id = id;
    }
    void setName(String name) {
        Name = name;
    }
    void setAddress(String address) {
        Address = address;
    }
    void setdetails(int i,String n,String a){
        Id = i;
        Name = n; 
        Address = a;
    }
    void displaydetails(){
        System.out.println(Id+ "  "+Name+"  " +Address);
    }
}

