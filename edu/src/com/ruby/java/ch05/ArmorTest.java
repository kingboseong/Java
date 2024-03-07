package com.ruby.java.ch05;

class Armor{
	
	private String name = "홍길동";
	private int height = 180;
	int weight = 100;
	String color = "Red";
	
	void takeoff() {
		System.out.println("Take Off");
	}
	private void land() {
		System.out.println("Land");
	}
	private void shootLaser() {
		System.out.println("Shoot Laser");
	}
}

public class ArmorTest{
	public static void main(String[] args) {
		Armor armor = new Armor();
		
		armor.takeoff();; // 위 필드, 메서드에 private 를 추가하면 .을 입력했을 때 필드, 메서드 내 특징, 동작을 쓸 수 없음.
	}
}