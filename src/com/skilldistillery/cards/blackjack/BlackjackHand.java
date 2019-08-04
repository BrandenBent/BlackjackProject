package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.AbstractHand;
import com.skilldistillery.cards.common.Card;

public class BlackjackHand {
	private List<Card> hand = new ArrayList<>();
	
	
	
	public void showHand() {
		for (Card card : hand) {
			System.out.println(card.toString());
		}
	}



	public List<Card> getHand() {
		return hand;
	}



	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	
//	@Override
//	public int getHandValue() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
