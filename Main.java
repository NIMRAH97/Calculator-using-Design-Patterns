package ASSIGNMENT;

import javax.swing.*;

public class Main {
	public static void main(String argu[]) {
		
		JFrame frame = new JFrame("InputDialog Example");
		
		
		
		
		
		
		String oper = JOptionPane.showInputDialog(frame, "Enter operation you want to perform..\n1:add\n2:subtract\n3:multipication\n4:division");
		int b = Integer.parseInt(oper);
		if(b ==1) {
			Client add =  new Addition();
			Addition A = new Addition();
			String str = JOptionPane.showInputDialog(frame, "do you want to give input from console enter 1 \n enter 2 to give information from dialog box");
			int s = Integer.parseInt(str);
			if (s == 1) {
				Console CL = new Console (A);
				CL.calculate(1, 1);
			}
			else if(s ==2) {
				DialogBox DL = new DialogBox (A);
				DL.calculate(1, 1);
			}
		}
		else if(b ==2) {
			Client sub =  new Subtraction();
			Subtraction B = new Subtraction();
			String str = JOptionPane.showInputDialog(frame, "do you want to give input from console enter 1 \n enter 2 to give information from dialog box");
			int s = Integer.parseInt(str);
			if (s == 1) {
				Console CL = new Console (B);
				CL.calculate(0, 0);
			}
			else if(s ==2) {
				DialogBox DL = new DialogBox (B);
				DL.calculate(0, 0);
			}
			
		}
		else if(b ==3) {
			Client mul =  new Multipication();
			Multipication M =new  Multipication();
			String str = JOptionPane.showInputDialog(frame, "do you want to give input from console enter 1 \n enter 2 to give information from dialog box");
			int s = Integer.parseInt(str);
			if (s == 1) {
				Console CL = new Console (M);
				CL.calculate(0, 0);
			}
			else if(s ==2) {
				DialogBox DL = new DialogBox (M);
				DL.calculate(0, 0);
			}
			
		}
		else if(b ==4) {
			Client div =  new Division();
			Division D = new Division();
			String str = JOptionPane.showInputDialog(frame, "do you want to give input from console enter 1 \n enter 2 to give information from dialog box");
			int s = Integer.parseInt(str);
			if (s== 1) {
				Console CL = new Console (D);
				CL.calculate(0, 0);
			}
			else if(s ==2) {
				DialogBox DL;
				DL = new DialogBox (D);
				DL.calculate(0, 0);
			}
		
		}
		else {
			 JOptionPane.showInputDialog(frame, "invalid input");
		}
		
		
		
	}
}
