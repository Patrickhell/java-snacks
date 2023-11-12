package org.java.snack;

import java.util.Scanner;

public class PalindromeWord {
	
	public static void main(String[] args) {
		
		//Data in input una stringa verificare se è palindroma.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please!Insert a Word: ");
		String word = sc.nextLine().toLowerCase();
		
		String reversedWord = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			
			reversedWord += word.charAt(i);
		}
			
			System.out.println(reversedWord);
			
			if(reversedWord.equals(word)) {
				
				System.out.println("The word inserted is palindrome.");
				
			}else {
				
				System.out.println("The word inserted is not palindrome.");
			}
		sc.close();
		}
	}

