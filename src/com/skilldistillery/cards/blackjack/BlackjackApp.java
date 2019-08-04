package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.run();

	}

	private void run() {
		BlackjackTable table = new BlackjackTable();
		table.setUp();
		
		
	}
}
