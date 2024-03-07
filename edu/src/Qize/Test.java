package Qize;

public class Test {

	int[][] mA = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
	};
	
	int[][] mB = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
			{10, 11, 12}
	};
	
		int [][] mR = new int[3][3];
		int l = mA.length;
		int m = mA[0].length;
		int n = mB[0].length;
	public void multiple() {
		for(int i = 0; i<l; i++) {
			for(int j = 0; j<n; j++) {
				mR[i][j] = 0;
				for(int k = 0; k<m; k++) {
					mR[i][j] += mA[i][k] * mB[k][j];
				}
			}
		}
	}
	public void print() {
				System.out.println("mR " + "\n");
				for(int i = 0; i < mR.length; i++) {
					for(int j = 0; j<mR[0].length; j++) {
						System.out.print(mR[i][j] + "\t");
					}
					System.out.println("\n");
				}		
		}

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.multiple();
		t1.print();
	}
}
