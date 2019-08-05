package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck  {
	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	private List<Card> createDeck() {
		List<Card> deck = new ArrayList<Card>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(rank, suit));
			}
		}
		Collections.shuffle(deck);
		return deck;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deck [cards=");
		builder.append(cards);
		builder.append("]");
		return builder.toString();
	}

	public int checkDeckSize() {
		return cards.size();

	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card removeCard() {
		return cards.remove(0);
	}

//	public List<Card> getCards() {
//		return cards;
//	}
//		for (Card card : deck.cards) {
////			switch(card.getValue()) {
////			case: TWO 
////				value += 2;
////				break;
//			if (card.getValue() == 2) {
//				value += 2;
//			} else if (card.getValue() == 3) {
//				value += 3;
//			} else if (card.getValue() == 4) {
//				value += 4;
//			} else if (card.getValue() == 5) {
//				value += 5;
//			} else if (card.getValue() == 6) {
//				value += 6;
//			} else if (card.getValue() == 7) {
//				value += 7;
//			} else if (card.getValue() == 8) {
//				value += 8;
//			} else if (card.getValue() == 9) {
//				value += 9;
//			} else if (card.getValue() == 10) {
//				value += 10;
//			} else if (card.getValue() == 11) {
//				value += 11;
//			}
//
//		}
//
//		return value;
//
//	}

	

}
