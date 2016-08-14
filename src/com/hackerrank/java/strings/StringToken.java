package com.hackerrank.java.strings;

import java.util.Scanner;

public class StringToken {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            String[] strings = s.split("[^\\p{Alpha}+]+");
            System.out.println(strings.length);
            for(String str : strings){
                System.out.println(str);
            }
        }

        // Write your code here.
    }

}
