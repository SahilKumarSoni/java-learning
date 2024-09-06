package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EvenFloorOccurence {

	public static int find(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			} else {
				map.put(arr[i],1);
			}
		}
		for(int i:map.keySet()) {
			if(map.get(i)%2 == 0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] arr = new int[n];
		String[] line = reader.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(line[i]);
		}
		int output = find(arr, n);
		System.out.println(output);
	}
}
