package com.ruby.java.ch04;

import java.util.Random;

public class Test37 {
	
	public static void main(String[] args) {
		
		//난수 생성하기
		Random rnd = new Random();
		int [] scores = new int[20];
		
		for(int i = 0 ; i < scores.length; i++) {
			scores[i] = rnd.nextInt(20);
		}
		
		for( int num : scores)
			System.out.println(num);
		//==> 코드가 한 줄이기 떄문에 {} 생략 가능.
		
		for(int i = 0; i<scores.length; i++) {
			if( i%4 == 0)
				System.out.println(" ");
			if(scores[i] < 10)
				System.out.println(" ");
			
		}	System.out.println(" ");
			
//		int[] score = {90, 44 ,55, 78, 60};
//		
//		int sum = 0;
//		double avg = 0.0;
//		int max = 0;
//		int min = 999;
//		
//		for(int i = 0; i<score.length; i++) {
//			sum += score[i];
//			if(max < score[i])
//				max = score[i];
//			if(min > score[i])
//				min = score[i];
//		}
//		
//		avg = sum /score.length;
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
//		System.out.println("최댓값 : " + max);
//		System.out.println("최솟값 : " + min);		
	}		
}

