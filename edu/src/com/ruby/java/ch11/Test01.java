package com.ruby.java.ch11;

public class Test01 {
	//try ~ catch문 사용 예제 = 오류를 하나씩 주석처리해보면서 디버깅되는 순서를 파악하기
	public static void main(String[] args) {
		try {
			int temp = 10/0; // Exception으로 이동
			
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length(); // NullPointerException으로 이동
			
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("ok");
			
		}catch(ArrayIndexOutOfBoundsException e1) {//위 코드에 에러가 없으면 catch 문은 실행이 안됨.
			System.out.println(e1.getMessage()); // 어떤 에러가 발생했는지 알려줌.
		}catch(NullPointerException e2) {
			e2.printStackTrace(); //예외가 발생하기까지 호출된 순서를 거꾸로 출력
		}catch(Exception e) {
			System.out.println("오류 발생 : " + e);
		}
		System.out.println("GOOD");
	}
}
