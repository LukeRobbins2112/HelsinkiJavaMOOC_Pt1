
import java.util.ArrayList;

public class Team {
    
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team (String name){
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player play){
        
        if (players.size() < this.maxSize){
            this.players.add(play);
        }
    }
    
    public void printPlayers(){
        for (Player plays : players){
            System.out.println(plays);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return players.size();
    }
    
    public int goals(){
        
        int goals = 0;
        for (Player p : players){
            goals+=p.goals();
        }
        
        return goals;
    }
    
}
