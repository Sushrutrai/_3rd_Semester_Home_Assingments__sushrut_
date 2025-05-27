package java__lab12;

import java.awt.*;
import javax.swing.*;

//  3.	Write a swing program to demonstrate GridLayout.
public class GridLayoutDemo {
    public static void main(String[]args){
        JFrame frame=new JFrame("Second");
        JButton label=new JButton("1");
        JButton label1=new JButton("2");
        JButton label2=new JButton("3");
        JButton label3=new JButton("4");
        
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.setLayout(new GridLayout(2,2));
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
