/*Movies always come with ratings. A bad movie may have 1.4 stars, and a great movie may have 4.9 stars.

Your job is to write a program that asks the user for a movie rating as a double, and then rounds to the nearest int using the rounding with casting technique. */

import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter movie rating (as a decimal)");
        double rating = input.nextDouble();
        rating += 0.5;
        int ans = (int) rating;
        System.out.println("Rating rounded: " + ans);
    }
}