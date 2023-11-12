package org.java.snack;

import java.util.Scanner;

public class ShowChartsAndNumberCountOfString {

public static void main(String[] args) {
		
		//Data una stringa in input mostrare a video quanti caratteri alfabetici 
		//contiene, quanti numeri e quanti simboli non alfanumerici.

        //Continuare a chiedere una nuova stringa finchè non si inserisce 0.
		
		while(true) {
		//true perché fino a che l'utente non inserisca nulla(false == 0 ) continua a eseguire il seguente codice:
			
		Scanner sc = new Scanner (System.in);
		
		System.out.println("insert a word: ");
		String word = sc.nextLine();
		
		int numberCount = 0;
		int alphanumeriCount = 0;
		int symbolCount = 0;
		
		//se l'utente inserisce 0 break: non eseguire più il codice seguente 
		//restituiscimi il codice fuori dal ciclo cioè :non hai inserito nulla.
		
		if(word.equals("0")) {
			
			break;
		}
			
		//creiamo un array una dimensione che può contenere tutti i caratteri dell'alfabeto, da 'a' a 'z' inclusi.
		
		char[] arrayContainsAlphabeticChartList = new char [(int) 'z' - (int) 'a' + 1];
		
		//popoliamo l'array con i caratteri dell'alfabeto ad ogni iterazione di i procedendo dalla 'a' alla 'z',
		 
		
		for(int i = 0; i <  arrayContainsAlphabeticChartList.length; i++) {
			
			//il carattere c utilizzato per popolare con lettere dell'alfabeto
			char c = (char)((int)'a' + i);
			
			// che vengono memorizzate nell'array ad ogni iterazione di i;
			arrayContainsAlphabeticChartList[i] = c;
		}
		char[] arrayContainsAllNumberList = new char [(int) '9' - (int) '0' + 1];
		

        for(int i = 0; i <  arrayContainsAllNumberList.length; i++) {
        	
        	//il carattere c utilizzato per popolare con numeri da 0 a 9
			char c = (char)((int)'0' + i);
			
			// che vengono memorizzati nell'array ad ogni iterazione di i;
			arrayContainsAllNumberList[i] = c;
		}
        
        //verifica a ogni iterazione di i
        for(int i = 0; i < word.length(); i++) {
        	
        	//che quei caratteri o numeri (c) siano presenti nella parola inserita dall'utente;
        	char c = word.charAt(i);
        	
        	//se è un numero che vienne inserito contalo
        	if(Character.isDigit(c)) {
        		
        		numberCount++;
        		
        	//se è una lettera che vienne inserito contala
        	} else if(Character.isLetter(c)) {
        		
        		alphanumeriCount++;
        		
        	// e tutto il resto sono simboli;.
        	} else {
        		
        		symbolCount++;
        	}
        }
		
	    System.out.println("Numbers count: " + numberCount);
	    System.out.println("Alpha Caracters count: " + alphanumeriCount);
	    System.out.println("Symbols count: " + symbolCount);
	    
	}
		System.out.println("You didn't enter anything ");
	}


}

