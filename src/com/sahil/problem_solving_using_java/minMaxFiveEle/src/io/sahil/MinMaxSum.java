package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinMaxSum {

	public static long[] findNewArr(long[] arr) {
		long[] result = new long[2];
		
//		long maxVal = Long.MIN_VALUE;
//		long minVal = Long.MAX_VALUE;
//		long sum = 0;
//		
//		for(int i = 0;i<5;i++) {
//			sum += arr[i];
//			maxVal = Math.max(maxVal,arr[i]);
//			minVal = Math.min(minVal,arr[i]);
//		}
//--------------------------------------------		
		
//		long maxVal = arr[0];
//		long minVal = arr[0];
//		long sum = arr[0];
		
		//------------------------------------
//		for(int i = 1;i<5;i++) {
//			sum += arr[i];
//			maxVal = Math.max(maxVal,arr[i]);
//			minVal = Math.min(minVal,arr[i]);
//		}
		//------------------------------------
		
		long maxVal = Arrays.stream(arr).max().orElseThrow();
		long minVal = Arrays.stream(arr).min().orElseThrow();
		long sum = Arrays.stream(arr).sum();
		
		result[0] = sum - maxVal;
		result[1] = sum - minVal;
		
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = reader.readLine().split(" ");
		long[] arr = new long[5];
		for (int i=0;i<5;i++) {
			arr[i] = Long.parseLong(line[i]);
		}
		long[] output = findNewArr(arr);
		for (long i : output) {
			System.out.print(i + " ");
		}
	}

}
