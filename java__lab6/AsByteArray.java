package java__lab6;
//  3.	Write a program to get the contents of a given string as a byte array.
public class AsByteArray {
    public static void main(String[] args){
        String string="Text  ";
        byte[] b=string.getBytes();
        for (byte c : b) {
            System.out.println(c);
        }
    }
}
