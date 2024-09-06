package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharlesNecklace {

//------------------------DP Approach-------------------
	public static int find(int input1, int input2, int input3) {
		int range = input3 - input2 + 1;
		int[][] dp = new int[input1 + 1][range + 1];
		dp[0][0] = 1;
		for (int i = 1; i <= input1; i++) {
			for (int j = 0; j < range; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j > 0) {
					dp[i][j] += dp[i][j - 1];
				}
			}
		}
		System.out.println("DP table:");
		for (int i = 1; i <= input1; i++) {
			for (int j = 0; j < range; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		int result = 0;
		for (int i = 1; i <= input1; i++) {
			result += dp[i][range-1];
		}
		return result+input1;
	}
	
//-----------------Backtracking Approach------------------
	public static int backtracking1(int input1, int input2, int input3) {
		int result = 0;
		for (int i = 1; i <= input1; i++) {
			result += backtracking2(input2, input3, i, input2);
		}
		return result;
	}
	public static int backtracking2(int start, int end, int len,int curr) {
		if(len == 0) return 1;
		if(curr > end) return 0;
		int count = 0;
		for (int i = curr; i <= end; i++) {
			count += backtracking2(start, end, len-1, i);
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int input1 = Integer.parseInt(reader.readLine());
		int input2 = Integer.parseInt(reader.readLine());
		int input3 = Integer.parseInt(reader.readLine());
//		int output = find(input1, input2, input3);
		int output = backtracking1(input1, input2, input3);
		System.out.print(output);
	}
}
