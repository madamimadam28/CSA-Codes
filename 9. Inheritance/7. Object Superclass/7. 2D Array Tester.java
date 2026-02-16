/* For the final exercise, we are going to create a 2D Array tester. We want our tester to be versatile, so the class has been designed to take any 2D Object. 
Polymorphism will allow us to pass any Object type in and do a comparision using that object’s .equal method.

This can get a little tricky, so you are given a bit of the structure to help make this happen. 
You are also given a complete tester code that will compare 4 different arrays for you. 
The first two should be the same and return true, the second two are different and should return false.

Your task is to complete the equals method. Two arrays are equal if all the elements are the same. 
As you develop your logic, be sure to consider the case when two arrays may be different sizes. */

public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input){
        myArray = input;
    }

    public boolean equals(Object[][] other){

        // Add your code here
        if (myArray.length == other.length) {
            for (int i = 0; i < myArray.length; ++i) {
                if (myArray[i].length != other[i].length) {
                    return false;
                }
                for (int j = 0; j < myArray[i].length; ++j) {
                    if (!myArray[i][j].equals(other[i][j])) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}

public class TwoDTester {

    public static void main(String[] args) {


        Integer[][] firstArray = {{2,3}, {3,4}, {4,5}};
        Integer[][] secondArray = {{2,3}, {3,4}, {4,5}};
        TwoDArray first = new TwoDArray(firstArray);
        
        System.out.println(first.equals(secondArray));
        
        String[][] thirdArray = {{"Hello", "Goodbye"}, 
                                 {"Hola", "Adios"},
                                 {"Bonjour", "Au revoir"}};
        String[][] fourthArray = {{"Hello", "Goodbye"}, 
                                 {"Ciao", "Addio"},
                                 {"Bonjour", "Au revoir"}};
        TwoDArray third = new TwoDArray(thirdArray);
        
        System.out.println(third.equals(fourthArray));
    }

}