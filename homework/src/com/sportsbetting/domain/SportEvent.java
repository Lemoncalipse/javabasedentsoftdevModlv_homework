package com.sportsbetting.domain;

import java.time.LocalDateTime;

public abstract class SportEvent {

	private String title;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Bet bets;
	private Result result;
	
	public SportEvent(final String title, final LocalDateTime startDate,  final LocalDateTime endDate, final Bet bets, final Result result) {
		super();
		this.setTitle(title);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setBets(bets);
		this.setResult(result);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Bet getBets() {
		return bets;
	}

	public void setBets(Bet bets) {
		this.bets = bets;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}
