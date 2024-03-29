package Chap5_Recursive;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/?ref=lbp
//N Queen problem / backtracking
//모든 해가 나오는 버젼 만들기 
/*
 * 체스판은 8 x 8 체스의 기물: king/가로세로대각선 1칸만 이동, queen/가로세로 대각선/같은 편의 기물을 넘을 수 없다,
 * Rook/가로,세로 이동/다른 기물을 넘을 수없다, bishop/대각선, knight/1-2칸 이동/다른 기물을 넘을 수 있다,
 * pawn/처음 이동은 2칸까지 가능, 그 후 한칸만 가능, 잡을 때는 대각선 가능 체스판 최대 배치 문제 : king/16,
 * Queen/8, rook/8, bishop/?, knight/? rook 2개/a, h, knight 2개/b, g, bishop
 * 2개/c, f, queen 1개/black queen은 black 칸에, 폰 8개
 */
class Point {
	int ix;
	int iy;

	public Point(int x, int y) {
		ix = x;
		iy = y;
	}

	@Override
	public String toString() {
		return "<" + ix + ", " + iy + ">";
	}

	public int getX() {
		return ix;
	}

	public int getY() {
		return iy;
	}

	public void setX(int x) {
		ix = x;
	}

	public void setY(int y) {
		iy = y;
	}

	@Override
	public boolean equals(Object p) {
		if ((this.ix == ((Point) p).ix) && (this.iy == ((Point) p).iy))
			return true;
		else
			return false;
	}
}

class Stack4 {
	// --- 실행시 예외: 스택이 비어있음 ---//
	// generic class는 Throwable을 상속받을 수 없다 - 지원하지 않는다
	public class EmptyGenericStackException extends Exception {
		private static final long serialVersionUID = 1L;

		public EmptyGenericStackException(String message) {
			super(message);

		}
	}

	// --- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowGenericStackException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public OverflowGenericStackException(String message) {
			super(message);

		}
	}

	private List<Point> data; // 스택용 배열
	// private List<T> data;
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터

	// --- 생성자(constructor) ---//
	public Stack4(int capacity) {
		this.capacity = capacity;
		top = 0;
		data = new ArrayList<Point>();
	}

	// --- 스택에 x를 푸시 ---//
	public Point push(Point x) throws OverflowGenericStackException {
		if (isFull())
			throw new OverflowGenericStackException("스택참");
		data.add(x);
		top++;
		return x;

	}

	// --- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public Point pop() throws EmptyGenericStackException {
		if (isEmpty())
			throw new EmptyGenericStackException("스택빔");
		Point x = data.remove(top - 1);
		top--;
		return x;
	}

	// --- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public Point peek() throws EmptyGenericStackException {
		if (isEmpty())
			throw new EmptyGenericStackException("스택빔");
		Point x = data.get(top - 1);
		return x;
	}

	// --- 스택을 비움 ---//
	public void clear() {
		top = 0;
	}

	// --- 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 ---//
	public int indexOf(Point x) {
		for (int i = top - 1; i >= 0; i--) // 꼭대기 쪽부터 선형 검색
			if (data.get(i).equals(x))
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// --- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

	// --- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return top;
	}

	// --- 스택이 비어있는가? ---//
	public boolean isEmpty() {
		return top <= 0;
	}

	// --- 스택이 가득 찼는가? ---//
	public boolean isFull() {
		return top >= capacity;
	}

	// --- 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력 ---//
	public void dump() throws EmptyGenericStackException {
		if (top <= 0)
			throw new EmptyGenericStackException("stack:: dump - empty");
		else {
			for (int i = 0; i < top; i++)
				System.out.print(data.get(i) + " ");
			System.out.println();
		}
	}
}

