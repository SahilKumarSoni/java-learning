package io.sahil;

import java.io.*;
import java.util.*;


public class SumOfUniqueElements {

	public static int uniqueSum(int[] nums) {
//		int result = 0;
		
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int ele:nums) {
//			map.put(ele, map.getOrDefault(ele,0)+1);
//		}
		
//		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
//			Integer key = entry.getKey();
//			Integer value = entry.getValue();
//			if(value == 1) {
//				result += key;
//			}
//		}
		
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int ele:nums) {
			if(map.containsKey(ele)) {
				if(map.get(ele) == 1) {
					sum -= ele;
				}
				map.put(ele, map.get(ele)+1);
			} else {
				map.put(ele, 1);
				sum += ele;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int[] nums = new int[input.length];
		int idx = 0;
		for(String ele:input) {
			nums[idx] = Integer.parseInt(ele);
			idx++;
		}
		int output = uniqueSum(nums);
		System.out.println(output);
	}
}
