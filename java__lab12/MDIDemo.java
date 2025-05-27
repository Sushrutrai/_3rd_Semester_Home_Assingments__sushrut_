package java__lab12;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

//  13.	Write a swing program to demonstrate MDI using JDesktopPane and JInternal Frame.
public class MDIDemo {
    public static void main(String[]args){
        JFrame frame=new JFrame("Demo");
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane pane=new JDesktopPane();
        pane.setVisible(true);
        pane.setSize(600,600);
        frame.add(pane);

        JInternalFrame inner=new JInternalFrame("This is the internal Frame",true,true,true,true);
        inner.setVisible(true);
        inner.setLocation(100, 100);
        inner.setSize(300,300);
        pane.add(inner);

    }
}
