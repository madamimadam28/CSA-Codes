public class Animal {

    private String type;
    private String sound;
    
    public Animal (String type, String sound) {
        this.type = type;
        this.sound = sound;
    }
    
    public void speak(int number){
        for (int i = 0; i < number; i++)
        {
            System.out.println(sound);
        }
    }
}

public class Dog extends Animal {

    public Dog () {
        super("Dog", "Bark");
    }

    /**
     * We create a custom method in the dog
     * class that calls the speak method in the 
     * superclass.
     */
     
    public void bark(int number)
    {
        super.speak(number);
    }
}

public class AnimalTester
{
    public static void main(String[] args)
    {
        
        // Dog class extends the Animal class
        Dog karel = new Dog();
        
        // We can create a custom speak method for the Dog
        karel.bark(5);
    }
}