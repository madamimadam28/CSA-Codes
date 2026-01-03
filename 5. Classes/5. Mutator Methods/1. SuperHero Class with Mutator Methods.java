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

	public SuperHero(String heroName, Power power)
	{
		name = heroName;
		superPower = new Power(power.getName(),power.getStrength());
	}
	
	public int getStrength()
	{
	    return superPower.getStrength();
	}
	
	/* By using Setter methods, we can do data validation
	 * that would not be possible with direct access. 
	 */
	public void setStrength(int strength)
	{
	    // Validate strength is at least 0
	    if (strength < 0) {
	        strength = 0;
	    }
	    superPower.setStrength(strength);
	}
	
	public void setName(String theName)
	{
	    name = theName;
	}
	
	public void setPower(String name, int strength)
	{
	    //We need to call the mutators methods from the Power class to change the values of Power
	    superPower.setName(name);
	    superPower.setStrength(strength);
	}
	public String toString()
	{
	    return "Name: "+ name +", " + superPower;
	}
}
public class SuperHeroTester
{
    public static void main(String[] args)
    {
        Power speed = new Power("Super Speed", 10);
        SuperHero flash = new SuperHero("The Flash", speed);
        
        System.out.println(flash);
        flash.setStrength(-10);
        // Notice our setter method did not let us set a 
        // negative strength
        System.out.println(flash);
        System.out.println("\nUpdating Flash's Power");
        
        //Mutator method to change the Power of flash
        flash.setPower("Light Speed", 100);
        
        System.out.println("\n"+flash);
        
    }
}