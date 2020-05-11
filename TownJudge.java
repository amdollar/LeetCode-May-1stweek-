package io.test.Problems;

public class TownJudge {

	public static void main(String[] args) {
		int[][] town = new int[][] { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };
		int status = findJudge(4, town);
		System.out.println(status);
	}

	public static int findJudge(int N, int[][] trust) {
		int[] trustArr = new int[N + 1];
		for (int[] temp : trust) {
			trustArr[temp[0]]--;
			trustArr[temp[1]]++;
		}
		for (int i = 1; i <= N; ++i) {
			if (trustArr[i] == N - 1)
				return i;
		}
		return -1;
	}
}
