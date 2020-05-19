package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swing8 extends JFrame
{
	Container con;
	JButton b1,b2,b3;
	JLabel l1;
	
	public swing8()
	{
		b1=new JButton("BLUE");
		b2=new JButton("GREEN");
		b3=new JButton("YELLOW");
		l1=new JLabel();

		con=getContentPane();
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		b1.setBounds(100,100,100,30);
		b2.setBounds(200,100,100,30);
		b3.setBounds(300,100,100,30);
		l1.setBounds(500,100,300,50);

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				l1.setText("BLUE");
				con.setBackground(Color.blue);
				l1.setForeground(Color.green);
				Font f1=new Font("Times New Roman",Font.BOLD,20);
				l1.setFont(f1);
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				l1.setText("GREEN");
				con.setBackground(Color.green);
				l1.setForeground(Color.yellow);
				Font f1=new Font("Arial",Font.BOLD,30);
				l1.setFont(f1);	
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				l1.setText("YELLOW");
				con.setBackground(Color.yellow);
				l1.setForeground(Color.blue);
				Font f1=new Font("Vardana",Font.BOLD,40);
				l1.setFont(f1);
			}
		});
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(l1);
	}
	
	public static void main(String args[])
	{
		new swing8();
	}
}