package Chap3_검색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class train_스트링리스트정렬 {

	public static String[] removeElement1(String[] arr, String item) {

	}

	static void getList(List<String> list) {
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");

		list.add(1, "LA");
	}

	static void showList(String topic, List<String> list) {
		System.out.println(topic + "::");
		// for 문 사용 x , 확장형for 사용 o
		for (String st : list) {

		}
	}

	static void sortList(List<String> list) {
		// 방법1. list.sort(null); // list는 sort, search, binaty sseach 가 있음.
		// 방법2. 리스트를 스트링 배열로 전환 > 2장에서 사용한 배열 정렬 쓰기

	}

	static String[] removeDuplicateList(List<String> list) {
		String cities[] = new String[0];
		cities = list.toArray(cities); // list를 cities배열로 바꿔주는 함수.
		// for문으로 도시가 중복인 것들 체크 = compareTo를 사용해서
		removeElement1(cities, city(key값));
		// Array.asList = 제거되면 뒤에 값을 앞으로 자동으로 땡겨줌.
		// 중복된 것들은 제거 후 리턴

		return cities;
	}

	public static void main(String[] args) {
		// 앞에 ArrayList는 List로 바꿔도 됨. List가 상위라서
		ArrayList<String> list = new ArrayList<>();// 뒤에 <>는 앞에서 쓴거 그대로 따라가기 때문에 생략함./
		getList(list);
		showList("입력후", list);
		// sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩

//		    Collections.sort(list);

//배열의 정렬
		sortList(list);
		System.out.println();
		showList("정렬후", list);
// 배열에서 중복제거
		System.out.println();
		System.out.println("중복제거::");

		String[] cities = removeDuplicateList(list);
		ArrayList<String> lst = new ArrayList<>(Arrays.asList(cities)); // asList = 배열을 리스트로 바꿔주는 함수
		showList("중복제거후", lst);
	}
}
