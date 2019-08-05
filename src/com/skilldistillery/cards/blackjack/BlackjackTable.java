package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackTable {

	protected Scanner sc = new Scanner(System.in);
	protected Dealer dealer = new Dealer();
	protected Player player = new Player();
	Deck deck = new Deck();

	public BlackjackTable() {

	}


	public void playHand() {
		
		
		
		dealer.dealHand(player);
		player.showHand();
		dealer.dealerFinal();
		if (player.getHand().blackjack()) {
			System.out.println("You have Blackjack");
			player.showHand();
			dealer.showHand();
			playAgain();
			return;
		}
		if (dealer.getHand().blackjack()) {
			System.out.println("Dealer has blackjack");
			dealer.showHand();
			playAgain();
			return;
		}
		if (player.getHand().blackjack() && dealer.getHand().blackjack()) {
			System.out.println("Push" + "\n");
			dealer.showHand();
			playAgain();
			return;
		}
		System.out.println();
		player.hitOrStay(dealer.getDeck(), sc);
		if (player.getHand().isBust()) {
			playAgain();
			return;
		}
		player.showHand();
		dealer.showHand();
		dealer.hitOrStay();
		winningHand();
		playAgain();
		return;
	}

	private void winningHand() {
		if (dealer.getHand().isBust() && player.getHand().getHandValue() < 21) {
			System.out.println();
			System.out.println("You win!");
			return;
		}
		if (dealer.getHand().getHandValue() < player.getHand().getHandValue()) {
			System.out.println();
			player.showHand();
			dealer.dealerFinal();
			System.out.println("You win!");
			return;
		}
		if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
			System.out.println();
			dealer.dealerFinal();
			player.showHand();
			System.out.println("You lose!");
			return;
		}
		if (dealer.getHand().getHandValue() == player.getHand().getHandValue()) {
			System.out.println();
			player.showHand();
			dealer.dealerFinal();
			System.out.println("Push");
			return;
		}
	}

	public boolean playAgain() {
		boolean play = true;
		while (play) {
			System.out.println();
			System.out.print("Do you want to play again? (Yes/No)? ");
			String playAgain = sc.next();
			if (playAgain.equalsIgnoreCase("yes")) {
				player.getHand();
				playHand();
				play = true;
				break;
			}
			if (playAgain.equalsIgnoreCase("N")) {
				System.out.println("Thank you for playing!");
				play = false;
				break;
			} else if ((!(playAgain.equalsIgnoreCase("Y") || (playAgain.equalsIgnoreCase("N"))))) {
				System.out.println("Invalid Choice");
				play = true;
			}
		}
		return false;
	}
}
