package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class swing1 extends JFrame
{
	Container con;
		swing1()
		{
			JFrame JF1=new JFrame("Mathemetical Operations");
			con=JF1.getContentPane();
			FlowLayout FL1=new FlowLayout(FlowLayout.CENTER);
			con.setLayout(FL1);
			JButton JB1=new JButton("ADD");
			JButton JB2=new JButton("MINUS");
			JButton JB3=new JButton("PRODUCT");
			JButton JB4=new JButton("DIVIDE");
			JButton JB5=new JButton("MODULE");
			JF1.setVisible(true);
			JF1.setSize(1000,1000);
			con.add(JB1);
			con.add(JB2);
			con.add(JB3);
			con.add(JB4);
			con.add(JB5);
			JF1.addWindowListener(new WindowAdapter()
			{
				public void windowOpening(WindowEvent WE)
				{
					System.out.println("Hello !");
				}
				public void windowClosing(WindowEvent WE)
				{
					System.exit(0);
				}
			}
			);
			JB1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent AE)
				{
					int no1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st Number =>"));
					int no2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 2st Number =>"));
					JOptionPane.showMessageDialog(null,"Addtion Of " + no1 + " And " + no2 + " Is =>" + (no1+no2));
				}
			}
			);
			JB2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent AE)
				{
					int no1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st Number =>"));
					int no2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 2st Number =>"));
					JOptionPane.showMessageDialog(null,"Subtrection Of " + no1 + " And " + no2 + " Is =>" + (no1-no2));
				}
			}
			);
			JB3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent AE)
				{
					int no1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st Number =>"));
					int no2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 2st Number =>"));
					JOptionPane.showMessageDialog(null,"Multiplication Of " + no1 + " And " + no2 + " Is =>" + (no1*no2));
				}
			}
			);
			JB4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent AE)
				{
					int no1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st Number =>"));
					int no2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 2st Number =>"));
					JOptionPane.showMessageDialog(null,"Division Of " + no1 + " And " + no2 + " Is =>" + (no1/no2));
				}
			}
			);
			JB5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent AE)
				{
					int no1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st Number =>"));
					int no2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 2st Number =>"));
					JOptionPane.showMessageDialog(null,"Modulation Of " + no1 + " And " + no2 + " Is =>" + (no1%no2));
				}
			}
			);
		}
	public static void main(String args[])
	{
		new swing1();
	}
}