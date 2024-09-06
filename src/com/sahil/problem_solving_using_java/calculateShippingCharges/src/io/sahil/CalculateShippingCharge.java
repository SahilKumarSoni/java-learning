package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateShippingCharge {

	public static float calculate(int w, int d) {
		float result = (float) (5 + 2*w + 0.5*(d/10));
		return result;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(reader.readLine());
		int d = Integer.parseInt(reader.readLine());
		float output = calculate(w,d);
		String temp = String.format("Total Shipping Cost: $%.2f", output);
		System.out.printf(temp);
	}
}
