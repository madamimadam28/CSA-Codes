/*In this exercise, walkthrough (without running) the code line by line to see the values of str1, str2, and str3. Can you guess which lines will print?

After looking through the code, run the code to see the output. Can you figure out why some lines don’t print? Figure out which conditional statements are not evaluating to true and comment them out. */

public class StringTrace
{
    public static void main(String[] args)
    {
        String str1 = null;
        String str2 = new String("Karel");
        String str3 = "Karel";
        
        if (str1 == null)
        {
            str1 = str2;
        }
        
        if (str1 == str2)
        {
            System.out.println("str1 and str2 refer to the same object");
        }
        
        // if (str2 == str3)
        // {
        //     System.out.println("str2 and str3 refer to the same object");
        // }
        
        if (str1.equals(str2) && str2.equals(str3))
        {
            System.out.println("str1, str2, and str3 are equal");
        }
        
        // if ((str1 == str2) && (str2 == str3))
        // {
        //     System.out.println("str1, str2, and str3 are the same objects");
            
        // }
        
    }
}