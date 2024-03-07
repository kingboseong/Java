package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class test03 {

	public static void main(String[] args) {

		try(FileInputStream fi = new FileInputStream("a.txt")) { // 괄호 실수 했음 ( 열어놓고 닫지않아서 오류남.
//			int c = fi.read();
//			System.out.println((char) c);
			int c;
			while((c = fi.read()) != -1) {
			System.out.print(c);
			System.out.print(",");
			System.out.println((char) c);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
