package com.ruby.java.ch06;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
 * static 멤버 함수 구현
 * toString() 함수 구현과 사용
 * 객체 배열 사용   +++   자식클래스에 showobject 출력시키키. ++마지막에 for문의 출력모양 확실히 알기
 */
abstract class InterfaceStudents {
	public abstract void showObject(); // showObject를 가진 추상 메서드를 포함한 추상 클래스는 absteact를 같이 써줘야하고
										// 이 추상메서드(InterfaceStrudents)를 상속받는 클래스는 꼭 showObject(추상메서드)를 사용해야한다.
										// 이 때 사용된 추상메서드는 자식클래스에서 사용하기 위해서 인 듯 하다.
}

// 보면 InterfaceStudents는 부모의부모의부모의부모클래스다.
// 
class Student extends InterfaceStudents {

	static int countStudents;// 객체수
	int sid;// 학번
	String sname; // 학생 이름
	String city; // 주소 도시

	public Student() {
		Student.countStudents++;
	}

	public Student(int sid) {
		this();
		this.sid = sid;
	}

	public Student(int sid, String name, String city) {
//	 this();
//	 this.sid = sid;
		this(sid);
		this.sname = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", city=" + city;
	}

	public void showObject() {
		System.out.println("[" + sid + ", " + sname + ", " + city + "]");
	}

	static void showNumberObjects() {// 생성된 객체수를 출력한다.
		System.out.println(" 생성객체수=" + countStudents);
	}
}

class WorkStudent extends Student {
	String eno;
	String company;

	public WorkStudent(int sid, String name, String city, String eno, String company) {
		super(sid, name, city);
		this.eno = eno;
		this.company = company;
	}

	public WorkStudent(String eno, String company) {
		this.eno = eno;
		this.company = company;
	}

	public String toString() {
		return "eno=" + eno + ",company=" + company;
	}

	public void showObject() {
		// Student 출력 코드 추가
		// System.out.println("["+eno +", " + company + "]"); == super.showObject();
		super.showObject();
		System.out.println("[" + eno + ", " + company + "]");
	}
}

class CodingWorkStudent extends WorkStudent {
	String language; // 필드 변수
	// CodingWorkStudent 생성자도 CodingWorkStudent의 필드.

	public CodingWorkStudent(String eno, String company, String language) {
		super(eno, company); // 여기에 오류를 없애기 위해서는 부모메서드에 같은 형태의 파라미터를 가진 생성자가 존재해야 한다.
		this.language = language;
	}

	// CodingWorkStudent의 메서드
	public String toString() {
		return "language=" + language;
	}

	public void showObject() {
		// WorkStudent 출력 코드 추가
		super.showObject();
		System.out.println("[" + language + "]");
	}
}

// 생성자 구현한다.
public class Test_Chap06_객체배열 {
	static void showObjects(InterfaceStudents is) {
		is.showObject();
	}

	public static void main(String[] args) {
		Student arry[] = new Student[5];
		Student.showNumberObjects(); // Student클래스에서 showNumberObjects를 가져옴.!!!
		arry[0] = new Student(202301);
		arry[1] = new Student(202301, "kim", "busan");
		arry[2] = new WorkStudent(13, "rim", "bud", "2", "com");
		arry[3] = new CodingWorkStudent("bb", "cmom", "ko");
		arry[4] = new WorkStudent(13, "rim", "bud", "2", "com");
		Student.showNumberObjects(); // showNumberObjects는 static으로 만들어진 메서드를 가져오기때문에 클래스이름에 .만 붙혀서 가져와도 됨.

		for (Student s : arry) {
			System.out.println(s);
			showObjects(s);
		}
		for (Student sx : arry) {
			System.out.println(sx);
//		 showObjects(sx);
		}
	}
}
//package com.ruby.java.ch06;
//
////Abstract class defining method signature
//abstract class InterfaceStudents {
// public abstract void showObject();
//}
//
////Base class Student
//class Student extends InterfaceStudents {
// static int countStudents; // Number of objects
// int sid; // student number
// String sname; // student name
// String city; // address city
//
// // Default constructor
// public Student() {
//     countStudents++;
// }
//
// // Parameterized constructor with student number
// public Student(int sid) {
//     this();
//     this.sid = sid;
// }
//
// // Parameterized constructor with student number, name, and city
// public Student(int sid, String name, String city) {
//     this(sid);
//     this.sname = name;
//     this.city = city;
// }
//
// // Overriding toString method to display student information
// @Override
// public String toString() {
//     return "sid=" + sid + ", sname=" + sname + ", city=" + city;
// }
//
// // Method to display student object
// public void showObject() {
//     System.out.println("[" + sid + ", " + sname + ", " + city + "]");
// }
//
// // Static method to display number of created objects
// static void showNumberObjects() {
//     System.out.println("Number of created objects = " + countStudents);
// }
//}
//
////Subclass WorkStudent extending Student
//class WorkStudent extends Student {
// String eno;
// String company;
//
// // Parameterized constructor with student number, name, city, employee number, and company
// public WorkStudent(int sid, String name, String city, String eno, String company) {
//     super(sid, name, city);
//     this.eno = eno;
//     this.company = company;
// }
//
// // Overriding toString method to display work student information
// @Override
// public String toString() {
//     return super.toString() + ", eno=" + eno + ", company=" + company;
// }
//
// // Overriding showObject method to display work student object
// public void showObject() {
//     System.out.println("[" + sid + ", " + sname + ", " + city + ", " + eno + ", " + company + "]");
// }
//}
//
////Subclass CodingWorkStudent extending WorkStudent
//class CodingWorkStudent extends WorkStudent {
// String language;
//
// // Parameterized constructor with student number, name, city, employee number, company, and programming language
// public CodingWorkStudent(int sid, String name, String city, String eno, String company, String language) {
//     super(sid, name, city, eno, company);
//     this.language = language;
// }
//
// // Overriding toString method to display coding work student information
// @Override
// public String toString() {
//     return super.toString() + ", language=" + language;
// }
//
// // Overriding showObject method to display coding work student object
// public void showObject() {
//     System.out.println("[" + sid + ", " + sname + ", " + city + ", " + eno + ", " + company + ", " + language + "]");
// }
//}
//
//public class Test_Chap06_객체배열 {
// static void showObjects(InterfaceStudents is) {
//     is.showObject();
// }
//
// public static void main(String[] args) {
//     // Create an array of Student objects
//     Student[] array = new Student[5];
//
//     // Create different types of Student objects and store them in the array
//     array[0] = new Student();
//     array[1] = new Student(202301, "Kim", "Busan");
//     array[2] = new WorkStudent(202302, "Lee", "Seoul", "E001", "ABC Company");
//     array[3] = new CodingWorkStudent(202303, "Park", "Incheon", "E002", "XYZ Company", "Java");
//     array[4] = new WorkStudent(202304, "Choi", "Daegu", "E003", "123 Company");
//
//     // Display the number of created objects
//     Student.showNumberObjects();
//
//     // Display the information of each Student object using the toString method
//     for (Student s : array) {
//         System.out.println(s.toString());
//     }
//
//     // Display the information of each Student object using the showObject method
//     for (Student s : array) {
//         showObjects(s);
//     }
// }
//}
