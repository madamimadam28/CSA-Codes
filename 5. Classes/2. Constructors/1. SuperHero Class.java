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
}

public class SuperHero
{
	private String name;
	private Power superPower;

	public SuperHero(String heroName, Power power)
	{
		name = heroName;
		
		//Comment out:
		// superPower = power;
		//Assigning power to superPower makes superPower an alias of power
		//The correct initialization is the commented assignment below.
		//Uncomment below, and comment out the superPower = power.
		
		superPower = new Power(power.getName(),power.getStrength());
	}
	
	public int getStrength()
	{
	    return superPower.getStrength();
	}
	
	public void setStrength(int strength)
	{
	    superPower.setStrength(strength);
	}
}

public class SuperHeroTester
{
    public static void main(String[] args)
    {
        Power speed = new Power("Super Speed", 10);
        
        
        SuperHero flash = new SuperHero("The Flash", speed);
        SuperHero shazam = new SuperHero("Shazam", speed);
        
        System.out.print("Shazam's Strength: ");
        System.out.println(shazam.getStrength());
        System.out.print("Flash's Strength: ");
        System.out.println(flash.getStrength());
        
        //When setting the strength of theFlash, shazam will change too!
        //Uncomment out the initialization of superPower in the SuperHero class
        //file to fix the object reference.
        System.out.println("\nUpdating Flash's strength to 15\n");
        flash.setStrength(15);
        
        System.out.print("Shazam's Strength: ");
        System.out.println(shazam.getStrength());
        System.out.print("Flash's Strength: ");
        System.out.println(flash.getStrength());
    }
}