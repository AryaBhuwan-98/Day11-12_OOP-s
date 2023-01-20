package com.bridgelabz.accountmanagement.Deck_of_cards;

import java.util.Scanner;

public class Players {
    public static void main(String[] args) {

		// calling method

		System.out.println("\nPress 1--> Tp view cards of 4 players");
		DeckofCards cards = new DeckofCards();
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		switch (number) {
		case 1:
			cards.getCardCombination();
			cards.getPlayer();
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
	}

}
