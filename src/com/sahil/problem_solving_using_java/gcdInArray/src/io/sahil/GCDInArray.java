package io.sahil;

import java.util.Scanner;

public class GCDInArray {
	public static int gcd(int a,int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b,a%b);
	}
	public static int findGCD(int[] input ,int n) {
		int result = input[0];
		for(int i = 1;i<n;i++) {
			result = gcd(result,input[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] input = new int[n];
		for(int i = 0;i<n;i++) {
			input[i] = sc.nextInt();
		}
		int result = findGCD(input,n);
		System.out.println(result);
		sc.close();
	}
}
