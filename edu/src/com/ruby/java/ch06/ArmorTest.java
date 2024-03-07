package com.ruby.java.ch06;

public class ArmorTest {
	
	public static void main(String[] args) {
		
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();

		suit1.setName("mark6");
		suit1.setHeight(180);
		//아래는 오류가 안뜸. 근데 위 괄호는 오류가 뜸. 스택 메모리랑 힙 메모리라서 그런가??ㄴ
		{
		suit2.setName("mark16");
		suit2.setHeight(220);
		}
		suit3.setName("mark38");
		suit3.setHeight(200);
		
		System.out.println(suit1.getName() + ":" + suit1.getHeight());
		System.out.println(suit2.getName() + ":" + suit2.getHeight());
		System.out.println(suit3.getName() + ":" + suit3.getHeight());
	}
}
