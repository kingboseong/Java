package Qize;

public class Gugudan {
	// 한 단씩 출력
	// public void print(int i) {
	// Scanner sc = new Scanner(System.in);
	// System.out.println("출력하고자 하는 구구단을 입력하세요 : ");
	// int score = sc.nextInt();
	//// System.out.println(i + "단");
	// // i 구구단 출력 시작
	//
	// if(2<=score & score<=9) {
	// for(int j = 1; j<=9; j++) {
	// int m = 0;
	// m = score*j;
	// System.out.print(score + "*" + j + "=" + m);
	//
	// // i 구구단 출력 끝
	// System.out.print("\t");
	// }
	// }else
	// System.out.println("구구단이 아닙니다유");
	// }
	//
	// 전체 구구단 세로로 출력
	// public void printHorizontal() {
	//
	//
	// for(int i = 1; i<10; i++) {
	// for(int j = 2; j<10; j++) {
	//
	// int m = 0;
	// m=j*i;
	// System.out.print(j + "*" + i + "=" + m + "\t");
	// }
	// System.out.println("\n");
	// }
	// }

	public void printColumn(int col) {

		int mok = (9 / col) + 1;
		for (int k = 0; k < mok; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= col + 1; j++) {
					int num = j + (col * k);
					if (num > 9) {
						break;
					}
					System.out.print(num + "*" + i + "=" + (i * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
////교수님 정답
//	public void printColumn(int col) {
//		if (9 < col) {
//			System.out.println("coll is not valid![1~9]");
//			return;
//		}
//
//		for (int i = 2; i < 10; i += col) {
//			for (int j = 1; j < 10; j++) {
//				for (int k = 0; k < col; k++) {
//
//					if (10 <= i + k) {
//						System.out.print("\n");
//						break;
//					}
//
//					System.out.printf("%d*%d=%d", (i + k), j, (i + k) * j);
//
//					if (k < col - 1)
//						System.out.print("\t");
//					else
//						System.out.print("\n");
//				}
//			}
//			System.out.println();
//		}
//	}
}
