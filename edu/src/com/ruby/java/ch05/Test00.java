//package com.ruby.java.ch05클래스;
//
//public class 메서드호출예시 {
//기본
//	public static void main(String[] args) {
//		
//		System.out.println("1");
//		
//		takeoff();
//		
//		System.out.println("2");
//	}
//	
//	static void takeoff() {
//		System.out.println("takeoff");
//		
//	}
//}


package com.ruby.java.ch05;

public class Test00 {
	
	public static void main(String[] args) {
		
		System.out.println("1");
		
		System.out.println(takeoff());
//		위 아래 출력 값 같음. 위 방법이 쉬워 보이는데 굳이 아래 방법을 쓰는 이유가 있을까?
//		char sum = takeoff();
//		System.out.println(sum);
		
		
		System.out.println("2");
	}
	//int String long, boolean, char
	public static char takeoff() {
		System.out.println("이 값이 우선 출력 후 리턴된 값이 위로 올라가서 출력됨");
		
		return 'A';
	}
}
