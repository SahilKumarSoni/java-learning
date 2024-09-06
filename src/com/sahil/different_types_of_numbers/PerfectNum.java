package io.easy;

import java.io.*;

public class PerfectNum {

	public static boolean findPerfectNum(int n) {
		int sum = 0;
		for (int i = 1; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == 1) sum += i;
				else if (i == n / i) sum += i;
				else sum += (i + n / i);
			}
		}
		if (sum == n) return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		boolean output = findPerfectNum(n);
		System.out.print(output);
	}
}
