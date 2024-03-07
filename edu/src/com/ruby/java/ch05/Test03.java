package com.ruby.java.ch05;

public class Test03 {
	
	static void test(String name, int...v) {
		System.out.print(name + " : ");
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("오정임", 98, 85, 88);
		test("오상식", 91, 45, 68);
		test("오무상", 66, 86, 78);
	}
}
