package com.methodoverloading;

public class Overloading {
	 static int result;

	public void arthematic_operations(int a, int b) {
		int input2;
		int input1 = a;
		input2 = b;
		result = input1 + input2;
		System.out.println("the addition of two numbers are:" + result);

	}

	public void artarthematic_operations(int x, int y) {
		System.out.println(x+y);
		int a;
		int b;
		a = x;
		b = y;
		result = x - y;
		int result1=x-y;
		System.out.println("x and y subtraction values is:" + result);
		System.out.println(result1);

	}

	public static void main(String[] args) {
		Overloading ol=new Overloading();
		ol.arthematic_operations(10, 10);
		ol.artarthematic_operations(20, 10);
		System.out.println(result);
		
		

	}

}
