package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSequence {

	public static int[] findSequence(int[] arr,int n) {
		int result[] = new int[n];
		for(int i = 0;i<n;i++) {
			int count = 0;
			for(int j = i;j>=0;j--) {
				if (arr[j] > arr[i]) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] line1 = reader.readLine().split(" ");
		int[] arr = new int[line1.length];
		int idx = 0;
	    for(String ele:line1 ) {
	    	arr[idx] = Integer.parseInt(ele);
	    	idx++;
	    }
		int[] output = findSequence(arr,n);
		for(int i:output) {
			System.out.print(i+" ");
		}
	}
}
