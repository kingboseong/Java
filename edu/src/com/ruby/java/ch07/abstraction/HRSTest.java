package com.ruby.java.ch07.abstraction;
//추상클래스
abstract class Employee {
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	
	public void calcBonus() {
		System.out.println("Salesman 보너스 + 기본급 * 12 * 4");
	}
}	

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Conultant 급여 = 기본급 + 컨설팅 특별 수당");
		}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 *12 * 2");
	}
}	

abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");	
	}
}

class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}
// Employee 대신 Salasman 이 오면 파라미터 패싱이 일어니지 않아 오류가 남?
// Salesman s = (new Salesman();)=>메모리(힙메모리_)공간할당
public class HRSTest{
	public static void calcTax(Employee e) {
	}
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Employee e = new Salesman();
		Director d = new Director();
		System.out.println(s.toString());
		HRSTest h = new HRSTest();
		HRSTest.calcTax(s);
		h.calcTax(e);
		calcTax(e);
//		Manager m = new Manager();
		
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
		s.equals(h);
		System.out.println(s.toString());
	}
}
