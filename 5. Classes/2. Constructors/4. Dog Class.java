public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here
    public Dog (String dog, String type, boolean vacc) {
        name = dog;
        breed = type;
        hasShots = vacc;
    } 
    public Dog (String dog, String type) {
        name = dog;
        breed = type;
        hasShots = false;
    } 

    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }
        
        return output;
    }
}

public class DogTester
{
    public static void main(String[] args)
    {
        // Start here!
        Dog karel = new Dog("Karel", "Retriever", true);
        Dog clover = new Dog("Clover", "Corgi");
        
        System.out.println(karel);
        System.out.println(clover);
    }
}