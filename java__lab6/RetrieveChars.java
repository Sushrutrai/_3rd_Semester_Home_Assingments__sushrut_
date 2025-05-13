package java__lab6;
//  4.	Write a program to get more than one characters using getChars() from a string.
public class RetrieveChars {
    public static void main(String[] args){
        String string="String";
        char []ch=new char[5];
        string.getChars(0, 3, ch, 0);
        for (char c : ch) {
            System.out.print(c);
        }
    }
}
