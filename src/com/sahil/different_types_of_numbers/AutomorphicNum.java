package io.easy;

import java.io.*;

public class AutomorphicNum {
	
	public static boolean findAutomorphicNum(int n) {
		int count = Integer.toString(n).length();
		long pow = (long) Math.pow(n,2);
		int n1 = n;
		for(int i=1;i<=count;i++) {
			if(pow%10 != n1%10) return false;
			pow/=10;
			n1/=10;
		}
		return true;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		boolean output = findAutomorphicNum(n);
		System.out.print(output);
	}
}
