package com.hackerrank.java.introduction;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class endOfFile {
	public static void main(String[] args){
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		int count = 1;
		while (stdin.hasNext()) {
			System.out.println(count + " " + stdin.nextLine());
			count = count + 1;
		}
		
	}

}
