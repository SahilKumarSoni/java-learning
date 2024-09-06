package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComplementOfBinary {

	//----------Manual bit flipped---------------
	public static int binaryComplement(int n) {
		String result = "";
		String binary = Integer.toString(n,2);
		System.out.println(binary);
		for(char ch:binary.toCharArray()) {
			if(ch == '0') result+="1";
			else result+="0";
		}
		return Integer.parseInt(result,2);
	}
	
	//-------BIT FLIPPING WITH MASKING----------
	public static int method2(int n) {
		String binary = Integer.toString(n,2);
		int numBits = binary.length();
		int mask = (1<<numBits)-1;
		int result = n^mask;
		return result;
	}
	
	public static int method3(int n) {
		String binary = Integer.toString(n,2);
		int numBits = binary.length();
		int mask = (1<<numBits)-1;
		int result = (~n)&mask;
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int output = method3(n);
		System.out.print(output);
	}
}
