package io.test.InterviewPreparation;

import java.util.HashMap;
import java.util.PriorityQueue;
/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 */
public class SortByCharFrequency {

	public static void main(String[] args) {
		String str = new String("tree");
		System.out.println(frequencySort(str));
	}

	private static String frequencySort(String str) {
		HashMap<Character, Integer> datamap = new HashMap();
		for (char ch : str.toCharArray()) {
			datamap.put(ch, (datamap.getOrDefault(ch, 0) + 1));
		}

		PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> datamap.get(b) - datamap.get(a));
		pq.addAll(datamap.keySet());

		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			char ch = pq.remove();
			for (int i = 0; i < datamap.get(ch); i++) {
				sb.append(ch);
			}
		}

		return sb.toString();
	}
}
