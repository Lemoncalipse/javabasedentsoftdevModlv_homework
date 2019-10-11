package com.sportsbetting.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OutcomeOdd {
	
	private String outcome;
	private BigDecimal value;
	private LocalDateTime validFrom;
	private LocalDateTime validTo;
	private int currency;
	private Currency currencyType;
	
	public OutcomeOdd(final String outcome, final BigDecimal value, final LocalDateTime validFrom, final LocalDateTime validTo, final int currency, final Currency currencyType) {
		this.setOutcome(outcome);
		this.setValue(value);
		this.setValidFrom(validFrom);
		this.setValidTo(validTo);
		this.setCurrency(currency);
		this.setCurrencyType(currencyType);
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public LocalDateTime getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDateTime validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDateTime getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDateTime validTo) {
		this.validTo = validTo;
	}

	public int getCurrency() {
		return currency;
	}

	public void setCurrency(int currency) {
		this.currency = currency;
	}

	public Currency getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(Currency currencyType) {
		this.currencyType = currencyType;
	}
}
