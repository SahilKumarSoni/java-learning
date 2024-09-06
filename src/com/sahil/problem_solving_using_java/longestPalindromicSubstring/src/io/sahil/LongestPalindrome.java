package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPalindrome {

	public static String findSubstring(String str) {
		int start = 0,end = 0;
		for(int i = 0;i<str.length();i++) {
			int temp1 = task(str, i, i);
			int temp2 = task(str, i, i+1);
			int temp = Math.max(temp1, temp2);
			if(temp>end-start) {
				start = i-(temp-1)/2;
				end = i+temp/2;
			}
		}
		return str.substring(start,end+1);
	}
	
	public static int task(String str,int left,int right) {
		while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)) {
			right++;
			left--;
		}
		return right-left-1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		String output = findSubstring(s);
		System.out.println(output);
	}
}
