package io.sahil;

import java.io.*;
import java.util.*;

public class FindIteration {
	
	public static int reverseNum(int n) {
		StringBuilder temp = new StringBuilder(String.valueOf(n));
		return Integer.parseInt(temp.reverse().toString());
	}
	
	public static boolean checkPalindrome(int n) {
		if(n==reverseNum(n)) return true;
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int temp=0,count=0,sum=n;
		while(!checkPalindrome(sum)) {
			count++;
			temp=sum;
			sum = temp+reverseNum(temp);
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
