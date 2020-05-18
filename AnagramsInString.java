package io.test.Problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's
 * anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both
 * strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 * s: "cbaebabacd" p: "abc"
 *
 * Approach : first find all possible combinations of non-empty string p. Then
 * for each combination start searching in the given String.
 *
 */
public class AnagramsInString {

	public static void main(String[] args) {

		String str = "cbaebabacd";
		String p = "abc";
		List<Integer> list = findAnagrams(str, p);
		list.forEach(System.out::println);
	}

	private static List<Integer> findAnagrams(String s, String p) {
		int[] letters = new int[26];
		for (int i = 0; i < p.length(); i++) {
			letters[p.charAt(i) - 'a']++;
		}
		int j = 0;
		int rem = p.length();
		List<Integer> result = new ArrayList();
		for (int i = 0; i < s.length(); i++) {
			while (j < s.length() && j - i < p.length()) {
				if (letters[s.charAt(j++) - 'a']-- > 0) {
					rem--;
				}
			}
			if (rem == 0 && j - i == p.length())
				result.add(i);
			if (letters[s.charAt(i) - 'a']++ >= 0)
				rem++;
		}
		return result;
	}

}
