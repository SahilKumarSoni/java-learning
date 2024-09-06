package io.sahil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RectangleArea {
	
//	public static int histogramDefault(int arr[]) {
//		int maxArea = 0;
//		
//		for(int i = 0;i<arr.length;i++) {
//			int height = Integer.MAX_VALUE;
//			for(int j = i;j<arr.length;j++) {
//				height = Math.min(height, arr[j]);
//				int width = j-i+1;
//				maxArea = Math.max(maxArea, height*width);
//			}
//		}
//		return maxArea;
//	}

	public static int task1(int matrix[][]) {
		int maxArea = 0;
		int[] heights = new int[matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				heights[j] = matrix[i][j] == 0 ? 0 : heights[j] + 1;
			}
			maxArea = Math.max(maxArea, task2(heights));
		}
		return maxArea;
	}

	public static int task2(int histo[]) {
		
//		int[] stack = new int[height.length + 1];
//		int top = -1;
//		int maxArea = 0;
//		for (int i = 0; i <= height.length; i++) {
//			int ele = i == height.length ? 0 : height[i];
//			while (top != -1 && ele < height[stack[top]]) {
//				int h = height[stack[top--]];
//				int w = top == -1 ? i : i - stack[top] - 1;
//				maxArea = Math.max(maxArea, h * w);
//			}
//			stack[++top] = i;
//		}
		
		
		Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = histo.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = reader.readLine().split(" ");
		int row = Integer.parseInt(line1[0]);
		int col = Integer.parseInt(line1[1]);

		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			String[] line2 = reader.readLine().split(" ");
			for (int j = 0; j < col; j++) {
				matrix[i][j] = Integer.parseInt(line2[j]);
			}
		}
		int output = task1(matrix);
		
//		int[] arr = new int[line1.length];
//		int idx = 0;
//	    for(String ele:line1 ) {
//	    	arr[idx] = Integer.parseInt(ele);
//	    	idx++;
//	    }
//		int output = histogramDefault(arr);
		
		System.out.println(output);
	}
}