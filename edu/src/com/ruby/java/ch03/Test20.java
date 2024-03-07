package com.ruby.java.ch03;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		
	
		int a = 1;
		int b = 2;
		char op = '-';
	
		
		if(op == '+') {
			System.out.println(a+b);
		}else if(op =='-') {
			System.out.println(a-b);
		}else if(op =='*') {
			System.out.println(a*b);
		}else if(op =='/') {
			System.out.println(a/b);
		}
	}
}
//스캐너 만들어 보기