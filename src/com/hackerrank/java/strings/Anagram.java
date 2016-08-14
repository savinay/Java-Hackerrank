package com.hackerrank.java.strings;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		HashMap<Character,Integer> firstMap = new HashMap<Character, Integer>();
		HashMap<Character,Integer> secondMap = new HashMap<Character, Integer>();
		for(char c: a.toCharArray()){
			int count = 1;
			if (firstMap.containsKey(c)){
				count = firstMap.get(c)+1;
			} 
			firstMap.put(c, count);
			
		}
		for (char d: b.toCharArray()){
			int count=-1;
			if(firstMap.containsKey(d)){
				count = firstMap.get(d)-1;
			}
			firstMap.put(d, count);
		}
		
		for (char c: firstMap.keySet()){
			if(firstMap.get(c)!=0){
				System.out.println("Not an anagram");
				System.exit(0);
			}
			
		}
		
		System.out.println("Anagram");
		
	}
	

}
