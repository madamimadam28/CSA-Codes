/* This program determines whether or a not a tournament has the required number of teams to play. Write the complete Team class. Your implementation should meet the criteria described below. The TeamTester class has been completed for you, and you can use this file to test your Team class.

Add the following:
public static variable int totalTeams: static variable should be an int. The value should be incremented whenever a new Team is constructed.

public static variable int minTeams: static variable should be an int. This is the minimum number of teams needed to play in the tournament. Set its value to 6.

constructor public Team(): constructor should increment the totalTeams variable each time a new Team object is created.

public static method tournamentReady(): static method should return a boolean indicating whether the total number of teams created meets the minimum number of teams needed to play. */

public class Team
{
    // Static Variables
    public static int totalTeams = 0;
    public static int minTeams = 6;
    
    // Constructor
    public Team() 
    {
        totalTeams++;
    }
    
    // Static Methods 
    public static boolean tournamentReady() {
        return totalTeams >= minTeams;
    }
}

public class TeamTester
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 8; i++)
        {
            // Create a team
            Team opponent = new Team();
            
            // Ready to play a tournament?
            System.out.println(i + 1 + " teams added");
            System.out.print("Ready for tournament? ");
            System.out.println(Team.tournamentReady());
        }
    }
}