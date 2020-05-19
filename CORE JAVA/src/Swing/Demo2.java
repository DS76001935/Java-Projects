package Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Demo2 extends JFrame implements ListSelectionListener
{
	JList list;
	JLabel l1;
	
	Demo2()
	{
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
	
		DefaultListModel dm=new DefaultListModel();
		for(int i=0;i<=50;i++)
		{
			dm.addElement(i);
			
		}
		list=new JList(dm);
		JScrollPane sp=new JScrollPane(list);
		list.setVisibleRowCount(4);
		l1=new JLabel("Hello");
		add(l1);
		add(sp);
		list.addListSelectionListener(this);
		
	}
	
	public void valueChanged(ListSelectionEvent e)
	{
	
		int no=Integer.parseInt(list.getSelectedValue().toString());
		Font f=new Font("Arial",Font.BOLD,no);
		l1.setFont(f);
		
	}
	
	public static void main(String[] args)
	{
		new Demo2();
	}
	
}
