package ASSIGNMENT;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogBox extends Decorator {
	
	int op;
	
	
	public DialogBox(Client Decoratedclient ) {
		super(Decoratedclient);
		
	}
	
	public void calculate(int a,int b) {
		JFrame frame = new JFrame("InputDialog Example");

	    String A = JOptionPane.showInputDialog(frame, "Enter 1ST operant");
	    String B = JOptionPane.showInputDialog(frame, "Enter 2ST operant");
		a  = Integer.parseInt(A);
		b = Integer.parseInt(B);
		Decoratedclient.calculate(a,b);
	}
}
