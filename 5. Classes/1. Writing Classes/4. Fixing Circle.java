/*The Circle and CircleTester have been created, but they have errors. The public and private settings for variables and methods are not all correct.

Your job is to go through and fix them. You will need to make edits in both files to get them working correctly, but once complete, your output should match the output below.

Sample Output:
Circle with a radius of 5.0
The diameter is 10.0
The perimeter is 31.41592653589793 */

public class Circle {

	private double radius;

	public Circle(double myRadius) {
		radius = myRadius;
	}

    public void setRadius(int myRadius){
        radius = myRadius;
    }

	public double getDiameter() {
		return radius*2;
	}

	public double getRadius() {
		return radius;
	}

	public double getPerimeter() {
		return Math.PI*getDiameter();
	}

	public String toString() {
		return "Circle with a radius of " + radius;
	}
}

public class CircleTester {

	public static void main(String[] args) {

		Circle circ = new Circle(10);

        circ.setRadius(5);
        
        System.out.println(circ);

        System.out.println("The diameter is " + circ.getDiameter());
        System.out.println("The perimeter is " + circ.getPerimeter());

	}

}