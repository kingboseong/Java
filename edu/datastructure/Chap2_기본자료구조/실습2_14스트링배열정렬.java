package Chap2_기본자료구조;

public class 실습2_14스트링배열정렬 {

	public static void main(String[] args) {
		String[] data = { "apple", "grape", "persimmon", "pear", "blueberry", "strawberry", "melon", "oriental melon" };

		showData(data);
		sortData(data);
		showData(data);
	}

	static void showData(String[] arr) {
		for (String name : arr) {
			System.out.print(name + "\t");
		}
		System.out.println();
	}

	static void swap(String[] arr, int ind1, int ind2) {
		String t = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = t;
	}

	static void sortData(String[] arr) {
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
//				if (arr[i] > arr[j]) // compareTo() 사용 //if는 숫자열에만 가능
				if (arr[i].compareTo(arr[j]) > 0) {// 문자열 i랑 j랑 아스키코드로 크고 작음을 비교하는 함수 // i가 j보다 크면 양수,true
					swap(arr, i, j);
				}

	}

}
