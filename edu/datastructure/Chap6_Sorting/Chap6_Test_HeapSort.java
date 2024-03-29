package Chap6_Sorting;

import java.util.Random;
import java.util.Scanner;

interface MaxHeap {
	public void Insert(int x);

	public int DeleteMax();
}

class Heap implements MaxHeap {
	final int heapSize = 100;
	private int[] heap;
	private int n; // current size of MaxHeap
	private int MaxSize; // Maximum allowable size of MaxHeap

	public Heap(int n) {
		this.n = n;
	}

	// 현재 tree 를 출력
	public void display(int x) {
		int i = x;
		for (i = 0; i < n; i++)
			System.out.print(heap[i]);
	}

	@Override
	public void Insert(int x) {
		heap[n] = x;
		if (heap[n] > heap[2 / n] && heap[n] > heap[2 / n + 1])
			swap(heap, heap[n], heap[2 / n]);
	}

	private void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;

	}

	@Override
	public int DeleteMax() {

	}

	private void HeapEmpty() {
		System.out.println("Heap Empty");
	}

	private void HeapFull() {
		System.out.println("Heap Full");
	}
}

public class Chap6_Test_HeapSort {
	static void showData(int[] d) {
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		int select = 0;
		Scanner stdIn = new Scanner(System.in);
		Heap heap = new Heap(20);
		final int count = 10;
		int[] x = new int[count + 1];
		int[] sorted = new int[count];

		do {
			System.out.println("Max Tree. Select: 1 insert, 2 display, 3 sort, 4 exit => ");
			select = stdIn.nextInt();
			switch (select) {
			case 1:

				break;
			case 2:
				int num = stdIn.nextInt();
				heap.display(num);
				break;
			case 3:

				break;

			case 4:
				return;

			}
		} while (select < 5);

		return;
	}
}
