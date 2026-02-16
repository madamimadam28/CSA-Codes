public class Person {
    
	private String name;
	private String birthday;

    public Person (String name, String birthday)
    {
    	this.name = name;
    	this.birthday = birthday;
    }

    public String getName()
    {
    	return name;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    /**
     * Since the object class has a toString, the Person
     * class toString is technically an Override
     */
     
    @Override
    public String toString()
    {
        return "Name: " + name + "\nBirthday: " + birthday;
    }
}

public class PersonTester
{
    public static void main(String[] args)
    {
        Person mikiah = new Person("Mikiah", "04/13/1998");
        
        //The toString override will provide a better output. 
        System.out.println(mikiah);
    }
}