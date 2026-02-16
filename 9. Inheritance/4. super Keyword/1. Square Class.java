public class Rectangle  {

    private int width;
    private int height;
     
    public Rectangle(int width, int height)
    {
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
    
    public int area() 
    {
        return width * height;    
    }
    
    public String toString()
    {
        return "A rectangle with a width of " + width 
            + " and a height of " + height;
    }
}

public class Square extends Rectangle {
    
    public Square(int sideLength) {
        super(sideLength, sideLength);
    }
    
    public double getSideLength() {
        return super.getHeight();
    }
    
    // To call a method from the superclass, we use super as the object
    @Override
    public String toString() {
        return "Square with an area of " + super.area(); 
    }
}

public class SquareTester
{
    public static void main(String[] args)
    {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 7);
        
        // The Square toString will override the rectangle toString
        System.out.println(square);
        
        // The Rectangle will return the toString from the Rectangle class
        System.out.println(rectangle);
    }
}