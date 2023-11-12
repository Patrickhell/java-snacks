package org.java.snack;

import java.util.Scanner;

public class ConvertStringToInteger {

public static void main(String[] args) {
		
		//Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.

		//Possibile usare solo :

		//- cicli
		//- chartAt
		//- if / switch

		//Es. “25” come stringa deve essere convertito in intero 25.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("insert a word: ");
		String word = sc.nextLine().toLowerCase();
		
		int insertedWord = 0;
		
		for (int i = 0; i < word.length(); i++) {
			
			char c = word.charAt(i);
			
			int valueOfc = (int) c - (int) '0';
			
			insertedWord = insertedWord * 10 + valueOfc;
		}
		System.out.println("The convertion from String to Integer is: " + insertedWord);
	}

}

