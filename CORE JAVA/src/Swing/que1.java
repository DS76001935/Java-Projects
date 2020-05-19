package Swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class que1 extends JFrame implements ItemListener
{
	JRadioButton r1;
	JRadioButton r2;
	JRadioButton r3;
	ButtonGroup bg;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	que1()
	{
		Container con;
		r1=new JRadioButton("Pink");
		r2=new JRadioButton("Red");
		r3=new JRadioButton("Green");
		bg=new ButtonGroup();
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel();
		setSize(700,700);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		add(r1);
		add(r2);
		add(r3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(r1.isSelected())
		{
			//l1.setOpaque(true);
			//l1.setBackground(Color.pink);
			//l1.setText("Pink");
			getContentPane().setBackground(Color.pink);
		}
		else if(r2.isSelected())
		{
			//l2.setOpaque(true);
			//l2.setBackground(Color.red);
			//l2.setText("Red");
			getContentPane().setBackground(Color.red);
		}
		else if(r3.isSelected())
		{
			//l3.setOpaque(true);
			//l3.setBackground(Color.green);
			//l3.setText("Green");
			getContentPane().setBackground(Color.green);
		}
	}
	public static void main(String args[])
	{
		new que1();
	}
}