package com.ruby.java.ch14;

interface Verify {
	boolean check(int n);
}

//람다식 매개변수 1개만 사용 
public class Test03 {
	public static void main(String[] args) {
		Verify isEven = (n) -> (n % 2) == 0;
		System.out.println(isEven.check(10));

		Verify isPositive = (n) -> n >= 0;
		System.out.println(isPositive.check(-5));
	}
}
