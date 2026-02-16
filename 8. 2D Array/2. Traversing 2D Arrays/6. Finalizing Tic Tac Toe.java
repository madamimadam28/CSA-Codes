/* In this exercise, we are going to complete the Tic Tac Toe game. 
In the TicTacToeTester class, use the methods that you created in the TicTacToe class to implement your own version of Tic Tac Toe.

Your game should take user input to determine which index the user would like to place their X’s and O’s, 
and check to see if there is a winner after every turn that is taken. If the user inputs an invalid space, they should be notified, and asked to input another index. 
Utilize loops to implement this effectively!

Your game should indicate which player won, and notify the users if there is a tie at the end.

Take advantage of all the methods that you created in the previous exercise, and feel free to make alterations to the game to make it your own!

If you are feeling proud of your finished program, consider submitting it to CodeHS here for a chance to get you and your program recognized on CodeHS’s Twitter account! */

public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private int spaces;
   
   private String[][] board = new String[3][3];
    public TicTacToe() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                board[i][j] = "-";
            }
        }
        spaces = 9;
    }
    
    public String[][] getBoard() {
        return board;
    }
    
    public int getSpaces() {
        return spaces;
    }
   
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println("  0 1 2");
       for (int i = 0; i < 3; ++i) {
           System.out.println(i + " " + board[i][0] + " " + board[i][1] + " " + board[i][2]+ " ");
       }
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col].equals("-");
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       String player;
       if (turn % 2 == 0) {
           player = "X";
       }
       else {
           player = "O";
       }
       turn++;
       spaces--;
       board[row][col] = player;
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       for (int i = 0; i < 3; ++i) {
           if (!board[i][0].equals("-") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for (int j = 0; j < 3; ++j) {
           if (!board[0][j].equals("-") && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
       return !board[1][1].equals("-") && ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) || (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])));
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       return checkRow() || checkCol() || checkDiag();
   }

}

import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.printBoard();
        
        while (game.getSpaces() > 0) {
            System.out.println("It is Player " + (game.getTurn() % 2 + 1) + "'s turn:");
            System.out.print("Please enter the row: ");
            int row = input.nextInt();
            System.out.print("Please enter the column: ");
            int col = input.nextInt();
            System.out.println();
            
            while (!game.pickLocation(row, col)) {
                System.out.println("Sorry, that is not a valid space");
                System.out.print("Please enter the row: ");
                row = input.nextInt();
                System.out.print("Please enter the column: ");
                col = input.nextInt();
                System.out.println();
            }
            
            game.takeTurn(row, col);
            game.printBoard();
            
            if (game.checkWin()) {
                System.out.println("Congrats! Player " + (game.getTurn() % 2) + " has won!");
                return;
            }
        }
        System.out.println("It's a tie!");
    }
}