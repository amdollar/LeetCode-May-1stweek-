package io.test.Problems;

/**
 * Given two strings s1 and s2, write a function to return true if s2 contains
 * the permutation of s1. In other words, one of the first string's permutations
 * is the substring of the second string.
 * 
 */
public class PermutationsInString {

	public static void main(String[] args) {
		String s1 = new String("ab");
		String s2 = new String("eidbaooo");
		System.out.println(checkInclusion(s1, s2));
	}

	public static boolean checkInclusion(String p, String s) {
		int[] cnt = new int[128];
		for (char c : p.toCharArray())
			cnt[c]--;
		for (int r = 0, l = 0; r < s.length(); r++) {
			if (++cnt[s.charAt(r)] > 0) { // If number of characters `s[r]` is more than our expectation
				while (s.charAt(l) != s.charAt(r)) // Remove until we found char `s[r]`
					cnt[s.charAt(l++)]--;
				cnt[s.charAt(l++)]--; // Remove char `s[r]` so cnt[s[r]] can be 0
			} else if (r - l + 1 == p.length()) { // If the size of our range == p.length
													// and there are no characters have greater numbers than we expect
				return true; // Found the result
			}
		}
		return false;
	}

}
