package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackTable {
	
	public void setUp() {
		Player player = new Player();
		Dealer dealer = new Dealer();
		Deck deck = new Deck();
		deck.createDeck();
		deck.shuffle();
		
		// PRINTS SIZE OF DECK FOR TESTING ***********************
//		System.out.println(deck.checkDeckSize());
		
		// PRINTS EVERY CARD IN DECK FOR TESTING ********************
		for (Card card : deck.getCards()) {
			System.out.println(card.toString());
		}
	}
	
	public void dealInitial(AbstractBlackjackPlayer player) {
		player.getHand();
		player.showHand();
	}
	
//	deck.createDeck();
//	System.out.println(deck.checkDeckSize());
//	
//	for (Card card : deck.createDeck()) {
//		System.out.println(card.toString());
//	}
}
