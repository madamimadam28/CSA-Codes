/*The Rater class represents a rating system for a company. The company is rated on a scale of 1 - 5.

The toString representation changes based on how well rated the company is. Suppose we have a company called “Tina’s Tires”.

If its rating is less than two, toString would return “Not Recommended Company Tina’s Tires”
If its rating is over 3.5, toString would return “Gold Star Company Tina’s Tires”
Otherwise, toString would return “Well Rated Company Tina’s Tires”
Remember, once a return statement is executed, the rest of the method is skipped. Therefore, if you return a String in an if statement, the remaining if statements will not be tested.

The other method you need to fill in is setRating. The rating should only be changed if the new rating is 5 or less.

After you fill in Rating, main should produce the following output. Note that main runs several test cases to check all of the conditions of the program! We need to make sure to test every line of code!

Current Rating: 2.0
Well Rated Company Jr Cookery

Current Rating: 4.5
Gold Star Company Jr Cookery

Current Rating: 4.5
Gold Star Company Jr Cookery

Current Rating: 1.0
Not Recommended Company Jr Cookery */

public class Rater
{
    private String name; // name of company
    private double rating; // number rating (1 - 5)
    
    
    public Rater(String company, double initialRating)
    {
        name = company;
        rating = initialRating;
    }
    
    // Set rating to newRating as long as
    // the new rating is no more than 5
    public void setRating(double newRating)
    {
        if (newRating <= 5) {
            rating = newRating;
        }
    }
    
    // Returns the rating of the company
    public double getRating()
    {
        return rating;
    }
    
    // Returns a string representation of the company
    // based on their ratings
    public String toString()
    {
        // remember, once a return statement is
        // executed, the program LEAVES the method.
        // Nothing after the executed return statement is executed.
        return (rating > 3.5) ? "Gold Star Company " + name : (rating < 2) ? "Not Recommended Company " + name : "Well Rated Company " + name;
    }
}