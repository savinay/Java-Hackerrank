package com.hackerrank.java.introduction;

import java.util.Scanner;

public class StaticInitializer {
	public static int B;
	public static int H;
	public static boolean flag;
	static {
	    
	    Scanner scanner = new Scanner(System.in);
	    B = scanner.nextInt();
	    H = scanner.nextInt();
	    flag = true;
	    try {
	        if (B<=0 || H<=0) {
	            throw new Exception("Breadth and height must be positive");
	        }
	    }catch(Exception e) {
	        System.out.println(e);
	        System.exit(0);
	    }
	    
	    
	}
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


