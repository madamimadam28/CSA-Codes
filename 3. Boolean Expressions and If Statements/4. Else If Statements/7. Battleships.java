/*The Battleship class represents a single battleship. Each battleship has the instance variables name (the type of ship), power (the power level of this ship’s attack), and health (declines with attacks).

Fill in the methods updateDamage and stillFloating in Battleship.

The damage done by the attacking ship is determined as follows:

If the attack power of the ship is less than 5, the ship inflicts 2 damage
If the attack power of the ship is less than 10, the ship inflicts 7 damage
If the attack power of the ship is 10 or more, the ship inflicts 10 damage
The method updateDamage updates the attacked ship’s health accordingly. In main, you should be able to see that the differing levels of attack power yield different amounts of damage.

stillFloating returns a boolean indiciating if the ship
is still floating. The ship is still floating as long as
the health is greater than 0. While you can use an if statement,
remember you can also directly return the result of a boolean expression
e.g return x > y; */

public class Battleship
{
    private String name;  // type of ship
    private int power;   // power of attack in range [1 - 10]
    private int health; // health of the ship
    
    // Constructor
    public Battleship(String shipType, int attackPower)
    {
        name = shipType;
        power = attackPower;
        health = 100;
    }
    
    // Modifies the health of the battleship
    public void updateDamage(int attackPower)
    {
        if (attackPower >= 10) {
            health -= 10;
        }
        else if (attackPower >= 5) {
            health -= 7;
        }
        else {
            health -= 2;
        }
    }
    
    // Returns true if the health of
    // the ship is greater than 0
    public boolean stillFloating()
    {
        return health > 0;
    }
    
    // Returns the power of the ship
    public int getPower()
    {
        return power;
    }
    
    // Returns string representation in the form
    // Battleship name
    public String toString()
    {
        return name + "(" + health + ")";    
    }
    
}

public class ShipTester
{
    public static void main(String[] args)
    {
        Battleship sub = new Battleship("submarine", 6);
        Battleship raft = new Battleship("raft", 2);
        Battleship destroyer = new Battleship("destroyer", 11);
     
        System.out.println(sub);
        System.out.println("Sub has power " + sub.getPower());
        
        System.out.println(raft);
        System.out.println("Raft has power " + raft.getPower());
        
        System.out.println(destroyer);
        System.out.println("Destroyer has power " + destroyer.getPower());
        
        System.out.println("\nRaft attacks Sub");
        sub.updateDamage(raft.getPower());
        System.out.println(sub);
        
        System.out.println("\nDestroyer attacks Raft");
        raft.updateDamage(destroyer.getPower());
        System.out.println(raft);
        
        System.out.println("\nSub attacks Destroyer");
        destroyer.updateDamage(sub.getPower());
        System.out.println(destroyer);


    }
}