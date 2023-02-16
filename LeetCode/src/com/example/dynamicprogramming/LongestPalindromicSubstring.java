package com.example.dynamicprogramming;

public class LongestPalindromicSubstring {
	public String longestPalindromicSubstring(String s) {

		int strLen = s.length();
	    boolean[][] dp = new boolean[strLen+1][strLen+1];
	    int start = 0, len = 1;

	    // base case 1: dp[i][i] = true;
	    for(int i = 0; i<strLen; i++) {
	    	dp[i][i] = true;
	    }

	    // base case 2: if s[i] == s[i+1] => dp[i][i+1] = true;
	    for(int i = 0 ;i < strLen -1; i++) {
	    	if(s.charAt(i) == s.charAt(i+1)) {
	    		dp[i][i+1] = true;
	    		len = 2;
	    		start = i;
	    	}
	    }


	    // other dp[i][j] = dp[i+1][j-1] && s[i] == s[j]
	    for (int l = 3; l < strLen; l++) {
	    	for (int i = 0; i < strLen - l + 1; i++) {
	    		int j = i + l - 1;

	    		if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true) {
	    			dp[i][j] = true;
	    			if(l > len) {
	    				start = i;
		    			len = l;
	    			}

	    		}
	    	}
	    }

		return s.substring(start, start+len-1);
	}

}
