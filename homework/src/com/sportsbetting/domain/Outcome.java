package com.sportsbetting.domain;

import java.util.List;

public class Outcome {
	
	private String description;
	private Bet bet;
	private List<OutcomeOdd> outcomeOdds; //I don't really understand this part here. Does it contain the different possibilities that can occur?

	public Outcome(final String description, final Bet bet, final List<OutcomeOdd> outcomeOdds) {
		this.description = description;
		this.bet = bet;
		this.outcomeOdds = outcomeOdds;
	}
}
