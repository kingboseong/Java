package Chap4_스택과큐;

//List를 사용한 선형 큐 구현  - 큐는 배열 사용한다 
import java.util.Random;
import java.util.Scanner;

import Chap4_스택과큐.Queue4.EmptyQueueException;
import Chap4_스택과큐.Queue4.OverflowQueueException;

/*
 * Queue of ArrayList of Point
 */

class Point3 {
	private int ix;
	private int iy;

	public Point3(int x, int y) {
		ix = x;
		iy = y;
	}

	@Override
	public String toString() {
		return "<" + ix + ", " + iy + ">";
	}

	public int getX() {
		return ix;
	}

	public int getY() {
		return iy;
	}

	public void setX(int x) {
		ix = x;
	}

	public void setY(int y) {
		iy = y;
	}

	@Override
	public boolean equals(Object p) {
		if ((this.ix == ((Point3) p).ix) && (this.iy == ((Point3) p).iy))
			return true;
		else
			return false;
	}
}

//int형 고정 길이 큐
class objectQueue2 { // 5개의 필드가 있다.
	private Point3[] que; // 참조변수
	private int capacity; // 큐의 크기 //배열의 length
	private int front; // 맨 처음 요소 커서
	private int rear; // 맨 끝 요소 커서
	private int num; // 현재 데이터 개수

	public objectQueue2(int maxlen) {// 배열의 크기만 매개변수로 받은 것
//	public objectQueue2(Point3[] que, int capacity, int front, int rear, int num) { 원래는 이런식으로 받았지만
		que = new Point3[maxlen];
		this.capacity = maxlen;
		front = rear = 0;
//		num = 0;  //num 사용x
	}

	// --- 실행시 예외: 큐가 비어있음 ---// 반복 숙달해보기
//	public class EmptyQueueException extends RuntimeException {
//		public EmptyQueueException() { => super써서 파라미터 있는 걸로 바꾸기
//		}
//	}

	// --- 실행시 예외: 큐가 가득 찼음 ---//
//	public class OverflowQueueException extends RuntimeException {
//		public OverflowQueueException() {
//		}
//	}

	// --- 생성자(constructor) ---//
	public objectQueue2(int maxlen) {
//		위에 만들어 놨네
	}

	// --- 큐에 데이터를 인큐 ---//
	public int enque(Point3 x) throws OverflowQueueException {

	}

	// --- 큐에서 데이터를 디큐 ---//
	public Point3 deque() throws EmptyQueueException {

	}

	// --- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
	public Point3 peek() throws EmptyQueueException {

	}

	// --- 큐를 비움 ---//
	public void clear() {
		num = front = rear = 0;
	}

	// --- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
	public int indexOf(Point3 x) {

	}

	// --- 큐의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

	// --- 큐에 쌓여 있는 데이터 개수를 반환 ---//
	public int size() {
		return num;
	}

	// --- 큐가 비어있는가? ---//
	public boolean isEmpty() {
		return num <= 0;
	}

	// --- 큐가 가득 찼는가? ---//
	public boolean isFull() {
		return num >= capacity;
	}

	// --- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//
	public void dump() {

	}
}

public class train_실습4_4객체선형큐_배열 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		objectQueue2 oq = new objectQueue2(4); // 최대 64개를 인큐할 수 있는 큐
		Random random = new Random();
		int rndx = 0, rndy = 0;
		Point3 p = null;
		while (true) {
			System.out.println(" "); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", oq.size(), oq.getCapacity());
			System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(0)종료: ");
			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			switch (menu) {
			case 1: // 인큐

				rndx = random.nextInt(20);

				rndy = random.nextInt(20);
				System.out.print("입력데이터: (" + rndx + ", " + rndy + ")");
				p = new Point3(rndx, rndy);
				try {
					oq.enque(p);
				} catch (objectQueue2.OverflowQueueException e) {
					System.out.println("stack이 가득찼있습니다.");
				}
				break;

			case 2: // 디큐
				try {
					p = oq.deque();
					System.out.println("디큐한 데이터는 " + p + "입니다.");
				} catch (objectQueue2.EmptyQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					p = oq.peek();
					System.out.println("피크한 데이터는 " + p + "입니다.");
				} catch (objectQueue2.EmptyQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 4: // 덤프
				oq.dump();
				break;
			default:
				break;
			}
		}
	}
}