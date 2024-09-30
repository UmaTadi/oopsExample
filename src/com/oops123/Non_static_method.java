package com.oops123;

public class Non_static_method {

	public void method1() {
		String testing = "manual";
		String testing1 = "automation";
		System.out.println("testing courses are:" + testing + " " + testing1);

	
	}

	public void method2() {
		String tool = "selenium";
		String too11 = "autoit";
		System.out.println("testing tools are:" + tool + "-->" + too11);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_static_method nm = new Non_static_method();
		nm.method1();
		nm.method2();

	}

}
