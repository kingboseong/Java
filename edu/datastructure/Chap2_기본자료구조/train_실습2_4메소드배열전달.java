package Chap2_기본자료구조;

//성공
//메소드에 배열 전달 실습부터
//실습 설명한다 
//매개변수로 배열 전달
import java.util.Random;

public class train_실습2_4메소드배열전달 {

	public static void main(String[] args) {
		int[] data = new int[10];
		inputData(data);
		showData(data);
		int max = findMax(data);
		System.out.println("\nmax = " + max);
		boolean existValue = findValue(data, 3);
		System.out.println("찾는 값 = " + 3 + ", 존재여부 = " + existValue);
	}

	static void showData(int[] data) {
		for (int num : data) {
			System.out.print(num + " ");
		}
	}

	public static void inputData(int[] data) {// 교재 63 - 난수의 생성
		Random rand = new Random(); // 난수를 만들겠다고 선언을 한 것.
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(10);// rand.nextInt() 괄호안에 값안으로 난수 생성됨.
		}
	}

	static int findMax(int[] items) {
		int max = items[0];
		for (int i = 0; i < items.length; i++) {
			if (items[i] < max) {
				items[i] = max;
			}
		}
		return max;
	}

	static boolean findValue(int[] items, int value) {
		// items[]에 value 값이 있는지를 찾는 알고리즘 구현
		boolean existValue = false;
		for (int i = 0; i < items.length; i++) {
			if (items[i] == value) {
				return true;
			}
		}
		return false;
	}

}
