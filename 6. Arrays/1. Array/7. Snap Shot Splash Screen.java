/* A splash screen is a quick, simple graphic or text that usually appears while a game or program is launching.

You need to make a splash screen for your Snap Shot app and a separate pop up to upgrade to your premium app.

Create one array that contains the Strings for the Welcome splash screen and print it out.

Then, without modifying the original array declaration or creating a new array, change the first and last elements by resetting the values of the original array.

Your output should look as follows:

Welcome
to
the snap shot
app!

Upgrade
to
the snap shot
premium app! */

public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] statements = {"Welcome", "to", "the snap shot", "app!"};
        
        for (String s : statements) {
            System.out.println(s);
        }
        
        System.out.println();
        
        statements[0] = "Upgrade";
        statements[3] = "premium app!";
        
        for (String s : statements) {
            System.out.println(s);
        }
    }
}