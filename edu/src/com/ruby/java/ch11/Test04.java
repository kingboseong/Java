package com.ruby.java.ch11;

import java.io.FileInputStream;


public class Test04 {

	public static void test() throws Exception {
//		int t =10/0;
		FileInputStream fi = new FileInputStream("a1.txt");
		int c = fi.read();
		System.out.println((char) c);
	}
	//		}catch(Exception e) {
	//			e.printStackTrace();
	//		}


	public static void main(String[] args) {
		System.out.println("Start");
		try {
			test(); //try - catch 문이 없으면 위에서 던진 오류를 받을 수 없어서 오류가 남.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
