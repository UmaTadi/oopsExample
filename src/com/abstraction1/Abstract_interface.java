package com.abstraction1;

interface parent333 
{

	public void place();

	public void tool();

	public void job();

	public void role();

	public void salary();

}

class Child implements parent333 
{

	@Override
	public void place()
	{
		System.out.println("i am at hyd");
	}

	@Override
	public void tool() {
		System.out.println("i am working on selenium tool");
	}

	@Override
	public void job() {
		System.out.println("working on Qa_assurance");

	}

	@Override
	public void role() {
		System.out.println("TEST teamlead");
	}

	@Override
	public void salary() {
		System.out.println("i want to get  a 1 lakh salary for monthly");
	}

}

public class Abstract_interface {

	public static void main(String[] args) {
		Child cc=new Child();
		cc.place();
		cc.tool();
		cc.job();
		cc.role();
		cc.salary();
		System.out.println("-----------------");
		
		parent333 p3=new Child();
		p3.place();
		p3.tool();
		p3.job();
		p3.role();
		p3.salary();
		
	}

}
