package Swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class swing3 extends JFrame implements ActionListener
{
    JButton b1;
    JLabel l1;
    Container con;
    public swing3()
    {
        con=getContentPane();
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        b1=new JButton("CHECK");
        l1=new JLabel();
        b1.addActionListener(this);
        con.add(b1);
        con.add(l1);
    }
    public void actionPerformed(ActionEvent e)
    {
        l1.setText("Hello Deep Welcome To SWING WORLD !!!");
    }
    
    public static void main(String args[])
    {
        new swing3();
    }
}