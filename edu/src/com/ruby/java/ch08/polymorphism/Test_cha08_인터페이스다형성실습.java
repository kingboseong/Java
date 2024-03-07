package com.ruby.java.ch08.polymorphism;
/*
 * 인터페이스 다형성 실습 코드
 */
interface Vehicle {
	public abstract void showVehicle();
}
class Truck implements Vehicle {
	int weight;
}
class Car implements Vehicle {
	int vehicleOccupants;	
}
class Taxi extends Car {
	int mileage;
	
}
class MotorCycle implements Vehicle{
	int price;
}
public class Test_cha08_인터페이스다형성실습 {
	public static void displayVehicles(Vehicle [] a) {
		for (Vehicle v : a) {
			v.showVehicle();
		}
	}
public static void main(String[] args) {
	Vehicle [] arr = new Vehicle[5]; //객체를 만든게 아니라 배열을 만든거라서 아래에도 new를 붙혀야 함.
	arr[5] = new Vehicle; // 요류가 나는 이유 : 인터페이스라서 객체를 만들 수 없음.
	
	arr[0] = new Truck(33);
	arr[1] = new Car(4);
	arr[2] = new Taxi(2, 9000);
	arr[3] = new Truck(22);
	arr[4] = new MotorCycle(12000);
	displayVehicles(arr);
}
}
