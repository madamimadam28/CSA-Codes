/* The CricketPlayer class was created so that we can track different stats. It was designed to create a player, then add a match’s statistics, and report the stats.

Take a few minutes to check out the CricketPlayer class. Note how you can construct a CricketPlayer and how you can add a match’s statistics.

Your task:
Create two Cricket players, one with a team, one without a team.
Add at least 4 matches to each player
Print out the player’s name, their statistics, and then print the object
Sample Output:

Brian Lara's Stats: 
Runs scored per match: 9.0
Balls bowled per match: 1.75
Brian Lara scored an average of 9.0 runs during these 4 matches.

Fabian Allen's Stats: 
Runs scored per match: 11.75
Balls bowled per match: 20.25
Fabian Allen scored an average of 11.75 runs during these 4 matches.
Note: To print a blank line, just use an empty System.out.println(); command. */

public class CricketPlayer {

    /* This class is complete. Take a look around
     * to make sure you understand how to use it,
     * but you do not need to make changes.
     */
     
	private String name;
	private String team;
	private int totalRunsScored;
    private int totalBallsBowled;
	private int matchesPlayed;


    public CricketPlayer(String playerName, String currentTeam) {
        name = playerName;
        team = currentTeam;
        
        // Note that primitive values are automatically initialized
        // so we don't actually need these lines
        totalRunsScored = 0;
        totalBallsBowled = 0;
        matchesPlayed = 0;
    }
    
    public CricketPlayer(String playerName){
        // this() is a shortcut to calling the other constructor
        // in this class. We will see more of 'this' in a later
        // unit, but it is shown here as a best practice.
		this(playerName, "no team");
    }
    
    public void addMatch(int runsScored, int ballsBowled){
        totalRunsScored += runsScored;
        totalBallsBowled += ballsBowled;
        matchesPlayed++;
    }
    
    public void printRunsScored(){
        System.out.print("Runs scored per match: ");
        System.out.println((double) totalRunsScored / matchesPlayed);
	}

    public void printBallsBowled() {
		System.out.print("Balls bowled per match: ");
        System.out.println((double) totalBallsBowled / matchesPlayed);
	}

	public String toString() {
		return name + " scored an average of " + ((double) totalRunsScored / matchesPlayed) +
		    " runs during these " + matchesPlayed + " matches.";
	}

}

public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
       CricketPlayer p1 = new CricketPlayer("Brian Lara");
       CricketPlayer p2 = new CricketPlayer("Fabian Allen", " Antigua & Barbuda Falcons");
       p1.addMatch(5, 2);
       p1.addMatch(4, 2);
       p1.addMatch(4, 3);
       p1.addMatch(5, 2);
       p2.addMatch(10, 5);
       p2.addMatch(9, 4);
       p2.addMatch(10, 3);
       p2.addMatch(8, 5);

       System.out.println("Brian Lara's Stats: ");
       p1.printRunsScored();
       p1.printBallsBowled();
       System.out.println(p1);
       System.out.println();
       
       System.out.println("Fabian Allen's Stats: ");
       p2.printRunsScored();
       p2.printBallsBowled();
       System.out.println(p2);
    }
}