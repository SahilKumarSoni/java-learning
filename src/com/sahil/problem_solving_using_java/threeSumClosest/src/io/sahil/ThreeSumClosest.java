package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThreeSumClosest {

	public static int threeSumClosest(int[] arr, int target) {
		Arrays.sort(arr);
		int result = arr[0] + arr[1] + arr[2];
		for (int i = 0; i < arr.length; i++) {
			int left = i + 1, right = arr.length - 1;
			while (left < right) {
				int temp = arr[i] + arr[left] + arr[right];
				if (Math.abs(temp - target) < Math.abs(result - target)) {
					result = temp;
				}
				if (temp < target) left++;
				else right--;
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] arr = new int[n];
		String[] line = reader.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(line[i]);
		}
		int target = Integer.parseInt(reader.readLine());
		int output = threeSumClosest(arr, target);
		System.out.println(output);
	}
}
