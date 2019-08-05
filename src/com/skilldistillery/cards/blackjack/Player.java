package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Player extends AbstractBlackjackPlayer {
	private BlackjackHand hand = new BlackjackHand();
	
	Scanner sc = new Scanner(System.in);
	
	public Player() {
		
	}
	
	public void showHand() {
		System.out.println("Player " + this.getHand());
		System.out.println("Player Hand Value: " + this.getHand().getHandValue() + "\n");
	}


	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}

	 public List<Card> createHand(){
		  List<Card> deck = new ArrayList<>(0);
		  return deck;
	  }
	 
	 public void drawCard() {
		 
	 }

	public Boolean hitOrStay(Deck deck, Scanner sc) {
		boolean hit = true;
		int cardDrawn = 2;

		while (hit) {
			int choice = 0;
			while (choice == 0) {
				System.out.print("Press 1 to hit or 2 to stay: ");
				try {
					choice = sc.nextInt();
				} catch (Exception e) {
					sc.nextLine();
				}
			}
			if (choice == 1) {
				this.getHand().addCard(deck.removeCard());
				System.out.println("Player Cards: " + this.getHand().getHand().get(cardDrawn));
				System.out.println("Current" + this.getHand() + "\n" );
				System.out.println("Current value: " + this.getHand().getHandValue() + "\n");
				cardDrawn++;
				hit = true;
			}
			if (this.getHand().isBust()) {
				System.out.println("dealer bust");
				System.out.println("dealer wins");
				hit = false;
			}
			if (choice == 2) {
				hit = false;
			}
		}
		return hit;
	}

	@Override
	public void showCard() {
		
	}
	
	@Override
	public BlackjackHand getHand(BlackjackHand hand) {
		return hand;
		
	}

	@Override
	public BlackjackHand getHand() {
		return hand;
	}


//	@Override
//	public Boolean hitOrStay() {
//		return null;
//	}

}
