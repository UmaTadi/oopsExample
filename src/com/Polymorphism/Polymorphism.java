package com.Polymorphism;


class Water
{
	public void water123(String Season , int a)
	{
		String seasons;
		seasons=Season;
        int degrees = a;
       
		System.out.println("Water in summer season is : "+seasons+""+degrees);
		
	}
	public void water123( int b , String Winter)
	{
	     int degree = b;
	     String cold ;
		 cold= Winter;
		 System.out.println("Water in winter season is : " + cold + " "+ degree );
	}
	
}

class Liquid extends Water
{
	public void water123(String a1 , String b1)
	{
		String x;
		String y;
		x=b1;
		y=a1;
		String result;
		result = x+y;
		System.out.println( "Water stage may be " + x + " or " + y);
		
	}
}
public class Polymorphism 
{

	
	public static void main(String[] args) 
	{
		Liquid lq = new Liquid();
		lq.water123("Summer", 40);
		lq.water123(20, "solid");
		lq.water123("Liquid ", "Solid");
	}

}
