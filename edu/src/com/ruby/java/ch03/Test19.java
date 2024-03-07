package com.ruby.java.ch03;

import java.util.Scanner;

public class Test19 {
	
	public static void main(String[] args) {
		
//		int score = 90;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수:");
		int score = sc.nextInt();		
		
		char grade = 0;
		
		if(score >=90) {
			grade = 'A';
		}else if (score >=80){
			grade = 'B';
		}else if (score >=70){
			grade = 'C';
		}else if (score >= 60){
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);
		
	}
}
