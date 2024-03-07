package com.ruby.java.ch05;

public class Test02 {
//가변인자길이예제
	static void test(int...v) {
		System.out.print(v.length + " : ");
		for(int x : v) //1 for문 실행값이 한줄이니 {}를 생략.
			System.out.print(x + " ");
		System.out.println(); //for문이 끝나면 줄 띄우기
	}
	//main이 위로 올라가도 똑같음. 왜냐면 이 클래스의 시작은 main메서드 이기 때문에
	public static void main(String[] args) {
		test(1);
		test(1, 2);
		test(1, 2, 3);
	}
}
