public class Shape {

	private int numSides;

	public Shape(int numSides) 
	{
		this.numSides = numSides;
	}
	
	public int getSides()
	{
	    return numSides;
	}
}

public class Rectangle extends Shape {

    private int width;
    private int height;

    /**
     * Notice in this example, we pass a hard coded
     * value to the Superclass constructor. Since
     * all Rectangles have 4 sides, we don't need
     * to ask the user for the sides.
     */
     
    public Rectangle(int width, int height) {
       super(4);
    	this.width = width;
    	this.height = height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "A rectangle with a width of " + width 
            + " and a height of " + height;
    }
}

public class ShapeRunner
{
    public static void main(String[] args)
    {
        /**
         * When the rectangle is created, we only need to
         * pass the width and height.
         */ 
        Rectangle rect1 = new Rectangle(5, 4);
        
        System.out.println(rect1);
        
        /**
         * The number of sides gets set when the Rectangle
         * subclass calls the Shape superclass
         */ 
        System.out.println("Number of Sides: " + rect1.getSides());
    }
}