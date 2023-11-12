package org.java.snack;

import java.util.Random;
import java.util.Arrays;

public class MaxMinMedValueOfCasualNumbersOfArray {
	
	//Creare un array di 10 interi randomici compresi tra 100 e 150. 
		//Stampare tutti i valori contenuti nell'array (dopo averli inseriti). 
		//Stampare inoltre il valore minimo, massimo e la media.
		
		public static void main(String[] args) {
			
	        	Random rnd = new Random();
	        	int[] arrayOfRandomValue = new int[10];
	        	
	        	for(int i = 0; i < 10; i++) {
	        	        	
	        		arrayOfRandomValue[i] = rnd.nextInt(100, 150);
	        	}
	        	
	        	System.out.println("Array of random value: " + Arrays.toString(arrayOfRandomValue));
	        	
	        	//asssegniamo a minValue un valore preso all'interno dell'array
	        	int minValue = arrayOfRandomValue[0];
	        	
	        	// x percorrendo l'array, assumendo i suoi diversi valori
	        	for( int x : arrayOfRandomValue) {
	        		
	        		if(x < minValue) {
	        			
	        			minValue = x;
	        			
	        		}
	        	}
	        	System.out.println("Minimum Value is: " + minValue);
	        	
	        	int maxValue = arrayOfRandomValue[0];
	        	
	        	for(int j : arrayOfRandomValue) {
	        		
	        		if(j > maxValue) {
	        			
	        			maxValue = j;
	        		}
	        	}
	        	System.out.println("Maximum Value is: " + maxValue);
	        	
	        	int sum = 0;
	        	float average = 0;
	        	for(int i = 0; i < arrayOfRandomValue.length; i++) {
	        		
	        		sum += arrayOfRandomValue[i];
	        		average = sum / 10F;
	        	}
	        	
	        	System.out.println("Sum of array values: all: " + sum);
	        	System.out.println("average of array values: " + String.format("%.02f", average));

		}
	}

