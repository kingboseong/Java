package com.ruby.java.ch04;

public class Test36 {
	
	public static void main(String[] args) {
		
		char letter = 'A';
		int num = 'A';
		System.out.println("num: " + num);
		char[] alphabet = new char[26];
		
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)(letter +i); 
		} 
		//i가 explicit type casting돼서 i도 char로 변환하도록 (char)을 사용.
		//(letter+i)의 괄호를 없애면 에러가 남 -> letter는 char로 바꿀 수 있지만 i는 char 형식으로 바꾸지 못해서임.
		
		for(char c : alphabet) {
			System.out.print(c);
		}
	}
}
