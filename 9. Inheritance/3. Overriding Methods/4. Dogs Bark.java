/* Not all dogs like to bark, but some like to make a lot of noise! In this exercise we have a Dog superclass and a LoudDog subclass. You do not need to modify the Dog class.

Your task is to write two override methods in the LoudDog class. You will override the speak method to return BARK!. 
You will then override the toString so that it returns Clover is loud and likes to BARK! where Clover is replaced by the name variable.

Create and print at least one Dog and one LoudDog to test. */

public class Dog
{
    private String name;
    
     public Dog(String name){
       this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   public String speak(){
       return "Bark!";
   }
   
   public String toString(){
       return name + " likes to " + speak();
   }
}

public class LoudDog extends Dog
{
   
   public LoudDog(String name){
       super(name);
   }
   
   // Override the speak method here
   public String speak(){
       return "BARK!";
   }
   
   //Override the toString here.
   //Remember, you can access the name using super.getName()
   public String toString(){
       return super.getName() + " is loud and likes to " + speak();
   }
}

public class DogTester
{
    public static void main(String[] args)
    {
        // Start here
        Dog d1 = new Dog("Cupcake");
        LoudDog d2 = new LoudDog("Clover");
        
        System.out.println(d1);
        System.out.println(d2);
    }
}