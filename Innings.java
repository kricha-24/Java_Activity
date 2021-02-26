import java.util.*;
import java.util.Scanner;

class Innings{
	private String teamname, inningsname;
	private Int runs;
	
	public String getTeamName(){
		return teamname;
	}
	public void setTeamName(String teamname){
		this.teamname = teamname;
	}
	
	public String getInningsName(){
		return inningsname;
	}
	public void setInningsName(String inningsname){
		this.inningsname = inningsname;
	}
	
	public Int getRuns(){
		return runs;
	}
	public void setRuns(Int runs){
		this.runs= runs;
	}
	
}