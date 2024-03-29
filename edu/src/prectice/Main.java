package prectice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = null;
		int[] b = null;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int sum = a[i] + b[i];
			System.out.println(sum);
		}
	}
}
