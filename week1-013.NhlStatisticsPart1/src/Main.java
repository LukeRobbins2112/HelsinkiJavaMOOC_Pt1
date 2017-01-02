
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top ten players by goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println(" ");
        System.out.println("Top 25 players based on penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println(" ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println(" ");
        NHLStatistics.teamStatistics("PHI");
        System.out.println(" ");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
        
        
        
        
    }
}
