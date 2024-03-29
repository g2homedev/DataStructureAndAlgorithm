package com.example.recursion;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int climbStairs(int n) {
		int[] memo = new int[n + 1];
		int ans = climbStairs(0, n, memo);
		return ans;
	}

	public int climbStairs(int i, int n, int[] memo) {
		if (i > n)
			return 0;
		if (i == n)
			return 1;
		if (memo[i] > 0)
			return memo[i];
		memo[i] = climbStairs(i + 1, n, memo) + climbStairs(i + 2, n, memo);
		return memo[i];
	}

}
