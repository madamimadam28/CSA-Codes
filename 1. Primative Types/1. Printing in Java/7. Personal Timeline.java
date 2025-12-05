/*Write a program that outputs your timeline.
On the left side of the output should be your age. This should be output in two year increments every four lines.
To the right of the age should be a vertical line (|) that runs all the way down your output.
Your age should be left aligned leaving at least one space between the age and the vertical line.
The first age you output should be the age you were when the first event occurred.
To the right of the vertical line, separated from it by a space should be the month and year that each event took place (e.g. 4/01).
To the right of the date for each event should be a brief description of the event, a few words long. */

public class Timeline
{
    public static void main(String[] args)
    {
        // Start here!
        System.out.println("Age     | M/YY - Description");
        System.out.println("9       |  7/23 - Went to Four Corners of the USA");
        System.out.println("        |  ");
        System.out.println("        |  9/3 -  Started EAP schooling at Bear Creek");
        System.out.println("        |  ");
        System.out.println("11      |  7/11 - Started middle school");
        System.out.println("        |  ");
        System.out.println("        |  ");
        System.out.println("        |  ");
        System.out.println("13      |  ");
        System.out.println("        |  6/23 - Go back to China");
        System.out.println("        |  9/3 - Started 8th grade");
        System.out.println("        |  2/14 - Hosted first hackathon");
    }
}