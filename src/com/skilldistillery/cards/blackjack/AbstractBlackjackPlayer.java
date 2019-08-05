package com.skilldistillery.cards.blackjack;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class AbstractBlackjackPlayer {
	private BlackjackHand hand; 
	
	public abstract void showCard();

	protected abstract void showHand();


	public abstract BlackjackHand getHand(BlackjackHand hand);

	protected abstract List<Card> createHand();

	public Boolean hitOrStay(Scanner sc) {
		return null;
		
	}
	

	public BlackjackHand getHand() {
		return hand;
	}

	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}

	public boolean hitOrStay() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
