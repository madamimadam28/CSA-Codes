/* You have been hired by your favorite restaurant to create a food nutrition app for their customers to use.  Before you get too far, the owner wants you to create a quick prototype.

Your app should output a food name and the number of calories, then ask the customer how many they want. You need to ask them for 3 menu items. Once they tell you the quantity for the three menu items, you will output the meal’s total calories.

Behind the scenes, you are going to create a Food class. Your Food class should use name and calories in the constructor (in that order!). You should create getters and setters for these variables. You also need a toString method that will be used in the line before you ask for the quantity.

In addition to the Food class, you will have a FoodRunner class where you will have your main method. In here, you will create your three foods and ask for the quantities. After that, you can use the quantities to calculate and output the total.

Sample output:
Hamburgers have 600 calories.
How many would you like?
2

French Fries have 350 calories.
How many would you like?
1

Coke have 200 calories.
How many would you like?
2

Your meal will have a total of 1950 calories */

public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        
        //Create Food Constructor
        public Food(String theName, int theCals) {
            name = theName;
            calories = theCals;
        }
        
        //Add getter and setter methods for calories
        public int getCalories() {
            return calories;
        }
        
        public void setCalories(int x) {
            calories = x;
        }
        
        //Add getter and setter methods for name
        public String getName() {
            return name;
        }
        
        public void setName(String x) {
            name = x;
        }
        
        //Add toString method
        public String toString() {
            return name + " have " + calories + " calories.";
        }
}

import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        
        Food hamburgers = new Food("Hamburgers", 600);
        System.out.println(hamburgers);
        System.out.println("How many would you like?");
        int numH = input.nextInt();
        System.out.println();
        
        Food frenchFries = new Food("French Fries", 350);
        System.out.println(frenchFries);
        System.out.println("How many would you like?");
        int numF = input.nextInt();
        System.out.println();
        
        Food coke = new Food("Coke", 200);
        System.out.println(coke);
        System.out.println("How many would you like?");
        int numC = input.nextInt();
        System.out.println();
        
        int total = hamburgers.getCalories() * numH + frenchFries.getCalories() * numF + coke.getCalories() * numC;
        
        System.out.println("Your meal will have a total of " + total + " calories");
    }
}