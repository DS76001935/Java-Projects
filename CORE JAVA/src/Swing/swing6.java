package Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swing6 extends JFrame implements ActionListener
{
	JList list1,list2;
	Container con;
	JScrollPane sp1,sp2;
	JButton b1;
	
	public swing6()
	{
		setTitle("List DEMO");
		setVisible(true);
		setSize(400,400);
	
		con=getContentPane();
		setLayout(new FlowLayout(FlowLayout.CENTER));
	
		DefaultListModel dm1=new DefaultListModel();
		dm1.addElement("January");
		dm1.addElement("February");
		dm1.addElement("March");
		dm1.addElement("April");
		dm1.addElement("May");
		dm1.addElement("June");
		dm1.addElement("July");
		dm1.addElement("August");
		dm1.addElement("September");
		dm1.addElement("October");
		dm1.addElement("November");
		dm1.addElement("December");
		list1=new JList(dm1);
		sp1 = new JScrollPane(list1);
		b1= new JButton("Click");
		b1.addActionListener(this);
		
		list1.setVisibleRowCount(4);
		list1.setSelectedIndex(1);
		
		// multipale items can be selected with continuty
		//month_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		// multipale items can be selected with interval
		list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		con.add(sp1);
		con.add(b1);
		//month_model = month_1.getModel();


		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
 
	public void actionPerformed(ActionEvent e)
	{  String str="";
		if(e.getActionCommand()=="Click")
		{
		/*	if (list1.getSelectedIndex() != -1) 
			{ 
				 data += " Months selected: ";
               			for(Object mnth:list1.getSelectedValues())
				{
                  		data += mnth + " ";
				}
			}*/
			DefaultListModel dm2=new DefaultListModel();
			if (list1.getSelectedIndex() != -1) 
			{ 
				Object arr[]=list1.getSelectedValues();
				for(int i=0;i<arr.length;i++)
				{
					dm2.addElement(arr[i]);
				}
			}
			list2=new JList(dm2);
			sp2 = new JScrollPane(list2);
			con.add(sp2);
		}   
	} 
	public static void main(String[] args)
	{
              new swing6();
    }
   
}
