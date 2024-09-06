package io.sahil;

import java.io.*;
import java.util.*;

public class FirstNegativeInWindow {
	
	public static List<Integer> method1(int[] arr, int n, int k) {
		List<Integer> result = new ArrayList<>();
		Deque<Integer> dq = new LinkedList<>();
		for(int i =0;i<n;i++) {
			if(!dq.isEmpty() && dq.peekFirst()==i-k) {
				dq.pollFirst();
			}
			while(!dq.isEmpty() && arr[dq.peekLast()]>arr[i]) {
				dq.pollLast();
			}
			dq.offerLast(i);
			if(i>=k-1) {
				result.add(arr[dq.peekFirst()]);
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = reader.readLine().split(" ");
		int n = Integer.parseInt(line1[0]);
		int k = Integer.parseInt(line1[1]);
		int[] arr = new int[n];
		String[] line2 = reader.readLine().split(" ");
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(line2[i]);
		}
		List<Integer> result = method1(arr,n,k);
		for(int ele:result) {
			System.out.print(ele+" ");
		}
	}
}
