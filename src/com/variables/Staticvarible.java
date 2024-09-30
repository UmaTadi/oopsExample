package com.variables;

public class Staticvarible {
	
	static String result;

	public static void method1() 
	{
		String testingtypes = "manual";
		String testingtypes2 = "automation";
		result = testingtypes + "-->" + testingtypes2;
		System.out.println(result);
	}

	public void method2() {
		
		String hobbies = "reading books";
		String hobbies1 = "playing cricket";
		result = hobbies + "-->" + hobbies1;
		System.out.println(result);
	}

	public static void main(String[] args) 
	{
		Staticvarible sc = new Staticvarible();
		sc.method1();
		sc.method2();

	}

}
