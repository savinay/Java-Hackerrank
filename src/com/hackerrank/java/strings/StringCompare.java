package com.hackerrank.java.strings;

import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count = scanner.nextInt();
        String maxLexicographically = str.substring(0,count);
        String minLexicographically = str.substring(0,count);
        int maxCount = 0;
        int minCount = 0;
        for (int i = 1 ; i <= str.length() - count; i++) {
        	String sub = str.substring(i, i+count);
//        	System.out.println(sub);
        	if (maxLexicographically.compareTo(sub) > 0) {
        		maxLexicographically = sub;
        	}
        	if (minLexicographically.compareTo(sub) < 0) {
        		minLexicographically = sub;
        	}
        }
        System.out.println(maxLexicographically);
        System.out.println(minLexicographically);
    }

}
