package com.hackerrank.java.introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class loop1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <= 10; i++){
            int product = N * i;
            System.out.println(N + " x " + i + " = " + product);
        }
    }
}
