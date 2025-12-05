/*Use g as a final variable to solve the following problems in Java.

You’re standing at the edge of a cliff and drop a ball. It takes 23 sec to hit the ground. How high up are you? In other words, what’s the height of the cliff?

What is the velocity of the ball when it hits the ground?

Print the height and then the velocity. Format your answers so that the numbers have units and meaning in a sentence. */

public class FallingBodies
{
    public static void main(String[] args)
    {
        // Start here!
        double g = 9.8, t = 23.0;
        double h = 0.5 * g * t * t;
        double v = g * t;
        System.out.println("The height of the cliff is " + h + " m.");
        System.out.println("The final velocity of the ball is " + v + " m/s.");
    }
}