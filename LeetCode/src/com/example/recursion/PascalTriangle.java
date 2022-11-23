package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ans = getRow(3);
		for (Integer s : ans) {
			System.out.println(s);
		}

	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i <= rowIndex; i++) {
			ans.add(getNum(rowIndex, i));
		}
		return ans;
	}

	public static int getNum(int row, int col) {
		if (row == 0 || col == 0 || row == col) {
			return 1;
		}
		return getNum(row - 1, col - 1) + getNum(row - 1, col);
	}

}
