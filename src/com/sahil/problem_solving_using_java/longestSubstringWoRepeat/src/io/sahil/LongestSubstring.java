package io.sahil;

import java.io.*;
import java.util.*;

public class LongestSubstring {

	public static int longestSubstring(String str) {
		int result = 0, count = 0;
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (!stack.isEmpty() && stack.search(ch) == -1) {
				stack.push(ch);
				count++;
			} else {
				result = Math.max(result, count);
				stack.clear();
				stack.push(ch);
				count = 1;
			}
		}
		return result;
//		int result = 0, count = 0;
//		Stack<Character> stack = new Stack<>();
//        if(str.length() == 1) return 1;
//		for (int i=0;i<str.length();i++) {
//			if (!stack.isEmpty() && stack.search(str.charAt(i)) == -1) {
//				stack.push(str.charAt(i));
//				count++;
//			} else {
//				result = Math.max(result, count);
//				stack.clear();
//				stack.push(str.charAt(i));
//				count = 1;
//			}
//		}
//		return result;
	}
	
	public static int longestSubstring2(String str) {
		int result = 0;
        int left = 0;
        Map<Character,Integer> charIndex = new HashMap<>();
        for(int right=0;right<str.length();right++){
            char currentChar = str.charAt(right);
            if(charIndex.containsKey(currentChar)){
                left=Math.max(charIndex.get(currentChar)+1, left);
            }
            charIndex.put(currentChar,right);
            result=Math.max(result,right-left+1);
        }
        return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int output = longestSubstring2(str);
		System.out.print(output);
	}

}
