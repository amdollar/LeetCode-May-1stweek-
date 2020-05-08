package io.test.TreeDS;

public class CheckStraightLine {

	public static void main(String[] args) {
		int[][] coordinates = new int[][] { { -4, -3 }, { 1, 0 }, { 3, -1 }, { 0, -1 }, { -5, 2 } };
		System.out.println(checkStraightLine(coordinates));
	}

	private static boolean checkStraightLine(int[][] a) {
		boolean flag = false;
		float slope = 0;
		int[] finala = a[0];
		int[] finalb = a[1];
		float preSlope = slope(finalb, finala);
		for (int i = 0; i < a.length - 1; i++) {
			int[] a1 = a[i];
			int[] b1 = a[i + 1];
			slope = slope(b1, a1);
			if (preSlope != slope) {
				return false;
			} else {
				flag = true;
			}
		}
		return flag;
	}

	private static float slope(int[] a, int[] b) {
		float slope = (float) (b[1] - a[1]) / (b[0] - a[0]);
		return slope;
	}

}
