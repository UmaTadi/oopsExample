package com.variables;

public class Localvarible 
{
	static int sum;

	public int addition(int a, int b) 
	{
		sum = a + b;
		System.out.println("total sum:" + sum);
		return sum;

	}

	public static void main(String[] args) {
		Localvarible lc = new Localvarible();
		
	lc.addition(100, 100);
		
		int num = lc.addition(10, 10);
	System.out.println(num); //data type method/ return typemethod
		
		
		System.out.println("total sum:" + sum);

	}

}
