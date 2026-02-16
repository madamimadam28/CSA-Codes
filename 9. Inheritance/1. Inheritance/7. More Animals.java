/* For this exercise, you are going to create a part of an Animal hierarchy. Unlike some of our examples and the previous exercises, 
this exercise is going to have 3 levels in the hierarchy.

At the top is the Animal class. Below that, we are going to have a subclass for Pet. Under this subclass, we are going to have 2 further subclasses, Dog and Fish.

You will need to create your class hierarchy and add instance variables, getters, and setter methods to accommodate the following information:

I need to save what type of animal I have (String variable)
I want to be able to save a name for my fish and dog (String variable)
I want to know which fish need salt water v. fresh water (String variable)
I want to know if my dog has been trained (boolean variable)
I want to know the size of my dog and fish (String variable)
None of your classes should have constructors. Instead, create setter and getter methods to set the value of the instance variables that you create.

Make sure you use common sense names for your variables! */

public class Animal
{
    private String type;
   
    public String getType() {
        return type;
    }
    
    public void setType(String x) {
        type = x;
    }
}

public class Dog extends Pet
{
    private boolean trained;
    
    public boolean getTrained() {
        return trained;
    }
    
    public void setTrained(boolean x) {
        trained = x;
    }
}

public class Fish extends Pet
{
    private String water;
    
    public String getWater() {
        return water;
    }
    
    public void setWater(String x) {
        water = x;
    }
}

public class Pet extends Animal
{
    private String name;
    private String size;
   
    public String getName() {
        return name;
    }
    
    public void setName(String x) {
        name = x;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String x) {
        size = x;
    }
}