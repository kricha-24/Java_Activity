package com.ltts;

import java.util.Comparator;

public class Team {
	String name;
	Long numberOfMatches;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMAtches(Long numberOfMAtches) {
		this.numberOfMatches = numberOfMAtches;
	}
	public Team(String name, Long numberOfMAtches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMAtches;
	}
}

class TeamComparator implements Comparator<Team>{
	public int compare(Team t1, Team t2){
		return (int) (t1.numberOfMatches - t2.numberOfMatches);
}}

