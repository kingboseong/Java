
package com.ruby.java.ch09.기본API;

import java.util.Arrays;

public class Test12 {
	static void showData(String[]arr) {
		System.out.println();
		for (String st: arr)
			System.out.print(st + " -> ");
	}
	
	//문자열을 정수로 변경하는 코드.
	static void sortData(String[]arr, int[]arrInt) {
		for (int i = 0; i< arr.length;i++)
		{
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(arrInt); //맨 아래 참조변수 arrInt[]가 변경이 되면 MAIN()에서도 변경된 값을 접근 사용 
	}
	
	static void showNumber(int[]arr) {
		System.out.println();
		for (int n: arr)
			System.out.print(n + " -> ");
	}
	
	public static void main(String[] args) {
		// string 정렬의 문제 
		String arr[] = {"12", "9", "22", "5"};
		showData(arr);
		Arrays.sort(arr); //Array 기억하기 ->Array(=String문자열로 정렬) 첫번째 값으로 기준 삼아서 정렬 , 떄문에 이상하게 정렬됨.
		showData(arr);
		
		// 첫글자가 대문자면 클래스 = Inreger 라는 클래스임.
		// 기본 데이터 타입의 앞글자를 대문자로 쓰면 Wrapper클래스.
		int n1 = 10;
		Integer obj1 = n1; // Integer.valueOf(n1)
		// => Integer obj1 = Integer.valueof(n1);  = 뒤에 값을 box / valueof = 정수변수(n1)를 정수객체(obj1)로 만들어주는 메소드
		//obj1.* - methods를 사용하기 위해
		
		Integer obj2 = Integer.parseInt("20");// "9", "12" 정렬시에는 12,9가 온다 이때 필요
		int n2 = obj2; // obj2.intValue()
		//obj2.hashCode();
		
		Integer obj3 = 30; // new Integer(30)

		int n3 = obj3 + 40;

		System.out.println("\n" + n1 + " : " + obj1);
		System.out.println(obj2 + " : " + n2);
		System.out.println(n3);
		//정수로 배열로 변환후 정렬 
		int []arrInt = new int[arr.length];
		sortData(arr, arrInt); // arrInt는 참조변수 = 주소를 가지고 있음 때문에 sortData메서드를 거치고 나면 정수로 변경되서 돌아옴.
		showNumber(arrInt);

	}
}