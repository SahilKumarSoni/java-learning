package io.sahil;

import java.io.*;

public class AddMiddle {

	public static int[] findNewArr(int[] arr, int n) {
		if (n % 2 != 0) return arr;
		int temp = arr[(n / 2) - 1] + arr[(n / 2)];
		int[] newArr = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			if (i == n / 2 - 1)newArr[i] = temp; 
			else if (i < n / 2 - 1) newArr[i] = arr[i];
			else newArr[i] = arr[i + 1];
		}
		return newArr;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] line1 = reader.readLine().split(" ");
		int[] arr = new int[line1.length];
		int idx = 0;
		for (String ele : line1) {
			arr[idx] = Integer.parseInt(ele);
			idx++;
		}
		int[] output = findNewArr(arr, n);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}
}
