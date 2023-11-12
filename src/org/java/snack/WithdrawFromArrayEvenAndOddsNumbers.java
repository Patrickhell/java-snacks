package org.java.snack;

import java.util.Random;
import java.util.Arrays;

public class WithdrawFromArrayEvenAndOddsNumbers {

public static void main(String[] args) {
		
		//Creare un array di 10 elementi randomici compresi tra 100 e 1000 e stampare:
		//- tutti gli elementi pari
		//- tutti gli elementi dispari
		//- tutti gli elementi in indice pari
		//- tutti gli elementi in indice dispari
		
		Random rnd = new Random();
		
		int[] randomNumbers = new int[10];
		
		for(int i = 0; i < 10; i++) {
			
			randomNumbers[i] = rnd.nextInt(100, 1000);
			
		}
		
		System.out.println(Arrays.toString(randomNumbers));
		
		System.out.print("Even numbers list is:");
		
		for(int evenNumber : randomNumbers ) {
			
			if(evenNumber % 2 == 0) {
				
				
				System.out.print(" " + evenNumber + " ");
				
			} 
			
		  }
		
		System.out.println("\n---------------------\n");
		
		System.out.print("Odd numbers list is:");
		
         for(int oddNumber : randomNumbers ) {
			
			if(oddNumber % 2 != 0) {
				
				System.out.print(" " + oddNumber + " ");
				
			} 
			
		  }
         
         System.out.println("\n---------------------\n");
         
         System.out.print("Numbers with enven Index are: ");
         
         for(int i = 0; i < randomNumbers.length; i++ ) {
 			
 			if(i % 2 == 0) {
 				
 				System.out.print(" " + randomNumbers[i] + " ");
 				
 			}
 			
 		  }
         
         System.out.println("\n---------------------\n");
         
         System.out.print("Numbers with Odd Index are: ");
         
         for(int i = 0; i < randomNumbers.length; i++ ) {
 			
 			if(i % 2 != 0) {
 				
 				System.out.print(" " + randomNumbers[i] + " ");
 				
 			}
 			
 		  }
		
	}

}
