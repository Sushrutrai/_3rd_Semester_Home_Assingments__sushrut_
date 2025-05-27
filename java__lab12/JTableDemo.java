package java__lab12;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

//  12. Write a swing program to demonstrate JTable for displaying data in tabular format.
public class JTableDemo {
    public static void main(String[]args){
        JFrame frame=new JFrame("Demo");
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table=new JTable();
        table.addColumn(new TableColumn(0));
        table.setVisible(true);
        table.setSize(1000,400);
        frame.add(table);
    }
}
