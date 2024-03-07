package com.ruby.java.ch13;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {

	public static void main(String[] args) {

		Integer[] inum = { 1, 2, 3, 4, 5 };
		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] snum = { "1", "2", "3", "4", "5" };

		List<Integer> iList = Arrays.asList(inum);// Array라는 클래스에 있는 asList메소드를 사용
		List<Double> dList = Arrays.asList(dnum);
		List<String> sList = Arrays.asList(snum);

		double isum = sum(iList);
		double dsum = sum(dList);
		double ssum = sum(sList); // 오류 : Number로 부터 상속 받은 것 만 사용할 수 있음/ 오류를 없애려면 <?> 만 쓰면 됨.

		System.out.println("inum의 합계 : " + isum);
		System.out.println("dnum의 합계 : " + dsum);
	}

	public static double sum(List<? extends Number> list) {
		double total = 0;
		for (Number v : list) {
			total += v.doubleValue();
		}
		return total;
	}
}
