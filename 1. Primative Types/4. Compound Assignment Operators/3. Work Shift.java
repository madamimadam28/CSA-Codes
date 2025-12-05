/*A doctor works 20 hours, 42 minutes, and 16 seconds in one shift at a hospital. Convert the total shift time into seconds and display that information. */

public class WorkShift
{
    public static void main(String[] args)
    {
        // Start here
        int hoursToSeconds = 20;
        int minutesToSeconds = 42;
        int seconds = 16;
        hoursToSeconds *= 60;
        hoursToSeconds *= 60;
        minutesToSeconds *= 60;
        int ans = hoursToSeconds + minutesToSeconds + seconds;
        System.out.println(ans);
    }
}