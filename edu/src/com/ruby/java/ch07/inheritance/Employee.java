package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	
	private String dept;
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
		System.out.println("Employee 실행");
		
		// TODO Auto-generated constructor stub
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + ":" + dept;
	}
}
