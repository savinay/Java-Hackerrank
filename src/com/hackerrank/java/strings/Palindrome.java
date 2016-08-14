package com.hackerrank.java.strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i = 0;
        int j = A.length() - 1;
        boolean isPalindrome =true;
        String[] ary = A.split("");
        while(i<j){
            if (!ary[i].equals(ary[j])) {
                isPalindrome = false;
            } 
            i++;
            j--;
        }
        System.out.println(isPalindrome);
        String R = new StringBuilder(A).reverse().toString();
        
        if(A.equals(R)) System.out.println("Yes");
        else System.out.println("No");
    }

}
