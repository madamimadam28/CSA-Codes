/*Fill in the Currency class using the method comments as a guide.

For getDollars and getCents, you can isolate the dollar part by rounding the Double to an Integer. To do that, get the double value using doubleValue and cast the result to an Integer. (You can refer to the using Doubles example from earlier in this lesson.)

There are several ways to get the cents, but you need to be careful not to get a double rounding error. One way is to use multiplication and the mod function together.

When creating the toString, be sure to use the getDollars and getCents methods for your values.

When you run main, you should get

Value of bankroll: $12.45
Dollars: 12
Cents: 45
Value of bankroll: $20.56
Dollars: 20
Cents: 56
Value of bankroll: $67.78
Dollars: 67
Cents: 78 */

public class Currency
{
    private Double value;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        return value.intValue();
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        Double cents = value * 100 % 100;
        return cents.intValue();
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return "$" + getDollars().toString() + "." + getCents().toString();
    }
}

public class CurrencyTester
{
    public static void main(String[] args)
    {
        Currency bankRoll = new Currency(12.45);
        
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
        bankRoll.setValue(20.56);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        bankRoll.setValue(67.78);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
    }
}