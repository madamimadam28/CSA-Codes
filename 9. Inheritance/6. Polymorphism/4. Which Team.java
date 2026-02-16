/* For this exercise, you are given a Team superclass with a BaseballTeam and FootballTeam subclass. 
Take a moment to examine these classes and the instance variables and methods in each.

In the TeamTester class, you will see three objects declared and instantiated using the Team, FootballTeam, or BaseballTeam classes.

For each object, use a print statement to print out any public method that returns information that is available for that particular object, including the toString.

For example, the dolphin object is a FootballTeam object. 
One of the pieces of information that can be printed is the getTies() method, so you will call that method in your TeamTester file:

System.out.println(dolphins.getTies());
Do this for all the methods that each of the objects can call.

Hint: Remember, for the program to compile and run, Java looks for methods to exist in certain classes. */

public class Team {

    private String name;
    private String location;
    private int wins;
    private int losses;

	public Team(String name, String location, int wins, int losses) {
		this.name = name;
		this.location = location;
		this.wins = wins;
		this.losses = losses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

    public String toString(){
        return wins + " - " + losses;
    }
}

public class BaseballTeam extends Team {

    private String league;

	public BaseballTeam(String name, String location,
                    int wins, int losses, String league) {
		super(name, location, wins, losses);
		this.league = league;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

}

public  class FootballTeam extends Team {

    private int ties;


	public FootballTeam(String name, String location,
                    int wins, int losses, int ties) {
		super(name, location, wins, losses);
		this.ties = ties;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	@Override
    public String toString(){
        return super.getWins() + " - " + super.getLosses() + " - " + ties;
    }
}

public  class TeamTester {

    public static void main(String[] args) {
        FootballTeam dolphins = new FootballTeam("Dolphins", "Miami", 8, 4, 1);
        Team cubs = new BaseballTeam("Cubs", "Chicago", 80, 65, "National");
        Team lizards = new Team("Lizards", "New York", 9, 5);

        //Print out all available information for the Dolphins
        System.out.println(dolphins.getName());
        System.out.println(dolphins.getLocation());
        System.out.println(dolphins.getWins());
        System.out.println(dolphins.getLosses());
        System.out.println(dolphins.getTies());
        System.out.println(dolphins);

        //Print out all available information for the Cubs
        System.out.println(cubs.getName());
        System.out.println(cubs.getLocation());
        System.out.println(cubs.getWins());
        System.out.println(cubs.getLosses());
        System.out.println(cubs);

        //Print out all available information for the Lizards
        System.out.println(lizards.getName());
        System.out.println(lizards.getLocation());
        System.out.println(lizards.getWins());
        System.out.println(lizards.getLosses());
        System.out.println(lizards);

    }
}