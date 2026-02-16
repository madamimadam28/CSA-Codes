/* In this exercise, you will create a Top 10 Musicians of all time list.

A Musician class has been built that takes the name, number of albums sold, and number of weeks that artist has been on the Top40 list. 
The Musician class also has a boolean instance variable isPlatinum that determines if the musician has gone platinum, meaning they’ve sold over a million copies of the same record.

The Billboard class currently has a top10 ArrayList that will store the top 10 musicians as a list.

In the Billboard class, 
create a void method add(Musician artist) method that will add a musician to the list if there are less than 10 musicians in the list, and if the musician has Platinum status. 
If there are 10 musicians in the list, then the method should call the void method replace(Musician artist) (that you will create). 
If the artist is not Platinum, display the following message:

Sorry, [artist name] does not qualify for Top 10
where artist name is replaced with the artist’s actual name.

The replace method compares the total number of weeks that the musician has been on the top40 list. 
If the musician with the lowest number of weeks on the top40 is lower than the number of weeks on the top40 of the new musician, then the old musician is replaced by the new one. 
f the musician is replaced, there should be a message to the user using this format:

The musician Pink Floyd has been replaced by Tracy the Turtle.
Otherwise, the user should be notified that the new musician cannot be added because they don’t have enough weeks on the top40. For example:

Sorry, Alex Eacker has less weeks in the Top 40 than the other musicians.
This method should be created in the Billboard class.

Use the BillboardTester class to test if the new musicians being added are being correctly replaced, or omitted from the Top 10. */

public class Musician
{
    private String name;
    private int weeksInTop40;
    private int albumsSold;
    private boolean isPlatinum;;
    
    public Musician(String name, int weeksInTop40, int albumsSold)
    {
        this.name = name;
        this.weeksInTop40 = weeksInTop40;
        this.albumsSold = albumsSold;
        setPlatinum(albumsSold);
    }
    
    public void setPlatinum(int albumsSold)
    {
        if(albumsSold >= 1000000)
        {
            isPlatinum = true;
        }
        else
        {
            isPlatinum = false;
        }
    }
    
    public int getWeeksInTop40()
    {
        return this.weeksInTop40;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public boolean getIsPlatinum()
    {
        return isPlatinum;
    }
    
    public String toString()
    {
        return this.name;
    }
}

import java.util.ArrayList;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();
 
    public void add(Musician artist) {
        if (artist.getIsPlatinum()) {
            if (top10.size() < 10) {
                top10.add(artist);
            }
            else {
                replace(artist);
            }
        }
        else {
            System.out.println("Sorry, " + artist.getName() + " does not qualify for Top 10");
        }
    }
 
    public void replace(Musician artist) {
        int minidx = 0;
        int mini = top10.get(0).getWeeksInTop40();
        for (int i = 1; i < top10.size(); ++i) {
            if (top10.get(i).getWeeksInTop40() < mini) {
                minidx = i;
                mini = top10.get(i).getWeeksInTop40();
            }
        }
        if (artist.getWeeksInTop40() > mini) {
            System.out.println("The musician " + top10.get(minidx).getName() + " has been replaced by " + artist.getName() + ".");
            top10.set(minidx, artist);
        }
        else {
            System.out.println("Sorry, " + artist.getName() + " has less weeks in the Top 40 than the other musicians.");
        }
    }
 
 
    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}

public class BillboardTester
{
    public static void main(String[] args)
    {
        Billboard top10 = new Billboard();
        top10.add(new Musician("Beyonce", 316, 100000000));
        top10.add(new Musician("The Beatles", 365, 600000000));
        top10.add(new Musician("Drake", 425, 150000000));
        top10.add(new Musician("Pink Floyd", 34, 250000000));
        top10.add(new Musician("Mariah Carey", 287, 200000000));
        top10.add(new Musician("Rihanna", 688, 250000000));
        top10.add(new Musician("Queen", 327, 170000000));
        top10.add(new Musician("Ed Sheeran", 536, 150000000));
        top10.add(new Musician("Katy Perry", 317, 143000000));
        top10.add(new Musician("Justin Bieber", 398, 140000000));

        //This musician should not be added to the top10 because they don't have enough records sold        
        top10.add(new Musician("Karel the Dog", 332, 60));
        
        //This musician should replace the artist with the least Weeks on the top 40 charts.
        top10.add(new Musician("Tracy the Turtle", 332, 150000000));
        
        //This musician should not replace an artist, but is a Platinum artist
        top10.add(new Musician("Alex Eacker", 100, 23400000));
        
        top10.printTop10();


    } 
}