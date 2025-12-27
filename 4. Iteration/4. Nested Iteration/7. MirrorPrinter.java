public class MyProgram {
    
    // Reminder: we won't check odd sizes
    public static final int SIZE = 28;

	public static void main(String[] args) {
		printBar();
		printUpperHalf();
		printLowerHalf();
		printBar();
	}

    //print bar
    public static void printBar() {
    	// Your code here
    	// 10 -> 14 -> 18
    	for (int i = 0; i < (SIZE - 1) * 2; ++i) {
    	    if (i == 0 || i == (SIZE - 1) * 2 - 1) {
    	        System.out.print("#");
    	    }
    	    else {
    	        System.out.print("=");
    	    }
    	}
    	System.out.println();
    	
    }

    //print upper mirror half, nested for loop
    //spaces shrink, dots grow, spaces shrink
	public static void printUpperHalf() {
		for (int i = 0; i < (SIZE / 2) - 1; ++i) {
		    System.out.print("|");
		    for (int j = SIZE - 2 * i - 4; j > 0; j--) {
		        System.out.print(" ");
		    }
		    System.out.print("<>");
		    for (int j = 0; j < i * 4; j++) {
		        System.out.print(".");
		    }
		    System.out.print("<>");
		    for (int j = SIZE - 2 * i - 4; j > 0; j--) {
		        System.out.print(" ");
		    }
		    System.out.print("|");
		    System.out.println();
		}
			// print |
			// inner loop prints spaces, shrinking
			// print <>
			// inner loop prints dots, growing
			// print <>
        // inner loop prints spaces, shrinking
        // print |
    }

    //print lower mirror half, nested for loop
    //spaces grow, dots shrink, spaces grow
    public static void printLowerHalf() {
    	// your pseudocode here
        for (int i = (SIZE / 2) - 2; i >= 0; --i) {
		    System.out.print("|");
		    for (int j = SIZE - 2 * i - 4; j > 0; j--) {
		        System.out.print(" ");
		    }
		    System.out.print("<>");
		    for (int j = 0; j < i * 4; j++) {
		        System.out.print(".");
		    }
		    System.out.print("<>");
		    for (int j = SIZE - 2 * i - 4; j > 0; j--) {
		        System.out.print(" ");
		    }
		    System.out.print("|");
		    System.out.println();
		}
    
    }

}