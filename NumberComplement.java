package io.test.ConsumerInterface;

import java.util.Scanner;

public class NumberComplement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer num = s.nextInt();
		int newVal = findComplement(num);
		System.out.println(newVal);
		s.close();
	}

	public static int findComplement(Integer num) {
		int importantBits = 0;
		int temp = num;
		while (temp != 0) {
			temp = temp >> 1;
			importantBits++;
		}
		int mask = (1 << importantBits) - 1;
		int ret = (~num) & mask;

		return ret;
	}

	/*
	 * 
	 * int log = (int) (Math.log(num) / Math.log(2)) + 1; System.out.println(log);
	 * for (int i = 0; i < log; i++) { num = (num ^ (1 << i)); }
	 * System.out.println(num); return 0;
	 */
}
