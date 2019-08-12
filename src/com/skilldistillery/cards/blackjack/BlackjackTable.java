package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackTable {
	private Scanner kb = new Scanner(System.in);
	private Dealer dealer = new Dealer();
	private Player player = new Player();

	public void playHand() {
		dealer.dealHand(player);
		player.playerHandInfo();
		dealer.dealerShow();
		isBlackJackHand();
		if (player.getHand().blackjack()) {
			playAgain();
			return;
		}
		System.out.println();
		player.hitOrStay(dealer.getDeck(), kb);
		if (player.getHand().isBust()) {
			playAgain();
			return;
		}
		if (dealer.getHand().blackjack()) {
			playAgain();
			return;
		}
		player.playerHandInfo();
		dealer.dealerHandInfo();
		dealer.hitOrStay();
		winningHand();
		playAgain();
		return;
	}
	
	public void isBlackJackHand() {
		if (player.getHand().blackjack()) {
			System.out.println("BLACK JACK");
			System.out.println();
			player.playerHandInfo();
			dealer.dealerHandInfo();
			playAgain();
			return;
		}
		if (dealer.getHand().blackjack()) {
			System.out.println("Dealer Blackjack");
			System.out.println();
			dealer.dealerHandInfo();
			playAgain();
			return;
		}
		if (player.getHand().blackjack() && dealer.getHand().blackjack()) {
			System.out.println("Push");
			System.out.println();
			dealer.dealerHandInfo();
			playAgain();
			return;
		}
	}
	private void winningHand() {
		if (dealer.getHand().isBust() && player.getHand().getHandValue() < 21) {
			System.out.println();
			System.out.println("Player Wins");
			return;
		}
		if (dealer.getHand().getHandValue() < player.getHand().getHandValue()) {
			System.out.println();
			player.playerHandInfo();
			dealer.dealerHandInfo();
			System.out.println("Player Wins");
			return;
		}
		if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
			System.out.println();
			dealer.dealerHandInfo();
			player.playerHandInfo();
			System.out.println("Dealer Wins");
			return;
		}
		if (dealer.getHand().getHandValue() == player.getHand().getHandValue()) {
			System.out.println();
			player.playerHandInfo();
			dealer.dealerHandInfo();
			System.out.println("Push");
			return;
		}
	}

	public boolean playAgain() {
		boolean play = true;
		while (play) {
			System.out.println();
			System.out.print("Do you want to play again? (Y/N)? ");
			System.out.println();
			String yesNo = kb.next();
			if (yesNo.equalsIgnoreCase("Y")) {
				player.getHand().clearHand();
				dealer.hand.clearHand();
				playHand();
				play = true;
				break;
			}
			if (yesNo.equalsIgnoreCase("N")) {
				System.out.println("Thank  you come again");
				play = false;
				break;
			} else if ((!(yesNo.equalsIgnoreCase("Y") || (yesNo.equalsIgnoreCase("N"))))) {
				System.out.println("Please choose Y/N");
				play = true;
			}
		}
		return false;
	}
}