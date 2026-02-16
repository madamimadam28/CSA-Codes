/* For this exercise, you are going to create a Food superclass with a HealthyFood subclass. The HealthyFood will also have a Fruit subclass. 
After creating these classes, test the results in the FoodTester class.

The Food class will have two instance variables, one to store the name and one to store the calories.

Food should have two accessor (getter methods) as well:

public String getName()
public int getCalories()
The HealthyFood class will only have two instance variables, group and color, which represents the food group and the color of the food, respectively. 
It should have the following accessors (getter method):

public String getGroup()
public String getColor()
The Fruit class will have two instance variables, a boolean indicator if the fruit is in season and the vitamins the fruit has. The accessor methods should be:

public boolean isInSeason()
public String getVitamins()
Constructors should follow this format:

public Food (String foodName, int calories)
public HealthyFood(String foodName, int calories, String foodGroup, String foodColor)
public Fruit(String foodName, int calories, String foodColor, boolean isInSeason, String majorVitamins)
Finally, the Food class should have a toString that prints:
name has cal calories

For example:
Ice Cream has 200 calories */

public class Food
{
    private String name;
    private int cal;
    
    public Food (String foodName, int calories) {
        name = foodName;
        cal = calories;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCalories() {
        return cal;
    }
    
    public String toString() {
        return name + " has " + cal + " calories";
    }
}

public class HealthyFood extends Food
{
    private String group;
    private String color;
    
    public HealthyFood(String foodName, int calories, String foodGroup, String foodColor) {
        super(foodName, calories);
        group = foodGroup;
        color = foodColor;
    }
    
    public String getGroup() {
        return group;
    }
    
    public String getColor() {
        return color;
    }
}

public class Fruit extends HealthyFood
{
    private boolean inSeason;
    private String vitamins;
    
    public Fruit(String foodName, int calories, String foodColor, boolean isInSeason, String majorVitamins) {
        super(foodName, calories, "Fruit", foodColor);
        inSeason = isInSeason;
        vitamins = majorVitamins;
    }
    
    public boolean isInSeason() {
        return inSeason;
    }
    
    public String getVitamins() {
        return vitamins;
    }
}

public class FoodTester
{
    public static void main(String[] args)
    {
        // Test each of your classes
        Food f1 = new Food("Apple", 200);
        HealthyFood f2 = new HealthyFood("Blueberry", 100, "Berry", "Blue");
        Fruit f3 = new Fruit("Orange", 200, "Orange", true, "Vitamin C");
        
        // Make an object of each type
        // Use the getters to verify the fields are set correctly
        System.out.println(f1.getName());
        System.out.println(f2.getColor());
        System.out.println(f2.getGroup());
        System.out.println(f3.getVitamins());
        System.out.println(f1);
        System.out.println(f3.isInSeason());
    }
}