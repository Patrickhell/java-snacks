package org.java.snack;

import java.util.Random;

public class RandomFirstAndLastNameGenerator {

public static void main(String[] args) {
		
		//Generatore di “nomi cognomi” casuali: il Grande Gatsby 
		//ha  una lista di nomi e una lista di cognomi, e da queste vuole mostrare 
		//a video una falsa lista di invitati con nome e cognome.
		
		Random rnd = new Random();
		
		String[] nameList = {"Patrick", "Jean", "Rodrigue", "Desire", "Giovanni"};
		String[] lastNameList = {"Nana", "Hell", "Quattro ochhi", "Van_der_van"};
		
		System.out.println("A Gatsby list of Names and LastName is: ");
		
		for(int i= 0; i < 7; i++) {
			
			int IndexRandomName = rnd.nextInt(nameList.length);
			int IndexRandomLastName = rnd.nextInt(lastNameList.length);
			
			String name = nameList[IndexRandomName];
			String lastName = lastNameList[IndexRandomLastName];
			
			System.out.println(name + " " + lastName);
			
		}
	}
	
}

