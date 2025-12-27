/*Let’s look at the Rater class again.

The Rater class represents a rating system for a company. The company is rated on a scale of 1 - 5. This time, there is an additional instance variable – review. This variable is set based on the company’s current rating.

The updateReview method updates review. If the company is rated 3 or more, the company’s review would say
“Proudly recommended”.
Otherwise, the review will say,
“Needs more ratings”

The toString method returns the name of the company followed by its review. For example, it might say Tina's Tires : Proudly recommended. Update the toString method to match that format.

The last method you need to fill in is setRating. The rating should only be changed if the new rating is 5 or less. This is the same as the last time you saw this class.

Main
In main, create a Rater object. Set its rating to something less than 3. Call updateReview, then print out the object.
Use setRating to set the rating to something between 3 and 5. Call updateReview again, then print out the object.

This will let you test both branches of your if-else statement! */

public class Rater
{
    private String name; // name of company
    private double rating; // number rating (1 - 5)
    private String review; // review shown with company name 
    
    
    public Rater(String company, double initialRating)
    {
        name = company;
        rating = initialRating;
        review = "";
        
    }
    
    // Set rating to newRating
    // As long as it's no more than 5
    public void setRating(double newRating)
    {
        if (newRating <= 5) rating = newRating;
    }
    
    // Updates review line based on rating
    public void updateReview()
    {
        review = rating < 3 ? "Needs more ratings": "Proudly recommended";
    }
    
    
    // Returns the rating of the company
    public double getRating()
    {
        return rating;
    }
    
    // Returns a string representation of the company
    // Uses the form
    // name: review
    public String toString()
    {
        return name + " : " + review;
    }
}

public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater r = new Rater("Cool Company", 2);
        r.updateReview();
        System.out.println(r);
        r.setRating(5);
        r.updateReview();
        System.out.println(r);
    }
}