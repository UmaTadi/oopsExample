package com.oops123;

public class Static_method 
{
	public static void addition() {
		int actual_value = 100;
		int expected_value = 290;
		int result = actual_value + expected_value;
		System.out.println("addition of two numbers is:" + result);

	}

	public static void subtraction() 
	{
		int x = 200;
		int z = 100;
		int result = z - x;
		System.out.println("subtraction of two numbers is:" + result);

	}

	public static void concat() 
	{
		String name = "sophia";
		String name2 = "tadi";
		String result = name.concat(name2);
		String result1 = (name + name2);
		System.out.println("concat of two names is:" + result+"  "+result1);
		System.out.println(result1);

	}

//	public static void main(String[] args) {
//		addition();//we call into direct
//		subtraction();
//		concat();
//		System.out.println("--------------------------------p");
//		Static_method sm=new Static_method();
//		sm.addition();
//		sm.subtraction();
//		sm.concat();
//		
	}


