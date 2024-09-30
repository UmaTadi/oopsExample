package com.constructor_overloading;

public class ConstructorOverloading {
	static String result1;
	static int result;

	ConstructorOverloading(int a, int b)
	{
        this.result = a + b;
		System.out.println(result);
	}

	ConstructorOverloading(String x, String y) 
	{
		this.result1 = x + y;

		System.out.println(result1);
		System.out.println(result1);
	}

}
