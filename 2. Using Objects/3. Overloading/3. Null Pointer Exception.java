public class Person
{
    private String name;
    private int age;
    
    // Constructor
    public Person(String theName, int theAge)
    {
        name = theName;
        age = theAge;
    }
    
    
    // Returns a representation of this person
    public String toString()
    {
        return name;
    }
}

public class NullPointerExample 
{
    
    public static void main(String[] args)
    {
    
        // Declare our variables
        Person realPerson;
        Person ghost;
    
        // Initialize realPerson
        realPerson = new Person("Mike", 45);
        System.out.println(realPerson);
        
        // Initialize to a new Person, get a new memory address
        realPerson = new Person("Michael", 45);
        System.out.println(realPerson);
        
        // ghost is never initialized, so there is no
        // memory address to point to.
        // Instead, the value held in the variable is null
        ghost = new Person("James", 45);
        System.out.println(ghost);
        
    }
}