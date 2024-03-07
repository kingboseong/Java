package com.ruby.java.ch08.innerClass;

public class MyLinkedList2 {
	
	private Node head;
	
	class Node { // 내부클래스
		private String data;
		private Node link;
		public Node(String data) {
			//생성자는 필드가 2개 이므로 heap 에 필드 공간 2개를 할당
			this.data = data;
			this.link = null; //this. 써도되고 안써도되고
		}
	}
	public void add(String data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			Node next = head;
			while(next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}
	public void print() {
		
	}
	public MyLinkedList2(Node head) {
		this.head = null;
	}
	
}
