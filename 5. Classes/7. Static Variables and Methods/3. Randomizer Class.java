/* In this exercise, we are going to create a static class Randomizer that will allow users to get random integer values from the method nextInt() and nextInt(int min, int max).

Remember that we can get random integers using the formula int randInteger = (int)(Math.random() * (range + 1) + startingNum).

nextInt() should return a random value from 1 - 10, and nextInt(int min, int max) should return a random value from min to max. For instance, if min is 3 and max is 12, then the range of numbers should be from 3 - 12, including 3 and 12. */

public class Randomizer
{
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        return (int)(Math.random() * (9 + 1) + 1);
    }
    
    public static int nextInt(int min, int max)
    {
        //Implement this method to return a random integer between min and max
        return (int)(Math.random() * (max - min + 2) + min);
    }
}

public class RandomizerTester
{
    public static void main(String[] args)
    {
    
        System.out.println("Results of Randomizer.nextInt()");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Randomizer.nextInt());
        }
       
        //Initialize min and max for Randomizer.nextInt(min,max)
        int min = 5;
        int max = 10;
        System.out.println("\nResults of Randomizer.nextInt(5,10)");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Randomizer.nextInt(min ,max));
        }
        
    }
}