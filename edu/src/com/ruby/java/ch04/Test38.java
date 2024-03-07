package com.ruby.java.ch04;

public class Test38 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][];
		int[][] arr2 = {{1,2}, {3,4}, {5,6}};
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		arr[4] = new int[5];
		
		System.out.println(arr.length); //행의 길이
		System.out.println(arr[1].length); //열의 길이
		
		
		System.out.println(arr2); // 출력하면 왜 이상한 값이 나올까?
	}
}
