package com.ruby.java.ch03;

public class Test30 {
	
	public static void main(String[] args) {
		//반복문 중첩
		for(int i = 1; i <10; i++) {
			for(int j =2; j< 10; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println("\n");
		}
	}
}
// i랑 j 순서랑 숫자 바꿔주면 되는 문제..