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
		
		System.out.print("insert a number: ");
		String number = sc.nextLine().toLowerCase();
		
		int insertedNumber = 0;
		
		for (int i = 0; i < number.length(); i++) {
			
			char c = number.charAt(i);
			
			int valueOfc = (int) c - (int) '0';
			
			insertedNumber = insertedNumber * 10 + valueOfc;
		}
		System.out.println("The convertion from String number to Integer is: " + insertedNumber);
	}

}

