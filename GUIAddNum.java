import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIAddNum extends JFrame implements ActionListener
{
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1;
	
	GUIAddNum()
	{
		setTitle("Add Numbers: GUI Program");
		
		l1= new JLabel("First Number:");
		l2= new JLabel("Second Number:");
		l3= new JLabel("Result:");
		
		t1= new JTextField(10);
		t2= new JTextField(10);
		t3= new JTextField(10);
		
		b1= new JButton("Add");
		
		setVisible(true);
		setSize(400, 300);
		setLayout(new GridLayout(7, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int x= Integer.parseInt(t1.getText());
		int y= Integer.parseInt(t2.getText());
		int sum= x + y;
		t3.setText(String.valueOf(sum));
	}
	public static void main(String args[])
	{
		new GUIAddNum();
	}	
}
