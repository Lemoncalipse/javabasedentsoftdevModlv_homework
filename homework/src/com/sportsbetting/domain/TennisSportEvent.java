package com.sportsbetting.domain;

import java.time.LocalDateTime;

public class TennisSportEvent extends SportEvent {

	public TennisSportEvent(final String title, final LocalDateTime startDate,  final LocalDateTime endDate, final Bet bet, final Result result) {
		super(title, startDate, endDate, bet, result);
	}
}
