package com.abstraction1;

abstract class parent 
{
	abstract void myname();// unimplement methods

	abstract void myvillage();

	public void myage() 
	{// implement methods,non abstarct method

		System.out.println("iam 28 years old guy");
	}

}

abstract class parent2 
{
	abstract void mycity();
}

class Child1 extends parent
{
	@Override
	void myname() 
	{
		System.out.println("my name is sofiya");

	}

	@Override
	void myvillage() 
	{
		System.out.println("i am from rajolu");
	}
}

class Child2 extends parent2 
{

	@Override
	
	void mycity() 
	{
		System.out.println("nagaram");

	}

}

public class Abstarctclass
{

	public static void main(String[] args) 
	{
		parent p = new Child1();
		p.myname();
		p.myvillage();
		p.myage();
		parent2 p2 = new Child2();
		p2.mycity();

	}

}
