/*Loose Change
The Coins class was created to hold all your loose change, kind of like a piggy bank! For this exercise, you are going to simulate starting a bank with a specific number of coins, then adding to your piggy bank to bring your total to $1.67. (The actual value may be slightly off due to the double rounding issue, but the difference should be much less than one cent.)

What you need to do:
Create a Coins object that initially has 3 quarters, 2 dimes, 1 nickels, and 4 pennies.
After you create the initial object, print out the total, then add coins to your bank until you have a total of 16 coins totaling 1.67.
You will need to figure out which combination gets you to the correct total with the correct number of coins!
When you are finished, call the method to print the bank count then the bank total to verify that you got the correct values. */

public class Coins {

    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public Coins(int numQuarters, int numDimes, int numNickels, int numPennies){
        quarters = numQuarters;
        dimes = numDimes;
        nickels = numNickels;
        pennies = numPennies;
    }

    public void addQuarter(){
        System.out.println("Adding a quarter ...");
        quarters ++;
    }

    public void addDime(){
        System.out.println("Adding a dime ...");
        dimes ++;
    }

    public void addNickel(){
        System.out.println("Adding a nickel ...");
        nickels ++;
    }

    public void addPenny(){
        System.out.println("Adding a penny ...");
        pennies ++;
    }

    public void quartersCount(){
        System.out.println(quarters);
    }

    public void quartersTotal(){
        System.out.println(quarters * 0.25);
    }

    public void dimesCount(){
        System.out.println(dimes);
    }

    public void dimesTotal(){
        System.out.println(dimes * 0.10);
    }

    public void nickelsCount(){
        System.out.println(nickels);
    }

    public void nickelsTotal(){
        System.out.println(nickels * 0.05);
    }

    public void penniesCount(){
        System.out.println(pennies);
    }

    public void penniesTotal(){
        System.out.println(pennies * 0.01);
    }

    public void bankValue(){
        System.out.println(quarters * 0.25 + dimes * 0.10
                + nickels * 0.05 + pennies * 0.01);
    }

    public void bankCount(){
        System.out.println(quarters + dimes + nickels + pennies);
    }
}

public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       Coins coins = new Coins(3, 2, 1, 4);
       coins.bankValue();
       coins.addQuarter();
       coins.addQuarter();
       coins.addDime();
       coins.addPenny();
       coins.addPenny();
       coins.addPenny();
       coins.bankCount();
       coins.bankValue();
    }
}