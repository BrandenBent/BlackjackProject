package com.skilldistillery.cards.blackjack;

public abstract class AbstractBlackjackPlayer {
	private BlackjackHand hand; 
	
	public abstract BlackjackHand getHand();
	
	public abstract void hitOrStay();
	
	public abstract void showCard();

	protected abstract void showHand();


	public abstract BlackjackHand getHand(BlackjackHand hand);
	
}
