/* Complete the getAverage() method in the ArrayAverage class using a for-each loop. Create an ArrayAverage object and print the result.

Your output should be:

The average of the array is 36.5*/

public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
     // your code goes here!
     double sum = 0;
     for (int val : values) {
         sum += val;
     }
     
     return sum / values.length;
   }
}

public class ArrayAverageTester
{

   public static void main(String[] args)
   {
     int[] numArray =  {12, 17, 65, 7, 30, 88};
     
     // Create an ArrayAverage object and print the result 
     ArrayAverage average = new ArrayAverage(numArray);
     System.out.println("The average of the array is " + average.getAverage());
   }
}