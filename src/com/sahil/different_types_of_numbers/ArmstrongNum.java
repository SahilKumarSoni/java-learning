package io.easy;

import java.io.*;
import java.util.*;

public class ArmstrongNum {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int pow = Integer.toString(n).length();
		int n1=n,temp = 0,arm = 0;
		while(n1!=0) {
			temp = n1%10;
			arm += (int) Math.pow(temp, pow);
			n1=n1/10;
		}
		if(n == arm) System.out.print(true);
		else System.out.print(false);
	}

}
