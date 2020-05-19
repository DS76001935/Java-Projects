package Swing;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class swing5 extends JFrame
{
	Container con;
	static int no=0,result=0;
	JButton b1,b2,b3;
	JTextField t1;
	JLabel l1,l2;
	public swing5()
	{
		con=getContentPane();
		setTitle("Swing Operation");
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1=new JButton("Enter Any Number");
		b2=new JButton("Doubles Me");
		b3=new JButton("Triples Me");
		t1=new JTextField();
		l1=new JLabel();
		l2=new JLabel();
		con.add(b1);
		b1.setBounds(223,150,150,30);
		b1.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent e)
			{
				con.add(t1);
				con.add(b2);
				con.add(b3);
				t1.setBounds(200,200,200,30);
				b2.setBounds(200,250,100,30);
				b3.setBounds(300,250,100,30);
			}
		
		});
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				no=Integer.parseInt(t1.getText());
				result=(no*no);
				con.add(l1);
				l1.setBounds(200,300,200,30);
				l1.setText("Doubles Of " + no + " Is => " + result);
			}
			
		});
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				no=Integer.parseInt(t1.getText());
				result=(no*no*no);
				con.add(l2);
				l2.setBounds(200,330,200,30);
				l2.setText("Triples Of " + no + " Is => " + result);
			}
			
		});
	}
	public static void main(String args[])
	{
		new swing5();
	}
}