/* In this exercise, we are going to model some behaviors of a square. 
Since the Square object extends the Rectangle object, we see that a lot of the information we need is stored in the superclass 
and we will need to access it using the super keyword.

Your job is to complete the Square class, as specified within the class. Upon completion, thoroughly test out your code using the SquareTester class. */

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String toString(){
        return width + " x " + height + " Rectangle";
    }
}

public class Square extends Rectangle {

    // Call to the Rectangle constructor
    public Square(double sideLength){
        super(sideLength, sideLength);
    }

    //Set both the width and height in the superclass
    public void setSideLength(double sideLength){
        super.setWidth(sideLength);
        super.setHeight(sideLength);
    }
    
    // Get the width and/or the height from the superclass
    public double area(){
        return super.getWidth() * super.getHeight();
    }
    
    // Get the width and/or the height from the superclass
    public double perimeter(){
        return 2 * super.getWidth() + 2 * super.getHeight();
    } 

    // Override to read: ___ x ____ Square
    public String toString(){
        return super.getWidth() + " x " + super.getHeight() + " Square";
    }
}

public class SquareTester
{
    public static void main(String[] args)
    {
        // Start here!
        Rectangle s1 = new Rectangle(3, 4);
        Square s2 = new Square(3);
        System.out.println(s1);
        System.out.println(s2);
    }
}