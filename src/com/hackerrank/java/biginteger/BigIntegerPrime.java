package com.hackerrank.java.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrime {
	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      BigInteger n = in.nextBigInteger();
	      in.close();
	      // Write your code here.
	      boolean isPrime = n.isProbablePrime(100);
	      if (isPrime) {
	          System.out.println("prime");
	      } else {
	          System.out.println("not prime");
	      }
	   }
}
