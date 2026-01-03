/* Current Grade: 5.0 out of 5 Status: Finalized
In this exercise, we will create two distinct classes, a Meal and a Chef.

A Meal consists of three attributes - a name, what course the meal falls under, and the number of servings in the meal. The Meal class should include the following methods in addition to the constructor:
getName
getCourse
getNumberOfServings
toString

The toString for the meal Meal toast = new Meal("Toast", "Breakfast", 1); would return:

Toast (Breakfast)
The Chef class also has three instance variables - the chef’s name, the name of the restaurant they work at, and their best meal. Their best meal should be a Meal object.

The Chef class should have the following methods that return information from the Chef and/or Meal classes.:
getName
getRestaurant
getMealName
getMealServings
getMealCourse

The Chef class should also have a toString that when printed returns the name of the chef, the restaurant they work at, and the meal that they are best known for:

Chef Karel works at Chuck E Cheese and is best known for Toast (Breakfast)
There is a Meal and Chef already prepared for you in the ChefTester class. Add another meal and chef and print them to the console. Be sure to test all of your accessor methods, too! */

public class Chef
{
    private String name;
    private String restaurant;
    private Meal meal;
    
    public Chef(String cName, String cRestaurant, Meal cMeal) {
        name = cName;
        restaurant = cRestaurant;
        meal = new Meal(cMeal.getName(), cMeal.getCourse(), cMeal.getServings());
    }
    
    public String getName() {
        return name;
    }
    
    public String getRestaurant() {
        return restaurant;
    }

    public String getMealName() {
        return meal.getName();
    }
    
    public String getMealCourse() {
        return meal.getCourse();
    }
    
    public int getMealServings() {
        return meal.getServings();
    }
    
    public String toString()
    {
        return "Chef " + name + " works at " + restaurant + " and is best known for " + meal;
    }
}

public class Meal
{
    private String name;
    private String course;
    private int servings;
    
    public Meal(String mName, String mCourse, int mServings) {
        name = mName;
        course = mCourse;
        servings = mServings;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCourse() {
        return course;
    }
    
    public int getServings() {
        return servings;
    }
    
    public String toString()
    {
        return name + " (" + course + ")";
    }
}

public class ChefTester
{
    public static void main(String[] args)
    {
        // Don't modify this part!
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);
        
        System.out.println(alex);
        System.out.println(alex.getMealName());
        
        // Create your own Meal and Chef here:
    }
}