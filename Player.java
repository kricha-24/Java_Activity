package com.ltts;
import java.util.Comparator;

public class Player {
	String skill,name;
	
	public Player(String skill, String name) {
		super();
		this.skill = skill;
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}
class PlayerComparator implements Comparator<Player>{
	public int compare(Player player1, Player player2){
		return player1.skill.compareTo(player2.skill);
	}
	public int compare1 (Player player3, Player player4) {
		return player3.name.compareTo(player4.name);
	}
}
