package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	  private List<Card> cards;

	  public Deck() {
	    cards = createDeck();
	  }
	  
	  public List<Card> createDeck(){
	    List<Card> deck = new ArrayList<>(52);
	    for(Suit s : Suit.values()) {
	      for(Rank r : Rank.values()) {
	        deck.add(new Card(r, s));
	      }
	    }
	    return deck;
	  }
	  
	  public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public int checkDeckSize() {
	    return cards.size();
	  }
	  
	  public void shuffle() {
	    Collections.shuffle(cards);
	  }
	  
	  public Card dealCard() {
	    return cards.remove(0);
	  }
	  
	  public void showCard(Card card) {
		  System.out.println(card.toString());
	  }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cards in deck: ");
		builder.append(cards);
		builder.append(" ");
		return builder.toString();
	}
	  
	}
