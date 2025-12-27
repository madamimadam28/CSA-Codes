/*Currently, Hicham El Guerrouj of Morroco holds the record for running the fastest mile. He ran the mile in 3 minutes 43 seconds, which is 223 seconds.

Write a program that asks the user how fast they can run a mile (in seconds).

Use an if-else to determine if the number is less than the fastest recorded mile time.

If the user’s time is faster than 223 seconds, print “Are you sure? That’s a new world record!”
Otherwise, print, “Right on! Keep running!” */

import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start by making comments to outline the logic of your program
        Scanner input = new Scanner(System.in);
        System.out.println("What is your mile time?");
        int time = input.nextInt();
        System.out.println(time < 223 ? "Are you sure? That's a new world record!" : "Right on! Keep running!");
    }
}