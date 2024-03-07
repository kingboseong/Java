package com.ruby.java.ch07.inheritance;

public class Student extends Person {
	
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
		System.out.println("Student 실행");
	}

	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
