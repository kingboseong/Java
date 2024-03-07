package com.ruby.java.ch11;

public class Test01_1 {
	public static void main(String[] args) {
		test1();
		System.out.println("GOOD");
	}
	
	private static void test1() {
		System.out.println("test2 start");
		test2(); //test 2가 끝나면 되돌아와서 test2 end를 출력
		System.out.println("test2 end");
	}

	private static void test2() {
		System.out.println("test2 start");
		try {
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("ok");
		}catch(ArrayIndexOutOfBoundsException e1) {//위 코드에 에러가 없으면 catch 문은 실행이 안됨.
			System.out.println(e1.getMessage()); // 어떤 에러가 발생했는지 알려줌.
			e1.printStackTrace();
		}catch(Exception e) {
			System.out.println("오류 발생 : " + e);
		}
		System.out.println("test2 ending");
	}
}
