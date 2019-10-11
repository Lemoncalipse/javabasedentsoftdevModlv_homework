package com.sportsbetting.domain;

import java.util.List;

public class Bet {
	
	protected final String description;
	protected final SportEvent event;
	protected final BetType type;
	protected final List<Outcome> bets;
	
	public Bet(final String description, final SportEvent event, final BetType type, final List<Outcome> bets) {
		this.description = description;
		this.event = event;
		this.type = type;
		this.bets = bets;
	}
}
