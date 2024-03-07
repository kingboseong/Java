package com.ruby.java.ch09.기본API;
//iterator 개념 실습 
import java.util.StringTokenizer;

public class Test14 {
	public static void main(String[] args) {
		//nextToken / hasMoreTokens 가 뭔지 공부하는 클래스  = `10장에 iterator과 관련.
		//st1 = 참조변수 
		String msg = "Although the world is full of suffering, it is full also of the overcoming of it.";
		StringTokenizer st1 = new StringTokenizer(msg);
		System.out.println("단어 수 : " + st1.countTokens());
		while (st1.hasMoreTokens()) {
			System.out.print(st1.nextToken() + " + " ); //토큰을 하나씩 찍어냄.
		}
		
		StringTokenizer st11 = new StringTokenizer(msg, ",.");
		System.out.println("단어 수 : " + st11.countTokens());
		while (st11.hasMoreTokens()) {
			System.out.print(st11.nextToken() + " + " );
		}
		
		System.out.println("\n================");
		String s = "id=guest&name=Amy&pwd=1004";
		StringTokenizer st2 = new StringTokenizer(s, "&");
		while (st2.hasMoreTokens()) {
			System.out.println("남아있는 토큰 수 : " + st2.countTokens());
			System.out.println(st2.nextToken());
		}

		System.out.println("================");
		StringTokenizer st3 = new StringTokenizer(s, "=&");
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}
}