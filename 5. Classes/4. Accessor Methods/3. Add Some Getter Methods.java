/* The Comment class was created to save social media comments.
Currently, the class has a constructor and a toString method.

Continue adding to this class by adding three accessor methods:

public String getPoster()
public String getText()
public String getDate() */

public class Comment
{
    private String poster;
    private String text;
    private String date;
    
    public Comment(String personPosting, String message, String textDate)
    {
        poster = personPosting;
        text = message;
        date = textDate;
    }
    
    public String getPoster() {
        return poster;
    }
    
    public String getText() {
        return text;
    }
    
    public String getDate() {
        return date;
    }
    
    public String toString()
    {
        return text + "\n--" + poster + "(" + date + ")";
    }
}

public class Messages
{
    public static void main(String[] args)
    {
        // Your code here.
        // Create two Comment objects and print them out.
        // Then use the accessor methods to print out the instance variables
        Comment c1 = new Comment("Jeff", "Hi", "12/03/2025");
        Comment c2 = new Comment("Bob", "Wassup", "12/04/2025");
        
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println(c1.getPoster());
    }
}