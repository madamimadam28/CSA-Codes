public class Rectangle {
    
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public String toString() {
        return "Rectangle with width: " + width 
                + " and height: " + height;
    }
}

public class Square extends Rectangle {
    
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }
    
    public double getSideLength() {
        return super.getHeight();
    }
    
    @Override
    public String toString() {
        return "Square with side lengths " + getSideLength(); 
    }
    
}

public class SquareTester {
 
   public static void main(String[] args) {
       
        Square box = new Square(5);
        Rectangle box2 = new Rectangle(5, 4);
        
        /**
         * When this runs, the Square box will get
         * the toString from the Square class
         * even though it is defined in the 
         * Rectangle class.
         */
         
        System.out.println(box);
        System.out.println("Area: "  + box.getArea());
        
        System.out.println(box2);
        System.out.println("Area: "  + box2.getArea());
   }
}