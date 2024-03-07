package com.ruby.java.ch03;

public class Test21 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		char op = '-';
		
		switch(op){
		case '+':
			System.out.println(a+b); break;
		case '-':
			System.out.println(a-b); break;
		case '*':
			System.out.println(a*b); break;
		case '/':
			System.out.println(a/b); break;
		//등급을 나누는 경우 default 사용
			
			
		}
	}
}
