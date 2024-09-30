package com.Polymorphism;
class Myself
{
	public void me() 
	{
		System.out.println("I am a Software Employee ");
	}
	public void myName()
	{
		System.out.println("My name is Uma");
	}
	public void myRole()
	{
		System.out.println("I am working as a tester ");
	}
}


class MyRole extends Myself
{
	public void myRole()
	{
		System.out.println("I am woking as a Java Developer");
	}
}

class Mydestination extends MyRole
{
	public void myRole()
	{
		System.out.println("I am woking as a Phython  Developer");
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		//MyRole my = new MyRole();
		Mydestination my = new Mydestination();
		my.me();
		my.myName();
		my.myRole();
	}

}
