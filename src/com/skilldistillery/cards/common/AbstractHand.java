package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
	protected List<Card> hand;
	
	public AbstractHand() {
		hand = new ArrayList<>();
	}
	public void addCard(Card card) {
		hand.add(card);
	}
	public void clear() {
		hand.clear();
	}

	public abstract int getHandValue();
	
	public String toString() {
		
		//TODO: display cards in hand, possibly make player/dealer do it
		return hand.toString();
	}
	
}
