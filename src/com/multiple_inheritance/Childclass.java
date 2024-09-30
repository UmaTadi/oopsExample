package com.multiple_inheritance;

public class Childclass implements Grandfather,Father {

	@Override
	public void mygrandpaa() {
		System.out.println("my grandpaa lives in hyd");
		
	}

	@Override
	public void designation() {
		System.out.println("he workes in military");
	}

	@Override
	public void age() {
		System.out.println("he is at age 95");
		
	}

	@Override
	public void father() {
System.out.println("my father works in Elecrical Department");		
	}

	@Override
	public void role() {
System.out.println("He is a sub-engineer");		
	}

	@Override
	public void inspiration() 
	{
		System.out.println("He is inspired by his hard work");
		
	}
	
	public static void main(String[] args) {
		Childclass cc=new Childclass();
		cc.mygrandpaa();
		cc.designation();
		cc.age();
		cc.father();
		cc.role();
		cc.inspiration();
		
	}

	
}
