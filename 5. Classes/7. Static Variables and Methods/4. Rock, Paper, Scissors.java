/* In this problem, you’ll play a simple rock, paper, scissors
game. First, you’ll ask the user to pick rock, paper, or
scissors.

Then, you’ll have the computer randomly choose one of the
options. You should use the Randomizer class that you created in the last exercise to help the computer make a choice.

After that, print out the winner!

Your game should loop until the user hits enter without making a selection, at which point it should exit.

Note: You’ll need to implement a method called
String getWinner(String user, String computer) that determines whether the user or computer won the game, and return the correct winner!

Here is a sample run of the program.

Enter your choice (rock, paper, or scissors): 
rock
User: rock
Computer: rock
Tie
Enter your choice (rock, paper, or scissors):
paper
User: paper
Computer: rock
User wins!
Enter your choice (rock, paper, or scissors):
Thanks for playing! */

import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    public static String getWinner(String user, String computer)
    {
        if ((user.equals("rock") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("rock"))) {
            return COMPUTER_PLAYER;
        }
        else if ((computer.equals("rock") && user.equals("paper")) ||
            (computer.equals("paper") && user.equals("scissors")) ||
            (computer.equals("scissors") && user.equals("rock"))) {
            return USER_PLAYER;
        }
        else {
            return TIE;
        }
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String choice = input.nextLine();
        System.out.println();
        while (!choice.isEmpty()) {
            System.out.println("User: " + choice);
            
            int num = Randomizer.nextInt(1, 3);
            String comChoice = "";
            
            if (num == 1) {
                comChoice = "rock";
            }
            else if (num == 2) {
                comChoice = "paper";
            }
            else {
                comChoice = "scissors";
            }
            
            System.out.println("Computer: " + comChoice);
            
            System.out.println(getWinner(choice, comChoice));
            
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            choice = input.nextLine();
            System.out.println();
        }
    }
}