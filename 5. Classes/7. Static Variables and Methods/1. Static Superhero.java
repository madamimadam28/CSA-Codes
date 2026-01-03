public class Power
{
	private String name;
	private int strength;

	public Power(String theName, int theStrength)
	{
		name = theName;
		strength = theStrength;
	}
	
	public String getName()
	{
		return name;
	}

	public int getStrength()
	{
		return strength;
	}
	
	public void setStrength(int theStrength)
	{
	    strength = theStrength;
	}
	
	public void setName(String theName)
	{
	    name = theName;
	}
	public String toString()
	{
	    return "Power: "+ name +", Strength: " + strength; 
	}
}

public class SuperHero
{
	private String name;
	private Power superPower;
	//Static methods exist across all objects of a class
	public static int numSuperHeroes = 0;

	public SuperHero(String heroName, Power power)
	{
		name = heroName;
		superPower = new Power(power.getName(),power.getStrength());
		numSuperHeroes++;
	}
	
	public static int getNumSuperHeroes()
	{
	    return SuperHero.numSuperHeroes;
	}
}

class SuperHeroTester
{
    public static void main(String[] args)
    {
        Power speed = new Power("Speed", 10);
        System.out.println("Creating the Flash!");
    
        SuperHero theFlash = new SuperHero("The Flash", speed);
        
        System.out.println("Number of SuperHeroes Created:");
        System.out.println(SuperHero.getNumSuperHeroes());
        
        System.out.println("Creating Shazam!");
        SuperHero shazam = new SuperHero("Shazam", speed);
        
        System.out.println("Number of SuperHeroes Created:");
        System.out.println(SuperHero.numSuperHeroes);
    }


}