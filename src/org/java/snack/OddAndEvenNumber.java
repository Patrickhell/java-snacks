package org.java.snack;

import java.util.Scanner;

public class OddAndEvenNumber {
	
	public static void main(String[] args) {
		
		//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a number: " );
		int number = sc.nextInt();
		
		sc.close();
		
		
		if(number % 2 == 0) {
			
			System.out.println(number);
			
		}else {
			
			System.out.println(number + 1);
		}
		
	}

}

