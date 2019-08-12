package com.skilldistillery.cards.blackjack;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class AbstractBlackjackPlayer {
	protected BlackjackHand hand = new BlackjackHand(); 
	
	public abstract void showCard();

	protected abstract void showHand();


	public abstract BlackjackHand getHand(BlackjackHand hand);


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
		return false;
	}

	public Deck getHand(Deck deck) {
		// TODO Auto-generated method stub
		return null;
	}

	protected List<Card> createHand() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
