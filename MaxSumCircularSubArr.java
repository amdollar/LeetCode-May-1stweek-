package io.test.Problems;

/**
 * Given a circular array C of integers represented by A, find the maximum
 * possible sum of a non-empty subarray of C.
 * 
 * Here, a circular array means the end of the array connects to the beginning
 * of the array. (Formally, C[i] = A[i] when 0 <= i < A.length, and
 * C[i+A.length] = C[i] when i >= 0.)
 * 
 * Also, a subarray may only include each element of the fixed buffer A at most
 * once. (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist
 * i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)
 * 
 *
 */
public class MaxSumCircularSubArr {
	public static void main(String[] args) {
		int arr[] = new int[10];
		System.out.println(maxSubarraySumCircular(arr));
	}

	public static int maxSubarraySumCircular(int[] A) {
		if (A.length == 0)
			return 0;
		int sum = A[0];
		int maxSoFar = A[0];
		int maxTotal = A[0];
		int minTotal = A[0];
		int minSoFar = A[0];
		for (int i = 1; i < A.length; i++) {
			int num = A[i];
			maxSoFar = Math.max(num, maxSoFar + num);
			maxTotal = Math.max(maxSoFar, maxTotal);

			minSoFar = Math.min(num, minSoFar + num);
			minTotal = Math.min(minTotal, minSoFar);

			sum += num;
		}
		if (sum == minTotal)
			return maxTotal;
		return Math.max(sum - minTotal, maxTotal);
	}
}
