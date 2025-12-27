/* In this program, you need to make an upside-down tree that contains stars *. After all, in computer science, trees have the root at the top and leaves at the bottom!

Your output should look like:

* * * * * * * * * 
 * * * * * * * * 
  * * * * * * * 
   * * * * * * 
    * * * * * 
     * * * * 
      * * * 
       * * 
        * 
Modify the makeATree method in the starter code to create this! */

public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        // Your code goes here!!!
        for (int i = 8; i >= 0; --i) {
            for (int k = 8; k >= i + 1; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; --j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}