package Chap4_스택과큐;
/*
 * 교재에 있는 소스코드
 * 입력하여 실행 실습
 * 정수형 스택 소스 코드
 * 객체스택과 큐에 대한 구현도 정수 스택의 예외처리 방식을 반복 적용함 
 */

import java.util.Scanner;

//int형 고정 길이 스택

class IntStack4 {
	private int[] stk; // 스택용 배열
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터

//자바 내장클래스 Exception > RuntimeException
//	public class EmptyIntStackException(이름맘대로, 다만 다른 사람이 봤을 때 유추할 수 있는 변수명이 좋음) extends RuntimeException(자바제공 =변경 x) {
//--- 실행시 예외: 스택이 비어있음 ---//
	public class EmptyIntStackException extends RuntimeException {
//		스택이 전부 pop 되서 비었을 때 empty 예외를 발생시킴
	}

//--- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowIntStackException extends RuntimeException {
//		스택이 전부 가득찼을 때 overflow 예외를 발생시킴
	}

//--- 생성자(constructor) ---//
	public IntStack4(int maxlen) {
		top = 0; // 스택이 비었다는 뜻임.
		capacity = maxlen;
		// try 문에서 오류가 나면 catch 문에서 capacity = 0;하고 끝냄.
		try {
			stk = new int[capacity]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			capacity = 0;
		}
	}

//--- 스택에 x를 푸시 ---// 반복 숙달.
	public void push(int x) throws OverflowIntStackException {
		if (isFull()) // 스택이 가득 참 //isFull이면 throw문 출력 = return 안됨.
			throw new OverflowIntStackException();
		return stk[top++] = x;

	}

//push, pop = 135~136p
//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public int pop() throws EmptyIntStackException {
		if (isEmpty()) // 스택이 빔
			throw new EmptyIntStackException();
		return stk[--top];
	}

//--- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public int peek() throws EmptyIntStackException {
//		if (top<=0) 대신에 isEmpty 사용 ->작은 함수(많이 이동하는 함수) 사용에 익숙해지기 위해서
		if (isEmpty()) // 스택이 빔

	}

//--- 스택을 비움 ---//
	// 스택에 clear해서 비었는데 또 clear하면 빈 곳을 또 비게 하니까 예외를 발생시켜라
	public void clear() throws EmptyIntStackException {
		/*
		 * stack을 empty로 만들어야 한다. stack이 empty일 때 clear()가 호출된 예외 발생해야 한다 pop()으로 구현하지
		 * 않는다
		 */
		if (isEmpty()) // 스택이 빔
			throw new EmptyIntStackException();

	}

//--- 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 ---//
	public int indexOf(int x) {
		for (int i = top - 1; i >= 0; i--) // 꼭대기 쪽부터 선형 검색
			if (stk[i] == x)
				return i; // 검색 성공
		return -1; // 검색 실패
	}

//--- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return top;
	}

//--- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

//--- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return top >= capacity;
	}

//--- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() throws EmptyIntStackException {
		if (isEmpty()) {
			throw new EmptyIntStackException();
		}
	}
}

public class 실습4_2정수스택_배열 {
//main 메서드는 함수 호출만 한다.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack4 s = new IntStack4(4); // 최대 64 개를 푸시할 수 있는 스택

		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)push　(2)pop　(3)peek　(4)dump　(5)clear  (0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {

			case 1: // 푸시
				System.out.print("데이터: ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (IntStack4.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다." + e.getMessage());
					e.printStackTrace();
				}
				break;

			case 2: // 팝
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (IntStack4.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다." + e.getMessage());
					e.printStackTrace();
				}
				break;

			case 3: // 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntStack4.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다." + e.getMessage());
					e.printStackTrace();
				}
				break;

			case 4: // 덤프 : 스택 안에 모든 데이터를 바닥에서 꼭대기 순서로 출력 / 피크 보고 작성
				try {
					s.dump();
				} catch() {
					
				}
				break;
			case 5: //clear
				
				break;
			}
		}
	}
}