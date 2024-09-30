package com.variables;

public class AllVariableExample {

	int rollno;// instance property with different values
	String name;// instance property with different values
	static String institute = "mindq";// common property

	AllVariableExample(int r, String n) 
	{
		rollno = r;
		name = n;
	}
	
	static void change() {
		institute = "qspiders";
	}

	void outputs() 
	{
		System.out.println(name + " " + rollno + " " + institute);
	}

	public static void main(String[] args) 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	{
		AllVariableExample.change();
		AllVariableExample constructor = new AllVariableExample(100, "thrinadh");
		AllVariableExample constructor1 =new AllVariableExample(101, "sofiya");
		constructor.outputs();
		constructor1.outputs();
	}

}
