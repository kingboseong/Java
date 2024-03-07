package com.ruby.java.ch14;

//인터페이스가 없으면 함수형 인터페이스를 자바에서 기본으로 제공해줌
import java.util.function.Function;

//함수형 인터페이스 API - Function
public class Test14 {
//Function = 인자를 받아와 리턴 타입으로 반환.
	public static void main(String[] args) {
		Function<String, Integer> func = (s) -> {
			int cnt = 0;
			String[] word = s.split(" ");
			cnt = word.length;
			return cnt;
		};

		int wordCnt = func.apply("고개를 들어 별들을 보라 달신 발만 내다 보지말고");
		System.out.println("단어 수 : " + wordCnt);
	}
}
