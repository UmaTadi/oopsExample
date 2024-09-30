package com.variables;

public class VariableExample {
	static VariableExample ve;
	
	int instancevar;
	static int classvar;
	
	public void method()
	{
		int localvar;
		localvar=100;
		instancevar=50-localvar;
		classvar-=instancevar;
		System.out.println("local varible data is:"+localvar);
		System.out.println("intsncevarible data is:"+instancevar);
		System.out.println("class varible data is:"+classvar);
		
	}
	
	{
		System.out.println("this is varible calling program");
	}
	

	public static void main(String[] args) 
	{
		
		 ve=new VariableExample();
		 ve.method();
		 
	}

}
 