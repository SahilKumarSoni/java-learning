package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BrokenTelephone {

//	public static int find(long[] arr,int n) {
//		int result = 0;
//		long temp = arr[0];
//		int i = 0;
//		for(i=1;i<n;i++) {
//			if(arr[i]==temp) continue;
//			else break;
//		}
//		for(int j=i;j<n;j++) {
//			result++;
//		}
//		return result;
//	}

	public static int find(String[] arr, int n) {
		Set<String> set = new HashSet<>();
		for (int i = 1; i < n; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				set.add(Integer.toString(i));
				set.add(Integer.toString(i - 1));
			}
		}
		return set.size();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		while (t != 0) {
			int n = Integer.parseInt(reader.readLine());
			String[] arr = reader.readLine().split(" ");
			int output = find(arr, n);
			System.out.println(output);
			t--;
		}
	}
}
