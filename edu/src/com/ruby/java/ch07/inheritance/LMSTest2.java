package com.ruby.java.ch07.inheritance;

public class LMSTest2{
	
	public static void main(String[] args) {
		// 이 처럼 new 클래스명 ()의 경우 괄호안에 값이 없으면 기본 생성자임으로 자식 클래스에 생성된 생성자()에도 아무 값이 없어야 오류가 없음
		//그런데 아래처럼 값이 있는데 혹은 여기는 없고 자식 클래스 생성자에 값이 있는데 여기()안에 빈칸이면 오류가 난다. 미스메치이기 떄문!!!!
		Professor p = new Professor("홍길동", 20, "자바");
		Employee e = new Employee("김성모", 14, "작가");
		Student s = new Student("호랑이", 55);
	
//		p.setName("김푸름");
		
//		p.setAge(52);
//		p.setSubject("빅데이터");
		
		System.out.println(p.toSting());
		System.out.println(e.toSting());
		System.out.println(s.toSting());
	}
}
