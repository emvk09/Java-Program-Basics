import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPalindromeString extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1, t2;
	JButton b1;
	
	GUIPalindromeString()
	{
		setTitle("Palindrome: GUI Program");
		
		l1= new JLabel("Enter the String:");
				
		t1=new JTextField(10);
        t2=new JTextField(10);
				
		b1=new JButton("Check");
		
        setVisible(true);
        setSize(400, 300);
		setLayout(new GridLayout(4, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(l1);
		add(t1);
		add(b1);
        add(t2);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str= t1.getText();
		StringBuilder sbd = new StringBuilder(str);
		sbd.reverse();
		String rev= sbd.toString(); //toString() method converts any object to string
		if(str.equals(rev))
        {
            t2.setForeground(Color.green);
            t2.setText("Palindrome String");
        }
		else
        {
            t2.setForeground(Color.red);
            t2.setText("Not a Palindrome String");	
        }
	}
	public static void main(String args[])
	{
		new GUIPalindromeString();
	}
}