/* For this exercise, we have created a static class called FractionMath that will handle adding and multiplying fractions.

We are going to use this static class as we build out a new Fraction class. Your job is to complete the Fraction class based on the structure that is set up. To do this, you will need to use the this notation in your constructor and setters. You will also need to use it to pass the object to the FractionMath class.

The tester is complete and can be used to test your objects. Feel free to make changes in this class to test other things. */

public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

	/**
	* Returns value of numerator
	* @return numerator
	*/
	public int getNumerator() {
	    return numerator;
	}

	/**
	* Sets new value of numerator
	* @param numerator new numerator value
	*/
	public void setNumerator(int numerator) {
	    this.numerator = numerator;
	}

	/**
	* Returns value of denominator
	* @return denominator
	*/
	public int getDenominator() {
		return denominator;
	}

	/**
	* Sets new value of denominator
	* @param denominator new denominator
	*/
	public void setDenominator(int denominator) {
	    this.denominator = denominator;
	}

    /**
	* Updates this fraction by adding another fraction
	* @param other Fraction to add to existing fraction
	*/

    //Calculate by using the FractionMath class, then update
    //the numerator and denominator from the returned Fraction
    public void addFraction(Fraction other){
        Fraction sum = FractionMath.add(this, other);
        numerator = sum.getNumerator();
        denominator = sum.getDenominator();
    }

    /**
	* Updates this fraction by multiplying another fraction
	* @param other Fraction to multiple to existing fraction
	*/

    //Calculate by using the FractionMath class, then update
    //the numerator and denominator from the returned Fraction
    public void multiplyFraction(Fraction other){
        Fraction product = FractionMath.multiply(this, other);
        numerator = product.getNumerator();
        denominator = product.getDenominator();
    }

    /**
	* Prints fraction as numerator / denominator
	* Example: 1 / 2
	*/

    public String toString(){
        return numerator + " / " + denominator;
    }
}

public class FractionMath {
    
    /*
    * This is a static class that the Fraction class will use.
    * No updates are needed.
    */
    
    public static Fraction add(Fraction frac1, Fraction frac2){
        int numerator = frac1.getNumerator() * frac2.getDenominator() +
                        frac2.getNumerator() * frac1.getDenominator();

        int denominator = frac1.getDenominator() * frac2.getDenominator();

        Fraction solution = new Fraction(numerator, denominator);
        return solution;
    }

    public static Fraction multiply(Fraction frac1, Fraction frac2){
        int numerator = frac1.getNumerator() * frac2.getNumerator();
        int denominator = frac1.getDenominator() * frac2.getDenominator();
        Fraction solution = new Fraction(numerator, denominator);
        return solution;
    }
}

public class FractionTester
{
    public static void main(String[] args) {
        Fraction first = new Fraction(3, 4);

        Fraction half = new Fraction(1, 2);

        System.out.println(first);
        System.out.print("Multiplying: ");
        System.out.println(half);

        first.multiplyFraction(half);

        System.out.println("Answer: " + first);

        System.out.println();
        System.out.print("Adding: ");
        System.out.println(half);

        first.addFraction(half);

        System.out.println("Answer: " + first);
    }

}