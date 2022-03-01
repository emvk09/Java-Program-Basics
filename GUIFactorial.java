import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIFactorial extends JFrame implements ActionListener
{
	JLabel l1, l2;
	JTextField t1, t2;
	JButton b1;
	
	GUIFactorial()
	{
		setTitle("Factorial: GUI Program");
		
		l1= new JLabel("Enter the Number:");
		l2= new JLabel("Factorial is:");
				
		t1= new JTextField(10);
		t2= new JTextField(10);
			
		b1=new JButton("Factorial");
		
        setVisible(true);
		setSize(400, 300);
        setLayout(new GridLayout(5, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
        int i, fact= 1;
		int n= Integer.parseInt(t1.getText());
		for(i= 1; i<= n; i++)
			fact= fact * i;
		t2.setText(String.valueOf(fact));
	}
	public static void main(String arr[])
	{
		new GUIFactorial();
	}
	
}

