package io.sahil;

import java.util.Scanner;

public class ConvertBase {
	
	public static String convertBase(String num,int n,int m) {
		int original = Integer.parseInt(num,n);
		String output = Integer.toString(original,m).toUpperCase();
		return output;
	}

	public static void main(String[] args) {
		String num;
		int n, m;
		Scanner sc = new Scanner(System.in);
		num = sc.nextLine();
		n = sc.nextInt();
		m = sc.nextInt();
		String output = convertBase(num,n,m);
		System.out.println(output);
	}

}
