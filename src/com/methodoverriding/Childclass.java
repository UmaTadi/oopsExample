package com.methodoverriding;

public class Childclass extends Parentclass {
	public void father() {
		super.father();
		System.out.println(" i buy a new makeup kit");
		
	}
	
	
	
	public static void main(String[] args) {
//		Parentclass pc=new Parentclass();
//		pc.father();
//		
		Childclass cc=new Childclass();
		cc.father();
		cc.village();
		cc.politician();
		cc.place();
		

	}

}
