package com.ruby.java.ch06;

public class Member {
	
	private String name;
	private int age;
	
//	public Member() {
//		System.out.println("Member() 생성자 실행");
//	}
//	
//	public Member(String name) {
//		System.out.print("Member(String) 생성자 실행 : ");
//		System.out.println(name);
//	}
//	
//	public Member(String name, int age) {
//		System.out.print("Member(string, int)생성자 실행 : ");
//		System.out.println(name + " : " + age);
//	}
//	
//	public void setName(String name) {
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("main() 메서드 실행");
//		new Member();
//		new Member("Any");
//		new Member("Any", 23);
//	}
	
	public Member() {
		this("guest");
	}
	
	public Member(String name) {
		this(name, 0);
		//this.name = name; 결과값 같음.
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		//this(name, age); 이건 왜 안됨?
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member("Any");
		Member m3 = new Member("Any", 23);
		System.out.println("m1:" + m1);
		System.out.println("m2:" + m2);
		System.out.println("m3:" + m3);
	}
}
	
	
//}
