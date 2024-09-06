package io.sahil;

import java.io.*;
import java.util.*;

public class GroupAnagram {

	private static List<List<String>> groupAnagram(List<String> list) {
		Map<String, List<String>> map = new HashMap<>();
		for(String ele:list) {
			char[] arr = ele.toCharArray();
			Arrays.sort(arr);
			String temp = new String(arr);
			if(!map.containsKey(temp)) {
				map.put(temp, new ArrayList<>());
			}
			map.get(temp).add(ele);
		}
		return new ArrayList<>(map.values());
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(reader.readLine());
		}
		List<List<String>> result = groupAnagram(list);
		for(List<String> ele:result) {
			System.out.println(String.join(" ", ele));
		}
	}
}
