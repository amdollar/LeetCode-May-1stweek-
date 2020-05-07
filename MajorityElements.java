package io.test.ConsumerInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElements {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 2, 1, 1, 1, 2, 2 };
		int majorityElement = majorityElement(arr);
		System.out.println(majorityElement);

	}

	private static int majorityElement(int[] arr) {
		int result = 0;
		List<Integer> data = new ArrayList<Integer>();
		for (int i : arr) {
			data.add(i);
		}
		Collections.sort(data);
		if (data.size() % 2 == 0) {
			result = (data.get(data.size() / 2) - 1);
		} else {
			result = (data.get(data.size() / 2));
		}
		return result;
	}

	/*
	 * public static int majorityElement(int[] nums) { int majorityElement = 0; int
	 * maxFre = 0; Map<Integer, Integer> data = new HashMap<Integer, Integer>(); for
	 * (int i = 0; i < nums.length; i++) { if (!data.containsKey(nums[i])) {
	 * data.put(nums[i], new Integer(1)); } else { int fre = data.get(nums[i]);
	 * data.put(nums[i], ++fre); } } for (Map.Entry<Integer, Integer> val :
	 * data.entrySet()) { int fre = val.getValue(); maxFre = Math.max(fre, maxFre);
	 * } for (Map.Entry<Integer, Integer> ent : data.entrySet()) { if
	 * (ent.getValue() == maxFre) { majorityElement = ent.getKey(); } }
	 * 
	 * return majorityElement; }
	 */
}
