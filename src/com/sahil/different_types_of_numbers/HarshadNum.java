package io.easy;

import java.io.*;

public class HarshadNum {

	public static boolean findHarshadNum(int n) {
		int c = Integer.toString(n).length();
		int temp = 0, sum = 0, n1 = n;
		for (int i = 1; i <= c; i++) {
			temp = n1 % 10;
			sum += temp;
			n1 /= 10;
		}
		if (n % sum == 0) return true;
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		boolean output = findHarshadNum(n);
		System.out.print(output);
	}
}
