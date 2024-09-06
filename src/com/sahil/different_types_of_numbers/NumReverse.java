package io.easy;

import java.util.*;
import java.io.*;

public class NumReverse {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int rem = 0,temp=0;
		while(n!=0) {
			rem = n%10;
			temp = temp*10+rem; 
			n = n/10;
		}
		System.out.print(temp);
	}
}
