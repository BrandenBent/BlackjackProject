package com.skilldistillery.cards.blackjack;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends AbstractBlackjackPlayer {
	private static final int DEALER_MIN = 17;
	private Deck hand;
	private int dealCards = 2;
	private Deck deck = new Deck();
	
	public Dealer() {

	}
	
	
	public void dealHand(Player player) {
		if (deck.checkDeckSize() < 26) {
			deck = new Deck();
		}
		for (int i = 1; i < dealCards; i++) {
			player.getHand().addCard(deck.removeCard());
			this.getHand().addCard(deck.removeCard());
		}
	}
	public void dealerFinal() {
		System.out.println("Dealers Shows " + this.getHand().getHand().get(0));
		System.out.println("Dealers value is" +  this.getHand().getHand().get(0).getValue() + "\n");
	}
	
	public void dealerHandInfo() {
		System.out.println("Dealer " + this.getHand());
		System.out.println("Dealers Hand: " + this.getHand().getHandValue()+"\n");
	}
	
	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public int getNumCardsToDeal() {
		return numCardsToDeal;
	}
	
	public void setNumCardsToDeal(int cardsDeal) {
		this.numCardsToDeal = cardsDeal;
	}
	
	public static int getDealerMinScore() {
		return DEALER_MIN;
	}



	@Override
	public void showCard() {
		
	}



	@Override
	protected void showHand() {
		
	}



	@Override
	public BlackjackHand getHand(BlackjackHand hand) {
		return null;
	}



	@Override
	protected List<Card> createHand() {
		return null;
	}

	@Override
	public boolean hitOrStay() {
		boolean hit = true;
		int cardDrawn = 2;
		while (hit) {
			while (this.getHand().getHandValue() < DEALER_MIN) {
				this.getHand().addCard(deck.removeCard());
				System.out.println("Dealer draws " + this.getHand().getHand().get(cardDrawn));
//			this.setHand(hand);
				System.out.println("Dealer " + this.getHand());
				System.out.println("Dealer value: " + this.getHand().getHandValue());
				System.out.println();
				cardDrawn++;
			}
			
			if (this.getHand().isBust()) {
				System.out.println("bust");
				hit = false;
				break;
			} 
			else {
				System.out.println("Dealer Over 17");
				hit = false;
			}
		}
		return hit;
	}



}
