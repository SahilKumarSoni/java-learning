package io.sahil;

import java.util.Scanner;

public class FindDivisor {
	public static int findDivisor(int n) {
		int result = 0;
//		for(int i=1;i<=n;i++) {
//			if(n%i == 0) {
//				result++;
//			}
//		}
		for(int i = 1;i<Math.sqrt(n);i++) {
			if(n%i == 0) {
				result++;
				if(i != n/i) {
					result++;
				}
		}
		}
		return result;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int result = findDivisor(n);
		System.out.println(result);
	}
}
