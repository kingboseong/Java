package com.ruby.java.ch14;

interface MyFunc<T> {
	T modify(T t);
}

//위 인터페이스의 T에 String이랑, Integer가 들어간다고 보면 됨.
//interface MyFunc<String> {
//	String modify(String t);
//}
//제네릭 함수형 인터페이스
public class Test06 {

	public static void main(String[] args) {

		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();
		System.out.println(mf1.modify("java"));
		System.out.println(mf1.modify("java programming"));

		MyFunc<Integer> mf2 = (n) -> n * 2;
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
	}
}
