package io.sahil;

import java.io.*;
import java.util.*;

public class ValidParentheses {

	public static boolean method1(String str) {
		Deque<Character> dq = new LinkedList<>();
		Map<Character, Character> map = new HashMap<>();
		map.put(')','(');
		map.put(']','[');
		map.put('}','{');
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				char temp = dq.isEmpty() ? '*' : dq.pollLast();
				if (temp != map.get(ch)) {
					return false;
				}
			} else {
				dq.offerLast(ch);
			}
		}
		return dq.isEmpty();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		System.out.print(method1(str));
	}
}
