package io.sahil;

import java.io.*;
import java.util.stream.*;

public class FindOddEvenPosInStr {

//	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String str = reader.readLine();
//		String strO = "";
//		String strE = "";
//		if (str.length() > 2) {
//			for (int i = 0; i < str.length(); i++) {
//				if (i % 2 == 0) {
//					strO += str.charAt(i);
//				} else {
//					strE += str.charAt(i);
//				}
//			}
//			System.out.println(strO);
//			System.out.print(strE);
//		}
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		String oddPos = IntStream.range(0, str.length()).
						filter(i -> i % 2 != 0).
						mapToObj(str::charAt).
						map(String::valueOf).
						collect(Collectors.joining());
		String evenPos = IntStream.range(0, str.length()).
						filter(i -> i % 2 == 0).
						mapToObj(str::charAt).
						map(String::valueOf).
						collect(Collectors.joining());
		System.out.println(evenPos);
		System.out.println(oddPos);
	}

}