/* Complete the toString method in the Animal Class. Remember that the format for a toString method is:

public String toString()
The toString method should be formatted so that the following code

Animal riverOtter = new Animal("North American River Otter", "rivers", "fish", 9);
System.out.println(riverOtter);
Prints out

North American River Otter lives in rivers, eats fish and usually lives 9 years. */

public class Animal
{
    private String commonName;
    private String habitat;
    private String diet;
    private int typicalAge;
    
    
    public Animal(String name, String animalHabitat, String animalDiet, int age)
    {
        commonName = name;
        habitat = animalHabitat;
        diet = animalDiet;
        typicalAge = age;
    }
    
    public String toString() {
        return commonName + " lives in " + habitat + ", eats " + diet 
               + " and usually lives " + typicalAge + " years.";
    }
}

public class AnimalTester
{
    public static void main(String[] args)
    {
       Animal riverOtter = new Animal("North American River Otter", "rivers", "fish", 9);
       System.out.println(riverOtter);
    }
}