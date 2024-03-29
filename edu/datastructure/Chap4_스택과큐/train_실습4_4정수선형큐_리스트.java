package Chap4_스택과큐;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//선형 큐 구현
import java.util.Scanner;

//int형 고정 길이 큐

class Queue4 {
	private List<Integer> que;// 원형큐로 구현하지 않는다
	private int capacity; // 큐의 크기
	private int front; // 맨 처음 요소 커서
	private int rear; // 맨 끝 요소 커서
//	private int num; // 현재 데이터 개수 // 길이는 length로 바로 구해지니까 num 사용 x

//--- 실행시 예외: 큐가 비어있음 ---//
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
			System.out.println("큐 비었음");
		}
	}

//--- 실행시 예외: 큐가 가득 찼음 ---//
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
			System.out.println("큐 가득참");
		}
	}

//--- 생성자(constructor) ---//
	public Queue4(int maxlen) {
		rear = front = 0;
		capacity = maxlen;
		try {
			que = new ArrayList<Integer>();
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

//--- 큐에 데이터를 인큐 ---//
	public int enque(int x) throws OverflowQueueException {
		if (isFull())
			throw new OverflowQueueException();
		que.add(x);
		rear++;
		return x;
	}

//--- 큐에서 데이터를 디큐 ---//
	public int deque(int x) throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException();
		int n = que.remove(front);
		rear--; // 교수님의 함정카드임 .. 값이 사라지면 자동으로 값들이 front로 이동 + 인덱스 값도 변한다....!!!
		return n;
	}

//--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
	public int peek() throws EmptyQueueException {
		if (que.size() <= 0)
			throw new EmptyQueueException();
		return que.get(0);
	}

//--- 큐를 비움 ---//
	public void clear() {
//		num = front = rear = 0;
		int a = que.size();
		a = rear = front = 0;
	}

//--- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
	public int indexOf(int x) {
		for (int i = 0; i < que.size(); i++) {
			int idx = (i + front) % capacity;
			if (que.get(idx) == x) // get 숙달하기
				return idx;
		}
		return -1;
	}

//--- 큐의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
	public int size() {
//		return num;
		return rear - front;
	}

//--- 큐가 비어있는가? ---//
	public boolean isEmpty() {
//		return num <= 0;  //num 사용하지 말고 코드 짜기
		return que.size() == 0;
	}

//--- 큐가 가득 찼는가? ---//
	public boolean isFull() {
//		return num >= capacity;
		return que.size() == capacity;

	}

//--- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//
	public void dump() {
		if (que.size() <= 0)
			throw new EmptyQueueException();
		for (int i = front; i < rear; i++)
			System.out.println(que.get(i));
	}
}

public class train_실습4_4정수선형큐_리스트 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Queue4 oq = new Queue4(4); // 최대 64개를 인큐할 수 있는 큐
		Random random = new Random();
		int rndx = 0, p = 0;
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
				System.out.println("입력데이터: (" + rndx + ")");
				try {
					oq.enque(rndx);
				} catch (Chap4_스택과큐.Queue4.OverflowQueueException e) {
					System.out.println("stack이 가득찼있습니다.");
				}
				break;

			case 2: // 디큐
				try {
					p = oq.deque(rndx);
					System.out.println("디큐한 데이터는 " + p + "입니다.");
				} catch (Chap4_스택과큐.Queue4.EmptyQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					p = oq.peek();
					System.out.println("피크한 데이터는 " + p + "입니다.");
				} catch (Chap4_스택과큐.Queue4.EmptyQueueException e) {
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