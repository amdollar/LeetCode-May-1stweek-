package io.test.Problems;

public class FloodFill {

	public static void main(String[] args) {
		int[][] img = new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		int sr = 1;
		int sc = 1;
		int newColor = 2;
		int[][] newImage = floodFill(img, sr, sc, newColor);

	}

	private static int[][] floodFill(int[][] img, int x, int y, int newC) {
		if (img[x][y] == newC) {
			return img;
		}
		fill(img, x, y, img[x][y], newC);
		return img;
	}

	private static void fill(int[][] img, int x, int y, int preC, int newC) {
		if (x < 0 || x >= img.length || y < 0 || y >= img[0].length || img[x][y] != preC) {
			return;
		}
		img[x][y] = newC;
		fill(img, x + 1, y, preC, newC);
		fill(img, x - 1, y, preC, newC);
		fill(img, x, y + 1, preC, newC);
		fill(img, x, y - 1, preC, newC);
	}

}
