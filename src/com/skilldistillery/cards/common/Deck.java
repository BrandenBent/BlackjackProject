package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<>(52);

	public Deck(List<Card> deck) {
		super();
		this.deck = deck;
	}
	
	public Deck() {
		
	}


	public List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(rank, suit));
			}
		}
		return deck;
	}

	public int checkDeckSize(List<Card> deck) {
//		System.out.println(deck.size());
		return deck.size();
	}

	public void dealCard(List<Card> deck) {
		System.out.println(deck.remove(0).toString());

	}

	public List<Card> shuffleDeck(List<Card> deck) {
		Collections.shuffle(deck);
		return deck;
	}

}
