package io.test.Problems;

import java.util.Scanner;
import java.util.Stack;
/** insert all the elements in a stack in such a way that all the 
// smallest elements are there in the stack and the remove the k elements from the stack
// now build the string builder by rereiveing the elements from the stack and reverse the string builder
 case 1   // if leadin 0's are there remove and return.
   case 2  // if all the string are same 1111 pop all the elements of the stack;
    */
public class RemoveKDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(removeKdigits(str, 1));
		s.close();

	}

	private static String removeKdigits(String str, int k) {
		int strLength = str.length();
		Stack<Character> chars = new Stack();
		int popCount = 0;
		if(k == strLength) return "0";
		int counter = 0;
		while (counter < strLength) {
			while (k > 0 && !chars.isEmpty() && chars.peek() > str.charAt(counter)) {
				chars.pop();
				k--;
			}
			chars.push(str.charAt(counter));
			counter++;
		}

		while (k > 0) {
			chars.pop();
			k--;
		}

		StringBuilder sb = new StringBuilder();
		while (!chars.isEmpty()) {
			char currentChar = chars.pop();
			sb.append(currentChar);
		}
		sb.reverse();

		while (sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}

		System.out.println(sb);
		return sb.toString();
	}

}
