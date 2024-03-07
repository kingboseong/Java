package com.ruby.java.ch04;

import java.util.Random;

/*
 * 하나의 자바 파일에서 함수 구현 실습
 */
public class Test_행렬연산 {	
		/*
		 * 행렬 덧셈, 곱셈 연산 메소드 정의
		 * 1차버젼: 덧셈후 바로 출력
		 * 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
		 */
		static void showMatrix(int [][]X) {
			for(int i = 0; i<X.length; i++) {
				for(int j = 0; j<X[0].length; j++) {
					System.out.print(X[i][j] + " ");
				}
				System.out.println("\t");
			}
			System.out.println("\n");
			//2차원 모습으로 출력
		}
		static void getData(int[][]b) {
			Random rnd = new Random();
			for(int i = 0; i<b.length; i++)
				for(int j = 0; j<b[0].length; j++)
					b[i][j] = rnd.nextInt(10);
		}
		
		static int[][] addMatrix(int[][]B, int[][]C){
			int[][] m;
			int r = B.length;
			int c = B[0].length;
			m = new int[r][c];
			for(int i = 0; i<r; i++)
				for(int j = 0; j<c; j++)
					m[i][j] = B[i][j] + C[i][j];
			return m;
		}
		
		static int[][] multiplyMatrix(int[][]B,int[][]E){
			int [][] n = new int[3][5];
			int r = B.length;
			int c = B[0].length;
			int c1 = E[0].length;
			for(int i = 0; i<r; i++) {
				for(int j = 0; j<c1; j++) {
					n[i][j] = 0;
					for(int k = 0; k<c; k++) { 
						n[i][j] += B[i][k] * E[k][j]; //+=를 해야 행과 열의 곱의 합을 출력함.
					}
				}
			}
			return n;
		}
		static int[][] transposeMatrix(int[][]B){
			int[][]l = new int[4][3];
			int r = B.length;
			int c = B[0].length;
			for(int i = 0; i<r; i++) {
				for(int j = 0; j<c; j++) {
					l[j][i] = B[i][j]; 
				}
			}
			return l;
		}
		public static void main(String[] args) {
			/*
			 * 난수 생성으로 초기화
			 * A[3][4] = B[3][4] + C[3][4]; 
			 * D[3][5] = B[3][4] * E[4][5];
			 * F[4][3] = B[3][4]의 전치 행렬
			 */
			int [][]A;
			int [][]B = new int [3][4];
			int [][]C = new int [3][4];
			int [][]D;
			int [][]E = new int [4][5];
			int [][]F;

			
			System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
			getData(B);
			getData(C);
			getData(E);
			
			A = addMatrix(B, C);
			showMatrix(B);
			showMatrix(C);
			showMatrix(A);
			
			System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
			D = multiplyMatrix(B,E);
			showMatrix(B);
			showMatrix(E);
			showMatrix(D);
			
			System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
			F = transposeMatrix(B);
			showMatrix(B);
			showMatrix(F);

		}

	}



