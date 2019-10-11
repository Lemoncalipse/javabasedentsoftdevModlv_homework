package com.sportsbetting.domain;

public enum BetType {
	Winner("Winner"),
	GOALS("Goals"),
	PLAYERS_SCORE("Player's Score"),
	NUMBER_OF_SETS("Number of Sets");
	
	private String Type;
	
    private BetType(String a) {
    	  Type = a;
	   }
	
	public String betType() {
	      return Type;
	   }
}
