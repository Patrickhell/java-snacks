package org.java.snack;

import java.util.Scanner;

public class ConvertSecondsToHoursMinutesAndSeconds {

	
public static void main(String[] args) {
		
		//Scrivere un programma che dati dei secondi li converta in ore,
		//minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”) 
		
	  Scanner sc = new Scanner(System.in); 
	  
      while(true) {
    	  
		System.out.println("Insert Seconds: ");
		int sec = sc.nextInt();
		
		if(sec == 0) {
			System.out.println("You didn't enter anything.Please insert a Number ");
			
		}else {
			
			System.out.println("Insert Seconds: ");
			sec = sc.nextInt();
			
			int hour = sec / (60 * 60);
		    int minuts = (sec / (60 * 60)) / 60;
			int seconds = sec % 60;
			
			System.out.println("I convert second to Hours, Minutes and Seconds:" + 
			  String.format("%02d", hour) + ":" + 
			  String.format("%02d", minuts) + ":" +
			  String.format("%02d",seconds)
			);
		}
		
	  }
       
	}

}
