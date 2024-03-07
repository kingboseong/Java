package Qize;

import java.util.Scanner;

public class Q4 {
	
	//2g, 3g, 5g 추가 각각 10개씩 있을 떄, 10~100사이의 임의의 값을 입력 받고, 
	//추의 합이 입력 받은 값이 되는 경우를 찾아서 출력하세요.단, 각각의 추는 1개
	//이상은 사용되어야 합니다.
	
	//출력 예
	//입력 값 : 31
	//출력 값 : (1,3,4)(1,8,1)(2,4,3)(3,5,2)(4,1,4)(4,6,1)(5,2,3)(6,3,2)(7,4,1)(9,1,2)(10,2,1) : 11

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 값 :" );
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i<11 ; i++) {
			for(int j=1 ; j<11 ; j++) {
				for(int k=1 ; k<11 ; k++) {
					if((2*i) + (3*j) + (5*k) == num) {
						System.out.print("(" + i + "," + j + "," + k + ")");	
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
