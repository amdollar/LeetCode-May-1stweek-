package io.test.ConsumerInterface;

public class PerfectSqure {

	public static void main(String[] args) {
		int number = 15;

		System.out.println(isPerfectSqure(number));

	}

	private static boolean isPerfectSqure(int number) {
		for (int i = 1, sum = 0; sum < number; i += 2) {
			sum += i;
			if (sum == number) {
				return true;
			}
		}
		return false;
	}
}

/*
 * int mod10 = (int) number % 10; if (mod10 == 0 || mod10 == 1 || mod10 == 4 ||
 * mod10 == 5 || mod10 == 6 || mod10 == 9) { int perfectSum =
 * digitalSum(number);
 * 
 * while (perfectSum > 9) { int temp = digitalSum(perfectSum); perfectSum =
 * temp; }
 * 
 * if (perfectSum == 1 || perfectSum == 4 || perfectSum == 7 || perfectSum == 9)
 * { return true; } else { return false; }
 * 
 * } else { return false; }
 * 
 * }
 * 
 * private static int digitalSum(int number) { int perfectSum = 0; while (number
 * > 0) { perfectSum += (int) number % 10; number = number / 10; } return
 * perfectSum; }
 */
