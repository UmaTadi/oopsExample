package com.singlelevel_inheritance;

import java.util.Stack;

public class ChildClass 
{
	static Parentclass sp;
	
	public static void main(String[] args)
	{
//		ChildClass cc = new ChildClass();
//		cc.launch_browser();
//		cc.URL();
//		cc.login();
//		cc.Logout();
//		cc.close();
		
		
		sp = new Parentclass();
		sp.launch_browser();
		sp.login();
		
		//for static method direct calling
		Parentclass.launch_browser();
}
	
}