package Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Swing_CRUD_Operation extends JFrame implements ActionListener
{

	Container con;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4;

	public Swing_CRUD_Operation()
	{
		con=getContentPane();
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		l1 = new JLabel("Full Name:");
		l2 = new JLabel("Age:");
		l3 = new JLabel("Email ID:");
		l4 = new JLabel("Contact Number:");

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();

		b1 = new JButton("INSERT");
		b2 = new JButton("SEARCH");
		b3 = new JButton("UPDATE");
		b4 = new JButton("DELETE");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		con.add(l1);
		con.add(t1);
		con.add(l2);
		con.add(t2);
		con.add(l3);
		con.add(t3);
		con.add(l4);
		con.add(t4);
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);

		l1.setBounds(100,100,100,100);
		t1.setBounds(200,140,300,30);
		l2.setBounds(100,200,100,100);
		t2.setBounds(200,240,300,30);
		l3.setBounds(100,300,100,100);
		t3.setBounds(200,340,300,30);
		l4.setBounds(100,400,100,100);
		t4.setBounds(200,440,300,30);
		b1.setBounds(150,500,100,30);
		b2.setBounds(350,500,100,30);
		b3.setBounds(150,550,100,30);
		b4.setBounds(350,550,100,30);

	}

	public static void main(String args[])
	{
		new Swing_CRUD_Operation();
	}

	public void actionPerformed(ActionEvent e)
	{
		String action = e.getActionCommand();
		if(action == "INSERT")
		{
			String fullname = t1.getText();
			String age = t2.getText();
			String email = t3.getText();
			String mno = t4.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
				
				String query = "insert into student (fullname,age,email,mno) values (?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(query);

				ps.setString(1,fullname);
				ps.setInt(2,Integer.parseInt(age));
				ps.setString(3,email);
				ps.setString(4,mno);
				
				ps.executeUpdate();

				System.out.println("All Student's Records Are Inserted Successfully !");
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(action == "SEARCH")
		{
			String fullname = t1.getText();
			String age = t2.getText();
			String email = t3.getText();
			String mno = t4.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
				
				String query = "insert into student (fullname,age,email,mno) values (?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(query);

				ps.setString(1,fullname);
				ps.setInt(2,Integer.parseInt(age));
				ps.setString(3,email);
				ps.setString(4,mno);
				
				ps.executeUpdate();

				System.out.println("All Student's Records Are Inserted Successfully !");
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(action == "UPDATE")
		{
			String fullname = t1.getText();
			String age = t2.getText();
			String email = t3.getText();
			String mno = t4.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
				
				String query = "insert into student (fullname,age,email,mno) values (?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(query);

				ps.setString(1,fullname);
				ps.setInt(2,Integer.parseInt(age));
				ps.setString(3,email);
				ps.setString(4,mno);
				
				ps.executeUpdate();

				System.out.println("All Student's Records Are Inserted Successfully !");
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(action == "DELETE")
		{
			String fullname = t1.getText();
			String age = t2.getText();
			String email = t3.getText();
			String mno = t4.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
				
				String query = "insert into student (fullname,age,email,mno) values (?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(query);

				ps.setString(1,fullname);
				ps.setInt(2,Integer.parseInt(age));
				ps.setString(3,email);
				ps.setString(4,mno);
				
				ps.executeUpdate();

				System.out.println("All Student's Records Are Inserted Successfully !");
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}