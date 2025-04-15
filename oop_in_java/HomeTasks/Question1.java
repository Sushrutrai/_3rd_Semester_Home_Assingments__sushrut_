package oop_in_java.HomeTasks;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


//  wap to write 3 student information (roll,name,address,college) into file student.txt & 
//  display the student information whose address is jhapa.

class Scholars implements Serializable{
    int roll;
    String name;
    String address;
    String college;
    Scholars(int roll,String name,String address,String college){
        this.roll=roll;
        this.name=name;
        this.address=address;
        this.college=college;
    }
}
public class Question1 {
    public static void main(String[] args){
        try {
            ObjectOutputStream writefile=new ObjectOutputStream(new FileOutputStream("D:\\College_ko\\student.txt"));
            Scholars s1=new Scholars(1, "Kritik", "Patan", "NCIT");
            Scholars s2=new Scholars(2, "Ayusha", "Kathmandu", "NCIT");
            Scholars s3=new Scholars(3, "Bhiman", "Jhapa", "NCIT");
            ArrayList<Scholars> scholar=new ArrayList<>();
            scholar.add(s1);
            scholar.add(s2);
            scholar.add(s3);
            writefile.writeObject(scholar);
            writefile.close();


            ObjectInputStream readfile=new ObjectInputStream(new FileInputStream("D:\\College_ko\\student.txt"));
            @SuppressWarnings("unchecked")                      //  lets the compiler know we know what we're doing
            ArrayList<Scholars> newscholar=(ArrayList<Scholars>)readfile.readObject();
            int found=0;
            for (Scholars scholars : newscholar) {
                if (scholars.address.equals("Jhapa")) {
                    System.out.println("roll : "+scholars.roll+" name : "+scholars.name+" address : "+scholars.address+" college : "+scholars.college);
                    found=1;
                }
            }
            if (found==0) {
                System.out.println("not found");
            }
            readfile.close();
        } catch (IOException | ClassNotFoundException ie) {
           System.out.println("exception caught:"+ie);
        }
    }
}