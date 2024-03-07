package com.ruby.java.ch08.innerClass;

class Node3 {
	int data;
	Node3 link; 
	public Node3(int data) { //생성자
		this.data = data; 
		link = null; //이 노드에 연결된 다음 노드가 없을믈 나타낸다.
	}
}
class LinkedList3 {
	Node3 first;
	void append(int data) {
		Node3 p = first, q = null;
		//여기에 추가 코딩 실시
		Node3 newNode = new Node3(data);
		if( p==null) {
			first = newNode;
			return;
		}else {
			while(p != null) {
				q = p;
				p = p.link;
			}
			q.link = newNode;
		}
	}
	public LinkedList3() {
		first = null;
	}

	void showList() {
		System.out.println();
		Node3 p = first;

	}
	void insert(int data) {
		Node3 newNode = new Node3(data);
		Node3 p = first, q = null;


	}

}

public class Test_ch08_연결리스트와배열 {
	//getlist 배열의 값 넣기
	static int getList(int[]data) {
		int count = 0;
		int mid = data.length/2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5; count++;
		}
		return count;
	}
	static void showList(int[]data) {
		System.out.println();
		for (int i=0; i < data.length; i++)
			System.out.print(" " + i + " ");

		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i]+ " ");
		}
	}
	//배열로 리스트
	static int insertList(int[] data, int count, int x) {
		int indx = 0;
		while(indx < count) {
			if(x < data[indx]) {
				while(indx <= count) {
					int temp = data[indx];
					data[indx] = x;
					x = temp;
					indx++;
				}
				break;
			}
			else
				indx++;
		}
		count++;
		return indx;
	}
	
	
	
	public static void main(String[] args) {
		int[]list = new int[10];
		int count = 0;
		System.out.println("배열로 리스트::");
		count = getList(list); 
		showList(list);
		count = insertList(list, count, 3);
		showList(list);
		count = insertList(list, count, 7);
		showList(list);

		//**************************************************

		LinkedList3 ll = new LinkedList3();
		ll.append(5);
		ll.append(10);
		ll.append(15);
		ll.append(20);
		ll.append(25);
		ll.showList();
		ll.insert(3);
		ll.showList();
		ll.insert(7);
		ll.showList();
	}
}



