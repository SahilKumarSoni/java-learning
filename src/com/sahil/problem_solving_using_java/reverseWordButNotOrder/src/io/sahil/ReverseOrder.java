package io.sahil;

import java.util.*;
import java.io.*;

public class ReverseOrder {
	//---------Using StringBuilder------------------
	private static String reverseOrder(String str) {
		StringBuilder result = new StringBuilder();
		String[] words = str.split(" ");
		for(String ele:words) {
			//StringBuilder tmp = new StringBuilder(ele);
			//tmp.reverse();
			//String temp = tmp.toString();
			String temp = new StringBuilder(ele).reverse().toString();
			result.append(temp).append(" ");
		}
		return result.toString();
	}
	//---------Using Two Pointers Approach------------
	public static String method2(String str) {
		char[] arr = str.toCharArray();
		int start = 0;
		for(int end = 0;end<arr.length;end++) {
			if(arr[end] == ' ' || end == arr.length-1) {
				int left = start;
				int right = arr[end] == ' ' ? end-1 : end;
				while(left < right) {
					char temp = arr[left];
					arr[left++] = arr[right];
					arr[right--] = temp;
				}
				start = end+1;
			}
		}
		return new String(arr);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		String output = method2(str);
		System.out.print(output);
	}
}