public class Test_QueenEight_구현과제 {
	public static void EightQueen(int[][] d) {

		int count = 0;// 퀸 배치 갯수
		int numberSolutions = 0;
		int ix = 0, iy = 0;// 행 ix, 열 iy
		Stack4 st = new Stack4(100); // 100개를 저장할 수 있는 스택을 만들고
		Point p = new Point(ix, iy);// 현 위치를 객체로 만들고
		d[ix][iy] = 1;// 현 위치에 queen을 넣었다는 표시를 하고
		count++;
		ix++; // 다음행으로 이동
		iy = 0;
		st.push(p);// 스택에 현 위치 객체를 push
		while (true) {
			int newCol = nextMove(d, ix, iy);
//			System.out.println("newCol: " + newCol);
			if (newCol != -1) {
				iy = newCol;
				d[ix][iy] = 1;
				p = new Point(ix, iy);
				st.push(p);
				count++;
				ix++;
				iy = 0;

				if (ix == 8) {
					System.out.println("해결책" + numberSolutions);
					showQueens(d);
					numberSolutions++;
					d[ix - 1][iy] = 0; // 마지막 퀸을 제거하여 다음 경우를 탐색할 수 있도록 함
					ix--; // 마지막 퀸의 위치로 돌아감
					iy = p.iy + 1; // 다음 열부터 퀸을 놓을 수 있도록 함
					if (st.isEmpty()) { // 스택이 비어있다면 모든 해결책을 찾은 것이므로 종료
						break;
					}
//					p = st.pop(); // 스택에서 이전에 놓았던 퀸의 위치를 가져옴
					d[p.ix][p.iy] = 0; // 이전에 놓았던 퀸의 위치를 제거
					count--; // 퀸의 개수를 하나 줄임
					ix = p.ix; // 이전에 놓았던 퀸의 행으로 돌아감
					iy = p.iy + 1; // 다음 열부터 퀸을 놓을 수 있도록 함
					continue;
				}
				continue;
				// 이 부분은 else if(newCol == -1) 부분을 없애고 else로 수정했습니다.
				// 그 이유는 위의 조건문에서 newCol이 -1일 때 처리되기 때문에 이 부분은 실행될 일이 없기 때문입니다.
				// 따라서 불필요한 중복 코드를 제거했습니다.
			} else {
				try {
					p = st.pop();
				} catch (Chap5_Recursive.Stack4.EmptyGenericStackException e) {
//					e.printStackTrace();
					System.out.println("모든 해결책을 찾았다!");
					break;
				}
				ix = p.ix;
				iy = p.iy;
				d[ix][iy] = 0;
				count--;
				iy++;
				continue;
			}
		}
	}

	public static boolean checkRow(int[][] d, int r) {// (x,y)로 이동 가능한지를 check
		for (int i = 0; i < d.length; i++)
			if (d[r][i] == 1) {
				return false;
			}
		return true;
	}

	public static boolean checkCol(int[][] d, int c) {// (x,y)로 이동 가능한지를 check
		for (int i = 0; i < d.length; i++)
			if (d[i][c] == 1) {
				return false;
			}
		return true;
	}

	// 배열 d에서 행 cx, 열 cy에 퀸을 남동, 북서 대각선으로 배치할 수 있는지 조사
	public static boolean checkDiagSE(int[][] d, int cx, int cy) { // x++, y++ or x--, y--
		int x = cx, y = cy;
		while (x >= 0 && y >= 0) {
			if (d[x][y] == 1)
				return false;
			x--;
			y--;
		}
		x = cx;
		y = cy;
		while (x < d.length && y < d[0].length) {
			if (d[x][y] == 1)
				return false;
			x++;
			y++;
		}
		return true;
	}
//		for (int i = cx; i < d.length; i++)
//			for (int j = cy; j >= 0; j--)
//				if (d[i][j] == 1) {
//					return false;
//				}
//		for (int i = cx; i >= 0; i--)
//			for (int j = cy; j < d.length; j++)
//				if (d[i][j] == 1) {
//					return false;
//				}
//		return true;
//	}

	// 배열 d에서 행 cx, 열 cy에 퀸을 남서, 북동 대각선으로 배치할 수 있는지 조사
	public static boolean checkDiagSW(int[][] d, int cx, int cy) {// x++, y-- or x--, y++ where 0<= x,y <= 7
		int x = cx, y = cy;
		while (x >= 0 && y < d[0].length) {
			if (d[x][y] == 1)
				return false;
			x--;
			y++;
		}
		x = cx;
		y = cy;
		while (x < d.length && y >= 0) {
			if (d[x][y] == 1)
				return false;
			x++;
			y--;
		}

		return true;
	}
//		for (int i = cx; i < d.length; i++)
//			for (int j = cy; j < d[0].length; j++)
//				if (d[i][j] == 1) {
//					return false;
//				}
//		for (int i = cx; i >= 0; i--)
//			for (int j = cy; j >= 0; j--)
//				if (d[i][j] == 1) {
//					return false;
//				}
//		return true;
//	}

	// 배열 d에서 (x,y)에 퀸을 배치할 수 있는지 조사
	public static boolean checkMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		return checkRow(d, x) & checkCol(d, y) & checkDiagSW(d, x, y) & checkDiagSE(d, x, y);
	}

	// 배열 d에서 현재 위치(row,col)에 대하여 다음에 이동할 위치 nextCol을 반환, 이동이 가능하지 않으면 -1를 리턴
	public static int nextMove(int[][] d, int row, int col) {// 현재 row, col에 대하여 이동할 col을 return
		// checkMove를 불러서 if(chexkMove)가 true면 return col.
		for (int nextCol = col; nextCol < d[0].length; nextCol++) {
			if (checkMove(d, row, nextCol))
				return nextCol;
		}
		return -1;
	}

	static void showQueens(int[][] data) {// 배열 출력
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				if (data[i][j] == 1)
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int row = 8, col = 8;
		int[][] data = new int[8][8];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		EightQueen(data);
	}
}
