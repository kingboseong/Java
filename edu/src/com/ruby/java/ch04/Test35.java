package com.ruby.java.ch04;

public class Test35 {

		public static void main(String[] args) {
			
			String str[] = {"apple", "banana", "mango"};
			int arr[] = {1,2,3,4,5};
			
			//일정 길이의 배열까지만 출력하고 싶을 때는 arr.length 대신 숫자입력.
			for(int i = 0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			// 위 아래 출력값 같음 but 아래가 간결한 코딩.
			for(int num : arr) {
				System.out.println(num);
			}
			
			for(String frut : str) {
				System.out.println(frut);
			}
		}
}
