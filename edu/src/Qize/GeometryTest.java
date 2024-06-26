package Qize;

import java.util.function.Function;

//Geometry부모 클래스를 다른 자식 클래스에게 상속함.

//주석 공부 요령
//최상위 추상 클래스 Geometry 생성 ==> 추상 메서드로 면적 구하는 메서드 선언
abstract class Geometry {
	abstract double getArea();
}

//자식 클래스들 생성 ==> Circle, Rectangle,Triangle
class Circle extends Geometry {

	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Geometry {

	int w;
	int h;

	public Rectangle(int w, int h) {
		this.h = h;
		this.w = w;
	}

	@Override
	double getArea() {
		return (double) (h * w);
	}
}

class Triangle extends Geometry {

	int w;
	int h;

	public Triangle(int w, int h) {
		this.h = h;
		this.w = w;
	}

	@Override
	double getArea() {
		return (double) (h * w * 0.5);
	}
}

public class GeometryTest {

	public static void main(String[] args) {
		// Function 람다 생성
		Function<Geometry, Double> func = (g) -> {
			return g.getArea();
		};
		// 출력
		System.out.println("원 면적 : " + func.apply(new Circle(5)));
		System.out.println("사각형 면적 : " + func.apply(new Rectangle(5, 10)));

	}
}
