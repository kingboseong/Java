//단순한 linked list에서 insert, delete하는 알고리즘을 코딩: 1단계
//난이도 상, 메뉴 만드는 방법 꼭 실습하기

package Chap8_List;

import java.util.Random;
import java.util.Scanner;

class Node1 {
	int data;
	Node1 link;

	public Node1(int element) {
		data = element;
		link = null;
	}
}

class LinkedList1 {
	Node1 first;

	public LinkedList1() {
		first = null;
	}

	public int Delete(int element) // delete the element
	{
		Node1 P = first, q = null;
		return -1;// 삭제할 대상이 없다.
	}

	public void Show() { // 전체 리스트를 순서대로 출력한다.
		Node1 p = first;
		System.out.println("***리스트출력***");
		while (p != null) {
			System.out.println(p.data + '\t');
			p = p.link; // p 는 현재 노드를 가르키고, .link 는 현재 노드의 링크(다음 노드를 가르키는 포인터)이다.
						// 따라서 p = p.link; 는 p 가 가르키는 링크의 값을 p 에 저장한다는 뜻
						// 다음 노트를 출력하겠다는 말 = 리스트 순회
		}
	}

	public void Add(int element) // 임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다
	{
		Node1 newNode = new Node1(element); // 삽입하려는 새로운 노드 생성
		if (first == null) {
			first = newNode; // 첫번째 포인트(헤드, first)가 새 노드를 가리키게 됨.
			return;
		} else if (element < first.data) {
			newNode.link = first;
			first = newNode;
		} else {
			Node1 p = first;
			Node1 q = null;
			// 직관적인 변수명으로 바꾸기 p = 빈노드
			while (p != null) {
				if (element > p.data) {
//					System.out.println(element + "," + p.data);
					q = p; // 임시저장
					p = p.link;
				}
			}
			q.link = newNode;
			newNode.link = p;
		}

	}

//				} else if (element < p.data) {
//					// insert 해야함.잘 작동
//					newNode.link = p;
//					first = newNode;
//					p = first.link;
//					// null된 q값이 공중에 뜸.
//					break;
//				}else if(값이 중간에 들어갈 때){
//					q = p.link;
//					p.link = newNode;
//					newNode.link = q;
//					
//				}else if(element값이 기존 노드값과 같을 때){
//						
//					}
//				} 

	/*
	 * 일반적이지 않음. if (element > p.data) { p.link = temp; } else { temp.link = p;
	 * first = temp; }
	 */

	public boolean Search(int data) { // 전체 리스트를 순서대로 출력한다.
		Node1 ptr = first;

		return false;
	}
}

public class 실습8_1정수연결리스트_test {
	// menu라는 클래스가 5개의 클래스를 가지고 있다고 생각하기.
	enum Menu {
		Add("삽입"), Delete("삭제"), Show("인쇄"), Search("검색"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values()) // Menu은 static메서드 // 여기서 생성자가 호출됨.
				if (m.ordinal() == idx) // ordinal = 기수 ,첫번째값.=
					return m;
			return null;
		}

		// "Add" 상수가 정의될 때 Menu("삽입") 생성자가 호출되어 message 필드가 "삽입"으로 초기화
		// 생성자는 각 상수가 정의될 때 호출되며, 해당 상수의 message 필드를 초기화하는 역할
		// enum 상수가 언제 정의되는가를 찾아 보아야 한다
		Menu(String string) { // 생성자(constructor)가 언제 호출되는지 파악하는 것이 필요하다(58), string 에 삽입이 들어오고 massage 로 이동
								// string=변수
			message = string;
			System.out.println("\nMenu 생성자 호출:: " + string);
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) { // Menu.values() = Menu 생성자가 호출됨. 심볼들의 값
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage()); // m.ordinal()
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu; // menu 는 참조 변수일 뿐이다
		Random rand = new Random();
		LinkedList1 l = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		int data = 0;
		l.Show();
		do {
			switch (menu = SelectMenu()) {// Menu 생성자 호출 - menu 객체를 리턴한다
			case Add:
				data = rand.nextInt(20);
				System.out.println(data);
				l.Add(data);
				System.out.print("삽입후 리스트: ");
				l.Show();
				break;
			case Delete:
				data = sc.nextInt();
				int num = l.Delete(data);
				System.out.println("삭제된 데이터는 " + num);
				break;
			case Show:
				l.Show();
				break;
			case Search: // 회원 번호 검색
				int n = sc.nextInt();
				boolean result = l.Search(n);
				if (!result)
					System.out.println("검색 값 = " + n + " 데이터가 없습니다.");
				else
					System.out.println("검색 값 = " + n + " 데이터가 존재합니다.");
				break;
			case Exit:
				break;
			}
		} while (menu != Menu.Exit);
	}
}
