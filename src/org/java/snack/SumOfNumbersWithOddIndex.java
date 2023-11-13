package org.java.snack;

import java.util.Random;

public class SumOfNumbersWithOddIndex {

public static void main(String[] args) {
		
		//Crea un array di numeri interi e fai la somma
		//di tutti gli elementi  che sono in posizione dispari
		
	    Random rnd = new Random();
	
		final int lengthOfIntegerList = 10;
		
		int[] arrInteger = new int[lengthOfIntegerList];
		
		for (int x = 0; x < lengthOfIntegerList; x++) {	
			
			arrInteger[x] = rnd.nextInt(10);	
		}
		
		int sum = 0;
		
		for (int x = 1; x <lengthOfIntegerList; x += 2) {
			
			System.out.println("[" + x + "] " + arrInteger[x]);
			
			sum += arrInteger[x];
			
		}	
		
		System.out.println("sum: " + sum);
       }

}
