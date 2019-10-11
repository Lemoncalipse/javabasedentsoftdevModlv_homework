package com.sportsbetting.domain;

public enum Currency {
	HUF("HUF"),
	EUR("EUR"),
	USD("USD");
	
	private String Type;
	
    private Currency(String a) {
    	  Type = a;
	   }
	
	public String currency() {
	      return Type;
	   }
}
