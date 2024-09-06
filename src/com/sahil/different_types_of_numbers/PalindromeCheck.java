package io.easy;

import java.io.*;

public class PalindromeCheck {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int rem = 0,temp = 0,n1 = n;
		while(n1!=0) {
			rem = n1%10;
			temp = temp*10+rem;
			n1=n1/10;
		}
		if(n==temp) System.out.print(true);
		else System.out.print(false);
	}
}
