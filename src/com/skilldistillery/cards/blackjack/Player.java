package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player extends AbstractBlackjackPlayer {
	private BlackjackHand hand;
	
	public Player() {
		
	}
	
	
	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}


	@Override
	public void hitOrStay() {
		System.out.println("Would you like to hit or stay?");
		
	}

	@Override
	public void showCard() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public BlackjackHand getHand(BlackjackHand hand) {
		return hand;
		
	}


	@Override
	public BlackjackHand getHand() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	protected void showHand() {
		// TODO Auto-generated method stub
		
	}
	


//	public void showHand(Player player) {
//		BlackjackHand hand = player.getHand();
//		hand.getHand();
//		for (Card card : hand) {
//			System.out.println(card.toString());
//		}

}
