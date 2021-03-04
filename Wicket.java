package com.ltts;

public class Wicket {
	String playerName;
	String object;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public Wicket(String playerName, String object) {
		super();
		this.playerName = playerName;
		this.object = object;
	}
	
}
