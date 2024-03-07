package com.ruby.java.ch07.inheritance;

public class Professor extends Person {

		private String subject;
		
		public Professor(String name, int age, String subject) {
			super(name, age);
			this.subject = subject;
			//super(); 부모 클래스의 기본 생성자가 생략되있는 거임. 
			System.out.println("professor 생성자");
		}
		
		public String getSubject() {
			return subject;
		}
		
		public void setSubject(String subject) {
			this.subject = subject;
		}

		@Override
		public String toString() {
			return super.toString() + ":" + subject;
		}
}
