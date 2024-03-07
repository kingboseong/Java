package Qize;

import java.util.Random;

public class Q3_Matrix1 {
	
	public static void main(String[] args) {
		
		int [][] A = new int[3][4]; //난수 입력
		int [][] B = new int[4][5]; //난수 입력
		int [][] C = new int[3][5];
		int [][] D = new int[3][4]; //난수 입력
		int [][] E = new int[3][4];
		int [][] F = new int[4][3];
		
		//C = A * B //행렬곱하기
		//E = A + D //행렬 더하기
		//F = A의 전치 행렬
		
		
		//A의 행렬
		Random rand = new Random();
		for(int i = 0; i<A.length; i++) {
			for(int j = 0; j<A[i].length; j++) {
				A[i][j] = rand.nextInt(25);
			}
		}
	
		for(int i = 0; i<A.length; i++) {
			for(int j = 0; j<A[i].length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
				
		
		//B의 행렬
		for(int i = 0; i<B.length; i++) {
			for(int j = 0; j<B[i].length; j++) {
				B[i][j] = rand.nextInt(25);
			}
		}
		
		for(int i = 0; i<B.length; i++) {
			for(int j = 0; j<B[i].length; j++) {
				System.out.print(B[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		//C행렬 A * B
		
		
		
		
		
		
	}
}
