package com.methodoverloading;

public class datatypeEx 
{
     int c;
	 public int method1(int a, int b)
	 {
		
		 c=a+b;
		 System.out.println(c);
		 return c;
		
	 }
	public String method1(String x, String y)
	{
		String z;
		z=x.concat(y);
		System.out.println(z);
		return z;
	}
	public static void main(String[] args)
	{
		datatypeEx de = new datatypeEx();
		de.method1(10, 10);
		de.method1
		("mindq", " systems");
	}

}
