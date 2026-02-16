/*Create a program that allows you to create a fantasy football roster based on the existing list of available players.

Your team can only have 5 players, so create an array that can store 5 possible players.

Prompt the user to pick 5 players to add to their team. 
If the player is available in the list of availablePlayers, then add that player to the user’s array, and remove that player from the availablePlayers list. 
Then prompt the user to pick another player. Once all five players have been added, print the list in the console.

Create a search method to find the index at which the player is located in the availablePlayers list so you can make sure that they are an eligible pick 
and remove the player from the available pool of players.

Here is a sample run of the program:

Enter name of player to add: 
Cam Newton
Successfully added player

Enter name of player to add: 
Travis Kelce
Successfully added player

Enter name of player to add: 
Alvin Kamara
Successfully added player

Enter name of player to add: 
Alvin Kamara
Alvin Kamara is not an available player.

Enter name of player to add: 
Patrick Mahomes
Successfully added player

Enter name of player to add: 
Mike Evans
Successfully added player

Final Team Roster: 
Cam Newton
Travis Kelce
Alvin Kamara
Patrick Mahomes
Mike Evans */

import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        String[] players = new String[5];
        int cnt = 0;
        while (cnt < 5) {
            System.out.println("Enter name of player to add:");
            String player = input.nextLine();
            int idx = search(availablePlayers, player);
            if (idx != -1) {
                players[cnt] = player;
                availablePlayers.remove(idx);
                System.out.println("Successfully added player");
                cnt++;
            }
            else {
                System.out.println(player + " is not an available player.");
            }
            System.out.println();
        }
        System.out.println("Final Team Roster:");
        for (String p : players) {
            System.out.println(p);
        }
    }
    
    public static int search(ArrayList<String> array, String player)
    {
        for (int i = 0; i < array.size(); ++i) {
            if (array.get(i).equals(player)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}