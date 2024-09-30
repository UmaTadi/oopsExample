package com.variables;

public class Localvaribles
{

	public void method1() {
		int result;

		int a = 100;
		int b = 200;
		result = a + b;
		System.out.println(result);

	}

	public static void method2() {
		String result;
		String testing = "manual";
		String testing1 = "automation";
		result = testing + testing1;
		System.out.println(result);
	}

	public static void main(String[] args) {
		Localvaribles lc=new Localvaribles();
		lc.method1();
		lc.method2();
		

	}

}









