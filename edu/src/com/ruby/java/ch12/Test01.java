package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {
	
	public static void main(String[] args) {
		try(FileInputStream fi = new FileInputStream("a.txt"); //파일을 읽는 객체
				FileOutputStream fo = new FileOutputStream("b.txt");){ //파일을 쓰는 객체
			int c = 0;
			while((c=fi.read()) != -1) {
				fo.write(c);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}