package io.sahil;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
	public static int countSubArray(int[] nums, int k) {
		int result = 0;
		
//		int n = nums.length;
//		for(int i=0;i<n;i++) {
//			int temp=0;
//			for(int j=i;j<n;j++) {
//				temp += nums[j];
//				if(temp == k) {
//					result++;
//				}
//			}
//		}
		
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int ele: nums) {
			sum+=ele;
			if(map.containsKey(sum-k)) {
				result += map.get(sum-k);
			}
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException {  
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String[] inputValues = reader.readLine().split(" ");
	    int k = Integer.parseInt(reader.readLine());
	    
	    int[] nums = new int[inputValues.length];
	    int idx = 0;
	    for(String ele:inputValues ) {
	    	nums[idx] = Integer.parseInt(ele);
	    	idx++;
	    }
	    int output = countSubArray(nums,k);
	    System.out.println(output);
	}


}
