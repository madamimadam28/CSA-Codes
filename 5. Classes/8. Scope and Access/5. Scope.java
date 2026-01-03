/* For this exercise, you are going to complete the printScope() method in the Scope class. Then you will create a Scope object in the ScopeTester and call printScope.

The method will print the name of each variable in the Scope class, as well as its corresponding value. There are 5 total variables in the Scope class, some of which can be accessed directly as instance variable, others of which need to be accessed via their getter methods.

For any variable that can be accessed directly, use the variable name. Otherwise, use the getter method.

Sample Output:
The output of the printScope method should look like this:

t = 39
w = 24
x = 3
y = 18
z = 21 */

public class Scope
{
    private int x;
    private int y;
    private int z;

    public Scope() {
        x = 3;
        y = 18;
        z = 21;
    }

    public void printScope(){
       // Start here
       System.out.println("t = " + getT());
       System.out.println("w = " + getW());
       System.out.println("x = " + x);
       System.out.println("y = " + y);
       System.out.println("z = " + z);
    }

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

    public int getW(){
        int w = x + z;
        return w;
    }

	public int getT() {
        int t = y + z;
		return t;
	}
}

public class ScopeTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scope scope = new Scope();
        scope.printScope();
    }
}