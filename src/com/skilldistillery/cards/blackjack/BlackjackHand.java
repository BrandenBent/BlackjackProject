package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.AbstractHand;
import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Rank;
import com.skilldistillery.cards.common.Suit;

public class BlackjackHand extends AbstractHand{
	


	
//	BlackjackHand hand = new BlackjackHand();
//	private List<Card> hand = new ArrayList<>();
	private static final int BLACKJACK = 21;
	private boolean blackjack;
	private boolean bust;
	
	public BlackjackHand() {
		super();
	}
	
	
//	public void showHand() {
//		for (Card card : hand) {
//			System.out.println(card.toString());
//		}
//	}
	
	

	public boolean blackjack() {
		if (this.getHandValue() == BLACKJACK) {
			blackjack = true;
		} else {
			blackjack = false;
		}
		return blackjack;
	}

//	public List<Card> getHand() {
//		return hand;
//	}
	

	public boolean isBust() {
		if (this.getHandValue() > BLACKJACK) {
			bust = true;
		} else {
			bust = false;
		}
		return bust;
	}
	
	public static int getBlackjack() {
		return BLACKJACK;
	}


//	public void addCard(Card card) {
//		hand.add(card);
//	}
//
//
//
//	@Override
//	public String toString() {
//		showHand();
//		return "";
//	}



//	@Override
//	public int getHandValue() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
	@Override
	public int getHandValue() {
		int handValue = 0;
		for (Card card : cards) {
			handValue += card.getValue();
		}
		return handValue;
	}


}
