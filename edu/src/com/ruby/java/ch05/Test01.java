package com.ruby.java.ch05;

public class Test01 {

	public static void main(String[] args) {
		
		System.out.println("1");
		
//		System.out.println(takeoff());
//		위 아래 출력 값 같음.
		String num = takeoff(6,7);
		System.out.println(num);
		
		
		
		System.out.println("2");
	}
	//int String long, boolean, char
	static String takeoff(int num1, int num2) {
		System.out.println("takeoff1");
		System.out.println("takeoff2");
		System.out.println("takeoff3");
		
		return num1 + num2 + "===>";
	}
}
