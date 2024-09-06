package io.sahil;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MinDeletion {
	
	public static int minDeletionRequired(String str1,String str2) {
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		for(char ch:str1.toCharArray()) {
			arr1[ch-'a']+=1;
		}
		for(char ch:str2.toCharArray()) {
			arr2[ch-'a']+=1;
		}
		int result = 0;
		for(int i=0;i<26;i++) {
			result += Math.abs(arr1[i]-arr2[i]);
		}
		return result;
	}
	
	public static int minDeletionRequired2(String str1,String str2) {
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		for(char ch:str1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}
		for(char ch:str2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0)+1);
		}
		int result = 0;
//		for(char ch:map1.keySet()) {
//			int cnt1 = map1.get(ch);
//			int cnt2 = map2.getOrDefault(ch, 0);
//			result += Math.abs(cnt1-cnt2);
//		}
		for(char ch:map2.keySet()) {
			if(!map1.containsKey(ch)) {
				result+=map2.get(ch);
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		int output = minDeletionRequired(str1,str2);
		System.out.print(output);
	}
}
