package com.ruby.java.ch08.innerClass;

public class OuterClassTest {
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();
		//outer.InstanceClass inner02 = outer.new InstanceClass(); // 오류 이유 = 변수 앞에는 클래스 정보만 들어가야 하는데 객체가 들어가서 오류가 남.
		inner01.a = 123;
		inner01.method2();
		OuterClass.StaticClass inner03 = new OuterClass.StaticClass();
		OuterClass.StaticClass.c = 789;
		OuterClass.StaticClass.method4();
	}
}
