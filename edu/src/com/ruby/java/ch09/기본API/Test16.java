
package com.ruby.java.ch09.기본API;

import java.util.Arrays;

public class Test16 {
//Arrays를 통해서 배열을 통째로 복사하는 것. 440p.
	public static void main(String[] args) {
		int score[] = { 85, 90, 95, 100, 75 };
		int score2[] = Arrays.copyOf(score, score.length);
		int score3[] = Arrays.copyOfRange(score, 3, 5);

		int score4[] = new int[score.length];
		System.arraycopy(score, 0, score4, 0, score.length);
//		System.out.println(score); = 참조변수의 주소가 찍힘.
		System.out.println(Arrays.toString(score));//score 배열을toString으로 바꿈.
		System.out.println(Arrays.toString(score2));//toString이 score 주소값을 숫자 배열로 만들어주고 있음.
		System.out.println(Arrays.toString(score3));
		System.out.println(Arrays.toString(score4));

		System.out.println(Arrays.equals(score, score2));

		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.equals(score, score2));

		int index = Arrays.binarySearch(score, 100);
		System.out.println(index);
	}
}