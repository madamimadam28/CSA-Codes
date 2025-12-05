/* A t-shirt costs $22. You can personalize the t-shirt for $1 extra.

Using only one variable called cost and the increment and decrement operators, print the cost of the t-shirt, the cost of a personalized t-shirt, and then the original cost of the t-shirt. */

public class Tshirt
{
    public static void main(String[] args)
    {
        // Start here!
        int cost = 22;
        System.out.println("The t-shirt costs " + cost);
        cost++;
        System.out.println("A personalized t-shirt costs " + cost);
        cost--;
        System.out.println("Without personalization, the t-shirt costs " + cost);
    }
}