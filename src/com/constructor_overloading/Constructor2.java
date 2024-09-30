package com.constructor_overloading;

public class Constructor2 {
	
	
	//class variblecount
	static int totalcount;
	//instance variable
	 static int instantcount;
	
	Constructor2(int z, int m)
	{
		int x=z;
		System.out.println(z);//10
		System.out.println(x);//10
		z++;
		System.out.println(z);//11
		totalcount=z;
		System.out.println(totalcount);
		totalcount++;//1
		System.out.println(totalcount);
		 z=totalcount++;
		System.out.println(z);//1
		
		System.out.println("----------------");
		int b=m;
		System.out.println(b);
		++instantcount;//1
		System.out.println(instantcount);
		 m=++instantcount;
		System.out.println(m);
		System.out.println(instantcount);
	}
	public static void display() 
	{
		System.out.println("totalcount:"+totalcount);
		System.out.println("instancecount:"+instantcount);
	}

	public static void main(String[] args)
	{
		Constructor2 c=new Constructor2(10, 10);
		Constructor2.display();

	}
}
