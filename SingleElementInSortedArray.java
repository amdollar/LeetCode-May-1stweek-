package io.test.Problems;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		int[] ar = new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		System.out.println(singleNonDuplicate(ar));
	}

	public static int singleNonDuplicate(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ nums[i];
		}
		return xor;

	}

	public static int singleNonDuplicate1(int[] nums) {
		Map<Integer, Integer> dataMap = new HashMap<Integer, Integer>();
		int retVal = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!dataMap.containsKey(nums[i])) {
				dataMap.put(nums[i], new Integer(1));
			} else {
				int fre = dataMap.get(nums[i]);
				dataMap.put(nums[i], ++fre);
			}
		}

		for (Map.Entry<Integer, Integer> currentKey : dataMap.entrySet()) {
			if (currentKey.getValue() == 1) {
				retVal = currentKey.getKey();
			}
		}
		return retVal;
	}
}
