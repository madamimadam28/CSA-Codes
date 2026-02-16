public class Animal
{
    public void talk() {
         System.out.println("I don't know what to say!");
    }
}

public class Cow extends Animal
{
    @Override
    public void talk()
    {
        System.out.println("Moo");
    }
}

public class Dog extends Animal
{
    @Override
    public void talk()
    {
        System.out.println("Bark");
    }
}

public class Pig extends Animal
{
    @Override
    public void talk()
    {
        System.out.println("Oink");
    }
}

public class AnimalTester
{
    public static void main(String[] args)
    {
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal pig = new Pig();
        
        /**
         * We can now create an animal array and add
         * any object that has been declared as an
         * animal, regardless of how it is instantiated.
         */
         
        Animal[] animals = {dog, cow, pig};
        
        for (Animal animal : animals){
            animal.talk();
        }
    }
}