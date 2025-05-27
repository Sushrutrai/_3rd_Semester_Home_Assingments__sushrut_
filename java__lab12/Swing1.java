package java__lab12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//  1.	Write a swing program that takes two inputs from the user in the 
//      textfield and display the addition of the numbers in the label on the button click.
public class Swing1 {
    public static void main(String[] args){
        JFrame frame=new JFrame("First");
        JLabel label=new JLabel("Enter two integers to find sum :");
        JTextField field1=new JTextField(3);
        JTextField field2=new JTextField(3);
        JButton sum_button=new JButton("sum");
        JLabel reslabel=new JLabel();

        sum_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int n1=Integer.parseInt(field1.getText());
                int n2=Integer.parseInt(field2.getText());

                int sum=n1+n2;

                reslabel.setText("The sum is "+String.valueOf(sum));
            }
        });
        
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(field1);
        frame.add(new JLabel("+"));
        frame.add(field2);
        frame.add(sum_button);
        frame.add(reslabel);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}