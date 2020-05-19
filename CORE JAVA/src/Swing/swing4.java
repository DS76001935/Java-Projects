package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swing4 extends JFrame
{
    Container con;
    JButton b1,b2,b3;
    JLabel l1;    
    public swing4()
    {
        con=getContentPane();
        b1=new JButton("RED COLOR");
        b2=new JButton("GREEN COLOR");
        b3=new JButton("BLUE COLOR");
        l1=new JLabel();
        setTitle("JButton Demo");
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        con.add(b1);
        con.add(b2);
        con.add(b3);
        con.add(l1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                l1.setText("RED COLOR");
                l1.setOpaque(true);
                l1.setBackground(Color.red);
            }
        }
        );
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                l1.setText("GREEN COLOR");
                l1.setOpaque(true);
                l1.setBackground(Color.green);
            }
        }
        );
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                l1.setText("BLUE COLOR");
                l1.setOpaque(true);
                l1.setBackground(Color.blue);
            }
        }
        );
    }
    public static void main(String args[])
    {
        new swing4();
    }
}