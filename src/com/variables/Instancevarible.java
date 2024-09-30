package com.variables;

public class Instancevarible {
	
	 String visits;
	public void method1() {
		String Myfvrt_Places;
		String places="hyd";
		String PLA_CES="bangalore";
		String PlaCes="chennai";
		visits=(places+" "+PLA_CES+" "+PlaCes);
		Myfvrt_Places=visits;
		System.out.println("my favorite places are:"+Myfvrt_Places);
		}
	
	public  static void method2() {
	String name="mindq";
	String name2="systems";
	//visits=name+name2;// nonstaic vaeriable cannot be in static methods
	
	}

	public static void main(String[] args) {
		Instancevarible ic = new Instancevarible();
		ic.method1();

	}

}
