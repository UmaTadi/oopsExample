package com.constructor_overloading;

public class Constructor {
	
	public Constructor() 
	{
		System.out.println("hi hello");
	}
	public Constructor(int a, int b) 
	{
		int x=a;
		int y=b;
		int result=x+y;
		System.out.println(result);
		
	}
	
	public static void main(String[] args)
	{
		Constructor ce=new Constructor();
		Constructor ce1=new Constructor(10, 10);
		
	}

}
