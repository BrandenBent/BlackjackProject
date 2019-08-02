package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS("Heart"), SPADES("Spade"), CLUBS("Club"), DIAMONDS("Diamond");	
	
	private final String name;
	
	private Suit(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	
}
