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

public class SecretIdentity
{
	private String realName;
	private String occupation;
	private String homePlanet;

	public SecretIdentity(String name, String occupat, String planet)
	{
		realName = name;
		occupation = occupat;
		homePlanet = planet;
	}
	
	public String getRealName()
    {
    	return realName;
    }
    
    public String getOccupation()
    {
    	return occupation;
    }
    public String getHomePlanet()
    {
    	return homePlanet;
    }
    public String toString()
    {
    	return "Real Name: " + realName + " is from planet " + homePlanet + " and works as a " + occupation + ".";
    }

}

public class SuperHero
{
	private String name;
	private Power superPower;
	private SecretIdentity identity;

	public SuperHero(String heroName, Power power, SecretIdentity theIdentity)
	{
		name = heroName;
		superPower = new Power(power.getName(),power.getStrength());
		identity = new SecretIdentity(theIdentity.getRealName(),theIdentity.getOccupation(), theIdentity.getHomePlanet());
	}
	
	public int getStrength()
	{
	    return superPower.getStrength();
	}
	
	public SecretIdentity getIdentity()
	{
	    return identity;
	}
	
	//This will include the toString() from the identity class.
	public String toString()
	{
	    return name + "\'s secret identity: " + identity; 
	}
}

public class SuperHeroTester
{
    public static void main(String[] args)
    {
        Power superStrength = new Power("Super Strength", 100);
        SecretIdentity clarkKent = new SecretIdentity("Clark Kent", "Journalist", "Krypton");
        SuperHero superMan = new SuperHero("Superman", superStrength, clarkKent);
        
        //This will return the toString() of the SecretIdentity class
        System.out.println(superMan.getIdentity());
        
        //This will return the toString() of the SuperHero class
        System.out.println(superMan);
    }
}