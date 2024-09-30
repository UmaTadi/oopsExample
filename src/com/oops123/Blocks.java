package com.oops123;

public class Blocks {
	
	public  Blocks()
	 {
		System.out.println("hi");
	}
	
	public void method1() {
		System.out.println("hi how are you");
	}
	
	public static void method2() {
		System.out.println("hello hyderabad");
	}
	 
	public Blocks()
	{
		System.out.println("hi hello");
	}
	static 
	{
		System.out.println("hi this is  staic block");//static block
	}
	//if we donot use any keyword, it will acts as non-static block
	{
		System.out.println("hi this is not static block");//non static block
	}
	
	

	public static void main(String[] args) {
		//Blocks b=new Blocks();
	//b.method1();

//	

	}

}
