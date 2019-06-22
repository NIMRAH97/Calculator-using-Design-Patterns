package ASSIGNMENT;

import javax.swing.*;

public abstract class Decorator implements Client{

	@Override
	public void calculate(int a,int b) {
		// TODO Auto-generated method stub
		
	}
	
	protected Client Decoratedclient;
	
	public Decorator (Client Decoratedclient) {
		super();
		this.Decoratedclient = Decoratedclient;
	}
	
	
}