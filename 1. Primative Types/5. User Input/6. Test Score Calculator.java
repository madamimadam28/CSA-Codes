/*In this activity, you are going to prompt the user for three test name and three score (test name then score, repeated three times).

After gathering the three scores, calculate an average and print the results.
*/

import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        double scores = 0.0;

        System.out.print("Please enter the first test name: ");
        String name = input.nextLine();
        System.out.print("Please enter the first test score: ");
        double score = input.nextDouble();
        scores += score;
        input.nextLine();

        System.out.print("Please enter the second test name: ");
        name = input.nextLine();
        System.out.print("Please enter the second test score: ");
        score = input.nextDouble();
        scores += score;
        input.nextLine();

        System.out.print("Please enter the third test name: ");
        name = input.nextLine();
        System.out.print("Please enter the third test score: ");
        score = input.nextDouble();
        scores += score;
        input.nextLine();
        
        System.out.print("Your average score is: " + (scores / 3.0));
    }
}