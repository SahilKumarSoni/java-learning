package io.sahil;

import java.io.*;
import java.util.*;

public class CompressedString {

	// ---------Using Iterative Approach---------------
	public static String compressedString(String str) {
		StringBuilder result = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				result.append(str.charAt(i)).append(count);
				count = 0;
			}
		}
		return result.length() < str.length() ? result.toString() : str;
	}

	// ----------Using Two Pointer Approach-------------
	public static String task(String str) {
		StringBuilder result = new StringBuilder();
		int start = 0;
		for (int end = 0; end < str.length(); end++) {
			if (str.charAt(end) != str.charAt(start)) {
				result.append(str.charAt(start)).append(end - start);
				start = end;
			}
		}
		result.append(str.charAt(start)).append(str.length() - start);
		return result.length() < str.length() ? result.toString() : str;
	}

	// ------------Using Stack Approach-----------------
	public static String method3(String str) {
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (!stack.isEmpty() && ch == stack.peek()) {
				stack.push(ch);
			} else {
				if (!stack.isEmpty()) {
					result.append(stack.peek()).append(stack.size());
				}
				stack.clear();
				stack.push(ch);
			}
		}
		if (!stack.isEmpty()) {
			result.append(stack.peek()).append(stack.size());
		}
		return result.length() < str.length() ? result.toString() : str;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		String output = method3(str);
		System.out.print(output);
	}
}
