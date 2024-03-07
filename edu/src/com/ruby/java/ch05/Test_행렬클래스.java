package com.ruby.java.ch05;

import java.util.Random;
/*
 * 클래스 메소드 구현 실습 목적
 */
class Matrix {
	int rows;
	int cols;
	int[]data;
	
	public Matrix(int rows, int cols) {
		this.rows = rows; //밑에 있는 계산식에 있는 this. 은 전부 여기에 있는 rows와 cols이다.
		this.cols = cols;
		data = new int[rows * cols]; // 행과 열을 곱하여 1차원 행렬로 초기화됨. A[12], C[12], E[20]
	}
	
	void getData() {
		Random rnd = new Random();
		for(int i = 0; i<(rows*cols); i++)
			data[i] = rnd.nextInt(10); //맨 앞에 this. 생략가능
		// 난수로 입력
	}
	
	Matrix addMatrix(Matrix c) {
		Matrix a = new Matrix(this.rows, this.cols);
		for (int i = 0; i < rows * cols; i++) {
            a.data[i] = this.data[i] + c.data[i];
        }
        return a;
    }
	//자 설명 드간다. 여기addMatrix는 아래에 있는 A=B.addMatrix(C)에서 왔다.그러므로 (Matrix c) = (C) 이고 return 되는 a 값은 A값이다. A값을 초기화 한 이유는 A값을 받을 인스턴스가 없기 때문이다.
	//그리고 식에 있는 this. 은 B의 행과 열인데, A행열과 동일하므로 그대로 사용해도 괜찮다.
	Matrix multiplyMatrix(Matrix e) {
		Matrix d = new Matrix(this.rows, e.cols);
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < e.cols; j++) {
                for (int k = 0; k < cols; k++) {
                    d.data[i * d.cols + j] += this.data[i * cols + k] * e.data[k * e.cols + j];
                }
            }
        }
        return d;	
	}
	
	Matrix transposeMatrix() {
		Matrix f = new Matrix(this.cols, this.rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                f.data[j * f.cols + i] = this.data[i * cols + j];
            }
        }
        return f;
    }	
	
	void showMatrix(String str) {
		//for문을 써서 일차원행렬을 2차원행렬로 바꿔야 함.
		//2차원 배열 모양으로 출력하는 코드 작성
		System.out.println(str);
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<cols; j++){
				System.out.print(data[i*cols+j] + " ");
			}System.out.println();
		}
	}
}

public class Test_행렬클래스 {
	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4];
		 * D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		Matrix B = new Matrix(3,4);
		Matrix C = new Matrix(3,4);
		Matrix A, D, F;
		Matrix E = new Matrix(4,5);

		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		B.getData();
		C.getData();
		E.getData();
		
		A = B.addMatrix(C);
		B.showMatrix("B[3][4]");
		C.showMatrix("C[3][4]");
		A.showMatrix("A[3][4]");
		
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = B.multiplyMatrix(E);
		B.showMatrix("B[3][4]");
		E.showMatrix("E[4][5]");
		D.showMatrix("D[3][5]");
		
		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = B.transposeMatrix();
		B.showMatrix("B[3][4]"); 
		F.showMatrix("F[4][3]");

	}

}
