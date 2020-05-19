package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swing2 extends JFrame implements ItemListener
{
    JRadioButton RB1,RB2;
    FlowLayout FL1;
    ButtonGroup bg;
	Container con;
		public swing2()
		{
			con=getContentPane();
			bg=new ButtonGroup();
            RB1=new JRadioButton("Male");
			RB2=new JRadioButton("Female");
			FL1=new FlowLayout(FlowLayout.CENTER);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			con.setLayout(FL1);
			setVisible(true);
			setSize(1000,1000);
			bg.add(RB1);
			bg.add(RB2);
			con.add(RB1);
			con.add(RB2);
			RB1.addItemListener(this);
			RB2.addItemListener(this);
        }
             public void itemStateChanged(ItemEvent IE)
			{
				if(RB1.isSelected())
				{
					JOptionPane.showMessageDialog(null,"You're Male !");
				}
				if(RB2.isSelected())
				{
					JOptionPane.showMessageDialog(null,"You're Female !");
				}
			}

		public static void main(String args[])
		{
			new swing2();
		}
}