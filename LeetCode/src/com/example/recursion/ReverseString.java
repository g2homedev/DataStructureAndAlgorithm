package com.example.recursion;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "helloworld";
		printReverse(test.toCharArray());
	}

	private static void printReverse(char[] str) {
		helper(0, str);
	}

	private static void helper(int index, char[] str) {
		if (str == null || index >= str.length) {
			return;
		}
		helper(index + 1, str);
		System.out.print(str[index]);
	}
}
