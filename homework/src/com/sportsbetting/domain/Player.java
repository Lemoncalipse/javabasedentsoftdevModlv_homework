package com.sportsbetting.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Player {
	
	private String name;
	private int accountNumber;
	private int balance;
	private Currency currencyType;
	private LocalDateTime dateOfBirth;

	public Player(final String name, final int accountNumber, final int balance, final Currency currencyType, final LocalDateTime dateofBirth) {
		this.setName(name);
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
		this.setCurrencyType(currencyType);
		this.setDateOfBirth(dateofBirth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Currency getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(Currency currencyType) {
		this.currencyType = currencyType;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
