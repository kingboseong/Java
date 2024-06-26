package com.ruby.java.ch14.methodRef;

interface StringFunc {
	String modify(String s);
}

public class Test10 {

	String func(String s) { // 맨 앞에 static 삭제했음.
		String result = "";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == ',')
				result += " ";
			else
				result += c;
		}
		return result;
	}

	public static void main(String[] args) {

//		StringFunc sf = Test10::func; // 같은 타입의 파라미터와 리턴 타입이어야만 오류가 안남.

		Test10 obj = new Test10();
		StringFunc sf = obj::func;

		String str = "Korea, Australia, Chiana, Germany, Spain,Turkey";
		String result = sf.modify(str);
		System.out.println(result);

		String str2 = "서울, 북경, 도쿄, 뉴욕, 발리";
		result = sf.modify(str2);
		System.out.println(result);
	}
}
