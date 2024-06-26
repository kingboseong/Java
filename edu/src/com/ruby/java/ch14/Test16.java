package com.ruby.java.ch14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

//함수형 인터페이스 API - Consumer
public class Test16 {

	public static void main(String[] args) {

		Consumer<Date> date = (d) -> {
			String s = new SimpleDateFormat("YY-MM-dd").format(d);
			System.out.println(s);
		};
		System.out.println(new Date());

	}

}
