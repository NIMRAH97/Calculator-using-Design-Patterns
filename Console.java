package ASSIGNMENT;

import java.util.Scanner;

public class Console extends Decorator {

	
	
	
	public Console(Client Decoratedclient ) {
		super(Decoratedclient);
		
		
		
	}
	
	public void calculate(int a,int b) {
	
		
		System.out.println("Enter 1st operant");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Enter 2ND operant");
		b=s.nextInt();
		Decoratedclient.calculate(a,b);
	}
	

}
