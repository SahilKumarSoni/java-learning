package io.easy;

import java.io.*;
import java.util.*;

public class StrongNumber {
	
	public static boolean checkStrongNum(int n) {
		int n1 = n,temp=0,fact = 0;
		while(n1!=0) {
			temp = n1%10;
			fact += calculateFactorial(temp);
			n1/=10;
		}
		if(fact==n) return true;
		return false;
	}
	
	public static int calculateFactorial(int n) {
		int result = 1;
		if(n==0 || n==1) return result;
		for(int i = 2;i<=n;i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		boolean output = checkStrongNum(n);
		System.out.print(output);
	}
}
