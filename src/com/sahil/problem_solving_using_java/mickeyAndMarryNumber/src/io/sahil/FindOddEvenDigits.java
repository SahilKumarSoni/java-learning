package io.sahil;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class FindOddEvenDigits {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = reader.readLine().split("");
		List<Integer> numbers = new ArrayList<>();
		for (String ele : line1) {
			numbers.addLast(Integer.parseInt(ele));
		}

		List<Integer> mickeyNum = numbers.stream().
				filter(i -> i % 2 == 0).
				collect(Collectors.toList());
		List<Integer> marryNum = numbers.stream().
				filter(i -> i % 2 != 0).
				collect(Collectors.toList());

		System.out.println(mickeyNum.size());
		System.out.println(marryNum.size());
	}

}
