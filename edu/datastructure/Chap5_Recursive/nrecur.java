package Chap5_Recursive;

import java.util.Scanner;

public class nrecur {

	static void recur(int n) {
//		while (n > 0) { //if(n > 0)
		while (true)
			if (n > 0) {
				s.push(n); // recur(n-1);
				n = n - 1;
				continue;
			}
			if (s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		recur(n - 1);
		System.out.println(n); // n값 출력
		n = n - 2; // recur(n - 2);
	}

	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요.: ");
		int x = stdIn.nextInt();

		recur(x);
	}
}
