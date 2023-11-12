package org.java.snack;

import java.util.Scanner;

public class IntegerSum {
	
	public static void main(String[] args) {
		
		//Chiedere all'utente numeri interi e calcolarene la somma. 
		//Continuare a chiedere numeri, finche' la sommatoria non supera il valore `1000`
		
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		do {
			
			System.out.println("Insert IntegerNumbers: ");
			int number = sc.nextInt();
			sum+= number;
			System.out.println("la somma è: " + sum);
			
			
			
		} while(sum <= 1000);
		
		System.out.println("la somma totale è: " + sum);
		
		sc.close();
    }
}
