package com.ruby.java.ch03;

public class Test29 {
	
	public static void main(String[] args) {
		//if 중첩
		int i = 8;
		if((i%2)==0) {
			System.out.println(i + "은 2의 배수");
			if((i%3)==0){
				System.out.println(i + "은 3의 배수");
			}
		}
	}
}
