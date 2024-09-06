package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
//--------------Sliding Window Approach------------------------
//	public static int findLongestSubstring(String str, int k) {
//		int result = 0;
//		int left = 0;
//		Map<Character, Integer> map = new HashMap<>();
//		for(int right = 0;right<str.length();right++) {
//			//character return -> right index
//			char ch = str.charAt(right);
//			map.put(ch, map.getOrDefault(ch, 0)+1);
//			while(map.size()>k) {
//				char leftEle = str.charAt(left);
//				map.put(leftEle, map.get(leftEle)-1);
//				if(map.get(leftEle) == 0) {
//					map.remove(leftEle);
//				}
//				left++;
//			}
//			result = Math.max(result, right-left+1);
//		}
//		return result;
//	}
	
	public static int findLongestSubstring(String str, int k) {
		int result = 0;
		int left = 0;
		int distinct = 0;
		int[] arr = new int[26];
		for(int right = 0;right<str.length();right++) {
			//character return -> right index
			char ch = str.charAt(right);
			
			if(arr[ch-'a'] == 0) {
				distinct++;
			}
			arr[ch-'a']++;
			
			while(distinct>k) {
				char leftEle = str.charAt(left);
				arr[leftEle-'a']--;
				if(arr[leftEle-'a'] == 0) {
					distinct--;
				}
				left++;
			}
			result = Math.max(result, right-left+1);
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int k = Integer.parseInt(reader.readLine());
		int output = findLongestSubstring(str,k);
		System.out.println(output);
	}
}
