package Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swing9 extends JFrame implements ItemListener
{
	Container con;
	JRadioButton r1,r2,r3;
	ButtonGroup bg;
	JLabel l1;
	Icon i1,i2,i3;
	public swing9()
	{
		i1=new ImageIcon("images/fruit1.jpg");
		i2=new ImageIcon("images/fruit2.jpg");
		i3=new ImageIcon("images/fruit4.jpg");
		r1=new JRadioButton(i1);
		r2=new JRadioButton(i2);
		r3=new JRadioButton(i3);
		l1=new JLabel();
		bg=new ButtonGroup();
		con=getContentPane();
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		r1.setBounds(100,100,300,300);
		r2.setBounds(400,100,300,300);
		r3.setBounds(650,100,300,300);
		l1.setBounds(400,500,300,50);
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		con.add(r1);
		con.add(r2);
		con.add(r3);
		con.add(l1);
	}
	public void itemStateChanged(ItemEvent i)
	{
		if(r1.isSelected())
		{
			Font f1=new Font("Times New Roman",Font.BOLD,50);
			l1.setFont(f1);
			l1.setText("Strawbarry");
		}
		else if(r2.isSelected())
		{
			Font f1=new Font("Times New Roman",Font.BOLD,50);
			l1.setFont(f1);
			l1.setText("Graps");
		}
		else if(r3.isSelected())
		{
			Font f1=new Font("Times New Roman",Font.BOLD,50);
			l1.setFont(f1);
			l1.setText("Banana");
		}
	}
	public static void main(String args[])
	{
		new swing9();
	}
}