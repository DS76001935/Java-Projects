package Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
class swing7 extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1;
	JButton b1;
	Container con;
	public swing7()
	{
		con=getContentPane();
		l1=new JLabel("Enter URL:");
		l1.setBounds(50,70,150,20);
		t1=new JTextField();
		t1.setBounds(50,100,200,20);
		b1=new JButton("Find IP");
		b1.setBounds(50,150,80,30);
		b1.addActionListener(this);
		con.add(l1);
		con.add(t1);
		con.add(b1);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String url=t1.getText();
		try
		{
			InetAddress ia=InetAddress.getByName(url);
			String ip1=ia.getHostAddress();
			String ip2=ia.getHostName();
			JOptionPane.showMessageDialog(this,"IP Address Of '" +  ip2 + "' This URL Is => " + ip1);
		}
		catch(UnknownHostException e1)
		{
			JOptionPane.showMessageDialog(this,e1.toString());
		}
	}
	
	public static void main(String args[])
	{
		new swing7();
	}
}