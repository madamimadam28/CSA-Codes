/* Create a score program that prints out an array called scores:

int[] scores = {80, 95, 82, 67, 100};
After printing the first time, update the 3rd and last scores to 72 and 95, respectively. Reset them in the code without changing the original array declaration and then print the new set of scores.

Your output should look as follows (be sure to include a blank line between the two sets of results):

80
95
82
67
100

80
95
72
67
95 */

public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        int[] scores = {80, 95, 82, 67, 100};
        for (int i : scores) {
            System.out.println(i);
        }
        System.out.println();
        
        scores[2] = 72;
        scores[4] = 95;
        
        for (int i : scores) {
            System.out.println(i);
        }
    }
}