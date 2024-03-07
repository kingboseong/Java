package com.ruby.java.ch04;

public class Test32 {
	
	public static void main(String[] args) {
		
		int[]arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//sysout연발을 간단하게 작성하는 방법 - 아래 for문
		//i<=arr.length 일 경우 IndexOutOfBoundsException 라는 에러 발생!.
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		int[] score; 
//		score = {1,2,3,4}; -> 오류! 배열의 상수는 오직 initialize(메모리 공간 할당 + 값지정 동시에 하는 것) 으로만 가능
	}
}
