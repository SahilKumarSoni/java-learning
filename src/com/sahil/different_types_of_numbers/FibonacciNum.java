package io.easy;

import java.io.*;
import java.util.*;

public class FibonacciNum {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int range = Integer.parseInt(reader.readLine());
		int prev=0,next=1,sum=0;
		if(range>2) {
			System.out.print(prev+" "+next+" ");
			for(int i = 2;i<range;i++) {
				sum = prev+next;
				prev=next;
				next=sum;
				System.out.print(sum+" ");
			}
		} else if(range==2) System.out.print(prev+" "+next);
		else if(range==1) System.out.print(prev);
		else System.out.print("Enter valid Number!!");
	}
}
