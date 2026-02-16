/* For this exercise, you will complete the TicTacToe Board that we started in the 2D Arrays Lesson.

We will add a couple of methods to the TicTacToe class.

To track whose turn it is, we will use a counter turn. This is already declared as a private instance variable.

Create a getTurn method that returns the value of turn.

Other methods to implement:

printBoard()- This method should print the TicTacToe array onto the console. 
The board should include numbers that can help the user figure out which row and which column they are viewing at any given time. Sample output for this would be:

  0 1 2
0 - - - 
1 - - - 
2 - - - 
Java
pickLocation(int row, int col)- This method returns a boolean value that determines if the spot a user picks to put their piece is valid. 
A valid space is one where the row and column are within the size of the board, and there are no X or O values currently present.
takeTurn(int row, int col)- This method adds an X or O to the array at position row,col depending on whose turn it is. 
If it’s an even turn, X should be added to the array, if it’s odd, O should be added. It also adds one to the value of turn.
checkWin()- This method returns a boolean that determines if a user has won the game. This method uses three methods to make that check:

checkCol- This checks if a player has three X or O values in a single column, and returns true if that’s the case.
checkRow - This checks if a player has three X or O values in a single row.
checkDiag - This checks if a player has three X or O values diagonally.
checkWin() only returns true if one of these three checks is true. */

public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   
   private String[][] board = new String[3][3];
    public TicTacToe() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                board[i][j] = "-";
            }
        }
    }
    
    public String[][] getBoard() {
        return board;
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
       return board[row][col].equals("-") && row >= 0 && row < 3 && col >= 0 && col < 3;
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
       if (pickLocation(row, col)) {
           board[row][col] = player;
       }
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
       return !board[0][0].equals("-") && ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) || (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])));
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       return checkRow() || checkCol() || checkDiag();
   }

}

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        //This is to help you test your methods. Feel free to add code at the end to check
        //to see if your checkWin method works!
        TicTacToe game = new TicTacToe();
        System.out.println("Initial Game Board:");
        game.printBoard();
        
        //Prints the first row of turns taken
        for(int row = 0; row < 3; row++)
        {
            if(game.pickLocation(0, row))
            {
                game.takeTurn(0, row);
            }
        }
        System.out.println("\nAfter three turns:");
        game.printBoard();
        
        
    
    }
}