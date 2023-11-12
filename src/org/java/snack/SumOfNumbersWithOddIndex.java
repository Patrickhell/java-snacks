package org.java.snack;

public class SumOfNumbersWithOddIndex {

public static void main(String[] args) {
		
		//Crea un array di numeri interi e fai la somma
		//di tutti gli elementi  che sono in posizione dispari
		
		int[] IntegerNumbersList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		System.out.println("Sum of all number in odd position is: ");
		
		for(int i = 0; i < IntegerNumbersList.length; i++) {
			
			if(i % 2 != 0) {
				
				sum += IntegerNumbersList[i];
				
				System.out.println(sum);
			}
		}
		
}

}
