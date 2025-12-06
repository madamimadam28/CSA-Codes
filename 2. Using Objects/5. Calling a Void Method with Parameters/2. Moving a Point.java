public class Point
{
    private int x;
    private int y;
    
    public Point(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }
    
    // Moves a point dx units in the x direction
    // and dy units in the y direction
    public void move(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public String toString()
    {
        return x + ", " + y;
    }
}

public class PointTester 
{
    public static void main(String[] args)
    {
        Point p1 = new Point(1, 5);
        System.out.print("p1: ");
        System.out.println(p1);
        
        
        // Note the order of the parameters matters!
        // The first parameter is how much to move the
        // x coordinate.  
        // The second parameter is how much to move the
        // y coordinate.
        System.out.println("Move p1 by 3, 4");
        p1.move(3, 4);
        System.out.println(p1);
        
        Point p2 = new Point(7, 3);
        System.out.print("p2: ");
        System.out.println(p2);
        
        p2.move(1, 2);
        System.out.println("Move p2 by 1, 2");
        System.out.println(p2);

    }
}