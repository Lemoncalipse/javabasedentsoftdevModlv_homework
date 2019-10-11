package com.sportsbetting;

import com.sportsbetting.domain.*;

import java.util.List;
import java.util.Scanner;
import com.sportsbetting.service.*;
import com.sportsbetting.view.*;
import com.sportsbetting.service.SportsBettingService;
import com.sportsbetting.view.View;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
	public static void main(String[] args) {
	    App app = new App(new SportsBettingService(), new View());
	    app.play();
	}
	
	public App(SportsBettingService sportsBettingService, View view) {
    	
	}

	private static SportEvent event;
	
	private static Player player;
	
	private static Bet betOne;
    private static Bet betTwo;
    
    private static Outcome outcomeOne;
    private static Outcome outcomeTwo;
    private static Outcome outcomeThree;
    
    private static OutcomeOdd outcomeOddOne;
    private static OutcomeOdd outcomeOddTwo;
    private static OutcomeOdd outcomeOddThree;
    private static OutcomeOdd outcomeOddFour;
		
	public void play() {
	    this.createEvent();
	    this.createBet();
	    this.createOutcome();
	    this.createPlayer();
	    this.doBetting();
	}
	
	public void createEvent() {
		LocalDateTime startTime =  LocalDateTime.of(2020, 1, 1, 12, 0);
		LocalDateTime finishTime = LocalDateTime.of(2020, 1, 1, 15, 30);
		
		//title, startDate, endDate, bet, result);
		event = new FootballSportEvent("Arsenal vs Chelsea", startTime, finishTime, null, null);
				
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //String formattedStartTime = startTime.format(formatter);
        //System.out.println("After : " + formattedStartTime);
	}
	
	private void createBet() {
		//String description, SportEvent event, BetType type, List<Outcome> bets
	    betOne = new Bet("player Oliver Giroud score", event, BetType.PLAYERS_SCORE, null);
	    betTwo = new Bet("winner", event, BetType.Winner, null);
	}
	
	private void createOutcome() {
	    outcomeOne = new Outcome(null, null, null);
	    outcomeTwo = new Outcome(null, null, null);
	    outcomeThree = new Outcome(null, null, null);
	}
	
	private void createOutcomeOdd() {
		outcomeOddOne = new OutcomeOdd(null, null, null, null, 0, null);
		outcomeOddTwo = new OutcomeOdd(null, null, null, null, 0, null);
		outcomeOddThree = new OutcomeOdd(null, null, null, null, 0, null);
		outcomeOddFour = new OutcomeOdd(null, null, null, null, 0, null);
	}
	
	private void createPlayer() {
		Player player = new Player(null, 0, 0, null, null);
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("> What is your name?");
        String name = in.nextLine();
        player.setName(name);
        
        System.out.println("> How much money do you have (more than 0)?");
        String balance = in.nextLine();
        if(balance != "0") {
        	Integer value = Integer.valueOf(balance);
        	player.setBalance(value);
        }
        
        System.out.println("> What is your currency? (HUF, EUR or USD)");
        String currency = in.nextLine();
        switch(currency) {
        	case "HUF":
        		player.setCurrencyType(Currency.HUF);
        		break;
        	case "EUR":
        		player.setCurrencyType(Currency.EUR);
        		break;
        	case "USD":
        		player.setCurrencyType(Currency.USD);
        		break;
        	default:
        		System.out.println("> Invalid currency type.");
        		System.exit(0);
        }
        System.out.println("> Welcome " + player.getName() + "!");
        System.out.println("> Your balance is " + player.getBalance() + " " + player.getCurrencyType());
	}
	
	private void doBetting() {
		System.out.println("> What are you want to bet on? (choose a number or press q for quit)");
		System.out.println("> 1: Sport event: " + event.getTitle() + " (start: " + event.getStartDate() + ")");

	}
	
	private void calculateResults() {
		
	}
	
	private void printResults() {
		
	}
}
