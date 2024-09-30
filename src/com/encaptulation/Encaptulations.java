package com.encaptulation;


class Encaptulations123{
	private int employeeId;
	private int employeeSalary;
	private String employeeName;
	
	public void setEmployeeId(int employeeId ) {
		this.employeeId=employeeId;
	}
	public int  GetEmployeeId() {
		return employeeId;
		
	}
	public void SetEmployeeSalary(int employeeSalary) {
		this.employeeSalary=employeeSalary;
	}
	public int GetEmployeeSalary() {
		return employeeSalary;
	}
	public void SetEmployeeName(String employeeName ) {
		this.employeeName=employeeName;
		
	}
	public String GetEmployeeName() {
		return employeeName;
	}
	
	
}

public class Encaptulations {

	public static void main(String[] args) {
		Encaptulations123 ec=new Encaptulations123();
		ec.setEmployeeId(101);
		System.out.println("my employee id is:"+ec.GetEmployeeId());
		ec.SetEmployeeSalary(10000);
		System.out.println("my salary is:"+ec.GetEmployeeSalary());
		ec.SetEmployeeName("sophia");
		System.out.println("my name is:"+ec.GetEmployeeName());
		

	}

}
