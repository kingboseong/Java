package com.ruby.java.ch04;

import java.util.Random;

public class Test41 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		Random rand = new Random();
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				arr[i][j] = rand.nextInt(25);
			}
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				if(i >= j)
					System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
	}
}
