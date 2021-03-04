import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PlayerBO extends Player{
	
	public List <Player> findPlayer(List <Player> playerList, String nationality){
		List<Player> similar =new ArrayList<Player>();
		
		for(Player str: playerList) {
			if(((List<Player>) str).contains(nationality)) {
				similar.add(str);
			}
		}
		return similar;
		
	}
	
	public List <Player> findPlayer(List <Player> playerList, Date dateOfBirth){
		
		List<Player> similar2 =new ArrayList<Player>();
		for(Player str: playerList) {
			if(((List<Player>) str).contains(dateOfBirth)) {
				similar2.add(str);
			}
		}
			return similar2 ;
		
	}
	
	public List <Player> findPlayer(List <Player> playerList, Double powerRating){
		List<Player> similar3 =new ArrayList<Player>();
		
		for(Player str: playerList) {
			if(((List<Player>) str).contains(powerRating)) {
				similar3.add(str);
			}
		}
		return similar3;
	}
	
}
