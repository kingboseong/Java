package com.ruby.java.ch13;

class Bag<T,N>{
	private T thing;
	private N name;

	
	
	public Bag(T thing, N name) {
		this.thing = thing;
		this.name = name;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	public N getName() {
		return name;
	}
	
	public void setName(N name) {
		this.name = name;
	}


	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
		System.out.println("N의 타입은 " + name.getClass().getName());
	}
}

class Book{
	public String toString() {
		return "책";
	}
}
class PrncilCase{}
class Notebook{}

public class BagTest {

	public static void main(String[] args) {
		Bag<Book, String> bag = new Bag<Book, String>(new Book(), "과학");
//		Bag<PrncilCase> bag2 = new Bag<>(new PrncilCase());
//		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		
		bag.showType();
//		bag2.showType();
//		bag3.showType();
		
		bag.showType();
		
		Book book = bag.getThing();
		String name = bag.getName();
		
		System.out.println("Thing is : " + book);
		System.out.println("name is : " + name);
//		bag = bag2; //Object이 아니라서 오류가 남
	}
}
	
//		Bag<Book> bag = new Bag<>(); // 기본 생성자가 없기 때문에 오류가 뜸. ->기본 생성자를 만들어주거나 T thing클래스에 주석을 달아서 자바가 기본 생성자를 만들도록 함.
//		bag.setThing(new Book());
//		bag.showType();
	

