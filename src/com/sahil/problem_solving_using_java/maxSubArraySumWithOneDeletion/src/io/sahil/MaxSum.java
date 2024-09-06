package io.sahil;

import java.io.*;

public class MaxSum {

	public static int maxSum(int[] nums) {
		int n = nums.length;
		int result = 0;
		int[] forward = new int [n];
		int[] backward = new int[n];
		forward[0] = nums[0];
		result = nums[0];
	    for (int i = 1; i < n; i++) {
	    	forward[i] = Math.max(nums[i],forward[i-1]+nums[i]);
	    	result = Math.max(result, forward[i]);
	    }
		backward[n-1] = nums[n-1];
		for (int i = n-2; i > 0; i--) {
	    	backward[i] = Math.max(nums[i],backward[i+1]+nums[i]);
	    }
		for (int i = 1; i < n-1; i++) {
	    	result = Math.max(result, backward[i-1]+forward[i+1]);
	    }
		return result;
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
		int output = maxSum(nums);
		System.out.println(output);
	}
}
