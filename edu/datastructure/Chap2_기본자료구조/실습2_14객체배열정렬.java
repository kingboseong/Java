package Chap2_기본자료구조;

//구글링 : comparator, comparable 차이가 무엇인지 사용 예 파악
//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData> {
	String name;
	int height;
	double vision;

	@Override
	public String toString(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
s
	@Override
	public int compareTo(PhyscData p) { // PhyscData메소드 , name, height, vosion 중 뭘 가저올지를 이 메서드에 구현.
		this.name = p.name;
	}

//	public int equals(PhyscData p) {
//		
//	}
}

public class 실습2_14객체배열정렬 {
	static void swap(PhyscData[] arr, int ind1, int ind2) {
		PhyscData t = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = t;
	}

	static void sortData(PhyscData[] arr) {
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
//				if(arr[i] > arr[j]) //compareTo 사용 - 구글링 하기
				if (arr[i].compareTo(arr[j]) > 0)
					swap(arr, i, j);
	}

	public static void main(String[] args) {
		PhyscData[] data = { new PhyscData("홍길동", 162, 0.3), new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7), new PhyscData("김홍길동", 172, 0.3), new PhyscData("이길동", 182, 0.6),
				new PhyscData("박길동", 167, 0.2), new PhyscData("최길동", 169, 0.5), };
		showData(data);
		sortData(data);
		// Arrays.sort(null, null);//comparator가 필요하다
		showData(data);
		data[0].compareTo(data[1]);
	}

	static void showData(PhyscData[] arr) {
		for (PhyscData num : arr)
			System.out.print(num + " ");
	}

}
