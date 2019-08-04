package com.skilldistillery.cards.blackjack;

public class Dealer extends AbstractBlackjackPlayer {
	private BlackjackHand hand;
	
	public Dealer() {

	}
	
	
	
	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}



	public void dealHand(AbstractBlackjackPlayer player) {
		player.getHand();
	}
	
	@Override
	public void hitOrStay() {
		
	}

	@Override
	public void showCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getHand() {
		// TODO Auto-generated method stub
		
	}



	@Override
	protected void showHand() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public BlackjackHand getHand(BlackjackHand hand) {
		// TODO Auto-generated method stub
		return null;
	}

}
