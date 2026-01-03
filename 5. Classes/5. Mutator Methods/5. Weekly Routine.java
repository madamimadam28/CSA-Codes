/* In this exercise, you will write a class that represents how you spend your time.

The class should have four double instance variables

school
sleep
friends
hobbies
These variables will track the number of hours you spend doing each of these activities in a single day.

The class should have mutators (setters) and accessors (getters) for each instance variable.

It should also have a method called printTotal that should print the total number of hours per week you spend doing each of these activities.

Note you will have to calculate the weekly hours by using the daily hours stored in the instance variables. It should also print the total number of hours in the week that you are busy.

Here is an example of the output of printTotal if sleep = 8, school = 8, friends = 2.5, and hobbies = 2.

How You Spend Your Week
At School: 56.0
Sleeping: 56.0
With Friends: 17.5
Doing fun stuff: 14.0
You're busy 143.5 hours a week! */

public class Routine
{
    private double school;
    private double sleep;
    private double friends;
    private double hobbies;
    
    public double getSchool() {
        return school;
    }
    
    public double getSleep() {
        return sleep;
    }
    
    public double getFriends() {
        return friends;
    }
    
    public double getHobbies() {
        return hobbies;
    }
    
    public void setSchool (double x) {
        school = x;
    }
    
    public void setSleep (double x) {
        sleep = x;
    }
    
    public void setFriends (double x) {
        friends = x;
    }
    
    public void setHobbies (double x) {
        hobbies = x;
    }
    
    public void printTotal() {
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + school * 7);
        System.out.println("Sleeping: " + sleep * 7);
        System.out.println("With Friends: " + friends * 7);
        System.out.println("Doing fun stuff: " + hobbies * 7);
        System.out.println("You're busy " + (school + sleep + friends + hobbies) * 7 + " hours a week!");
    }
}

public class RoutineTester
{
    public static void main(String[] args) 
    {
        Routine myWeek = new Routine();
        
        myWeek.setSchool(8);
        myWeek.setHobbies(2);
        myWeek.setFriends(2.5);
        myWeek.setSleep(8);
        
        // Prints the totals for the WHOLE WEEK
        myWeek.printTotal();
    }
}