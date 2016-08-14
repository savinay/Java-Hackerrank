package com.hackerrank.java.biginteger;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerIntroduction {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        java.math.BigInteger first = scanner.nextBigInteger();
        java.math.BigInteger second = scanner.nextBigInteger();
        scanner.close();
        java.math.BigInteger sum = first.add(second);
        java.math.BigInteger product = java.math.BigInteger.valueOf(1);
        product = first.multiply(second);
        System.out.println(sum);
        System.out.println(product);
    }

}
