/* FRACTION CLASS*/

class Fraction {
    
    // Initialize numerator and denominator
    private int num;
    private int deno;
    
    // Get values for Fraction
    public Fraction(int numerator, int denominator) {
        
        // If denominator is less than 0, change so numerator is less than 0
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        
        // Set user given values to class values
        this.num = numerator;
        this.deno = denominator;
        
        // Reduce the fraction to lowest terms
        reduce();
    }
    
    // Getters from user
    public int getNum() {
        return num;
    }
    public int getDeno() {
        return deno;
    }
    
    //-----PARSE FRACTION-----//
    public static Fraction parse(String term) {
        
        // Initialize variables
        int whole = 0, num = 0, deno = 1;
        
        // Check if mixed fraction
        if (term.contains("_")) {
            
            // Find when underscore and slash are in the fraction
            int underscore = term.indexOf('_');
            int slash = term.indexOf('/');
            
            // Set variables for the mixed fraction
            whole = Integer.parseInt(term.substring(0, underscore));
            num = Integer.parseInt(term.substring(underscore + 1, slash));
            deno = Integer.parseInt(term.substring(slash + 1));
        }
        
        // Check if fraction
        else if (term.contains("/")) {
            
            // Find where thr underscore is
            int slash = term.indexOf('/');
            
            // Set variables for the fraction
            num = Integer.parseInt(term.substring(0, slash));
            deno = Integer.parseInt(term.substring(slash + 1));
        }
        
        // Otherwise, Whole number
        else {
            whole = Integer.parseInt(term);
        }
        
        // Convert to improper with check for negative
        int improper = whole * deno + (whole < 0 ? -num : num);
        
        // Return the fraction
        return new Fraction(improper, deno);
    }
    
    //-----REDUCE FRACTION TO LOWEST TERMS-----//
    // Not needed my the user so declared private
    private void reduce() {
        int GCD = gcd(Math.abs(num), Math.abs(deno));
        num /= GCD;
        deno /= GCD;
    }
    
    //-----GREATEST COMMON DIVISOR HELPER-----//
    // Private since it's a helper method used for computing, user not needed
    private int gcd(int a, int b) {
        
        for (int i = Math.min(a, b); i > 0; --i) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
    
    //-----LEAST COMMON MULTIPLE HELPER-----//
    // Private since it's a helper method used for computing, user not needed
    private int lcm(int a, int b) {
        
        return Math.abs(a * b) / (gcd(a, b));
    }
    
    //-----COMPUTATION HELPER-----//
    public Fraction compute(Fraction frac, String operator) {
        
        // Initialize numerator and denominator
        int numerator = 0;
        int denominator = 1;
        
        // Adding
        if (operator.equals("+")) {
            
            // Find LCM of denominator
            denominator = lcm(this.deno, frac.deno);
            
            // Find numerator of fraction
            numerator = this.num * (denominator / this.deno) + frac.num * (denominator / frac.deno);
        }
        
        // Subracting
        if (operator.equals("-")) {
            
            // Find LCM of denominator
            denominator = Math.abs(this.deno * frac.deno) / gcd(this.deno, frac.deno);
            
            // Find numerator of fraction
            numerator = this.num * (denominator / this.deno) - frac.num * (denominator / frac.deno);
        }
        
        // Multiplying
        if (operator.equals("*")) {
            
            // Multiply terms;
            numerator = this.num * frac.num;
            denominator = this.deno * frac.deno;
        }
        
        // Dividing
        if (operator.equals("/")) {
            
            // Divide terms;
            numerator = this.num * frac.deno;
            denominator = this.deno * frac.num;
        }
        
        // Modulus 
        if (operator.equals("%")) {
            
            // (x % y) = x - floor(x / y) * y
            // (a / b) / (c / d) = ad / bc
            
            // Scale the denominator to common multiple
            int lcm_deno = lcm(this.deno, frac.deno);
            
            // Set the top and bottom, aka "x" and "y"
            int top = this.num * (lcm_deno / this.deno);
            int bottom = frac.num * (lcm_deno / frac.deno);
            
            // Find floor quotient of numbers
            int quotient = Math.floorDiv(top, bottom);
            
            // Get numerator and denominator
            numerator = top - quotient * bottom;
            
            // Make modulus always positive
            if (numerator < 0) {
                numerator += Math.abs(bottom);
            }
            denominator = Math.abs(lcm_deno);
        }
        
        // Return answer of the operation
        return new Fraction(numerator, denominator);
    }
    
    //-----ORDER OF OPERATIONS PASS 1: MULTIPLICATION AND DIVISON-----//
    // private because not needed to be used by user
    // this method used by evaluate function to find the answer
    private static String passOne(String expression) {
        
        // Initialize output string (result after pass 1)
        String output = "";
        
        // Initialize running current fraction and the operator
        Fraction current = null;
        String operator = "";
        
        // Declare what the starting i would be for the substring and the number of tokens checked (0-indexed)
        int last_i = 0;
        int num_tokens = 0;
        
        // Add extra space to line so that it checks the last token
        expression = expression + " ";
        
        // Keep running number to check which term is inputted
        for (int i = 0; i < expression.length(); ++i) {
            
            // New token
            if (expression.charAt(i) == ' ') {
                
                // Initialize token
                String token = expression.substring(last_i, i);
                
                // Redeclare what the starting i is for the substring
                last_i = i + 1;
                
                // Skip empty tokens (whitespace)
                if (token.length() == 0) {
                    continue;
                }
                
                // New number
                if (num_tokens % 2 == 0) {
                    
                    // Parse the fraction
                    Fraction frac = Fraction.parse(token);
                
                    // Check if token is the first number
                    if (current == null) {
                        
                        // Set current to be the fraction
                        current = frac;
                    }
                    
                    // Check if multiplication or division or modulus
                    else if (operator.equals("*") || operator.equals("/") || operator.equals("%")) {
                        
                        // Compute the current fraction
                        current = current.compute(frac, operator);
                    }
                    
                    // Addition or subtraction, so add current with operator to output string
                    else {
                        output += current + " " + operator + " ";
                        
                        // Set current to the last parsed fraction
                        current = frac;
                    }
                }
                
                // New operand
                else {
                    
                    // Set new operator
                    operator = token;
                }
                
                // Increment number of tokens
                num_tokens++;
            }
        }
        
        // Add final fraction to the output string
        output += current;
        
        // return string (expression after pass one)
        return output;
    }
    
    //-----SECOND PASS: ADDITION AND SUBTRACTION-----//
    // private because not needed to be used by user
    // this method used by evaluate function to find the answer
    private static Fraction passTwo(String expression) {
        
        // Initialize terms and operator
        String operator = "";
        Fraction result_frac = null;
        Fraction next_frac = null;
        
        // Iterate through terms and keep running answer
        int last_i = 0;
        int num_tokens = 0;
        
        // Add extra space to line so that it checks the last token
        expression = expression + " ";
        
        // Keep running number to check which term is inputted
        for (int i = 0; i < expression.length(); ++i) {
            
            // New token
            if (expression.charAt(i) == ' ') {
                
                // Initialize token
                String token = expression.substring(last_i, i);
                
                // Redeclare what the starting i is for the substring
                last_i = i + 1;
                
                // Skip empty tokens
                if (token.length() == 0) {
                    continue;
                }
                
                // New number
                if (num_tokens % 2 == 0) {
                
                    // Check if first number
                    if (result_frac == null) {
                        
                        // Parse in numerator and denominator
                        result_frac = Fraction.parse(token);
                    }
                    
                    // Compute running answer if not first number
                    else {

                        // Parse in numerator and denominator
                        next_frac = Fraction.parse(token);
                        
                        // Compute running answer
                        result_frac = result_frac.compute(next_frac, operator);
                    }
                }
                
                // New operand
                else {
                    operator = token;
                }
                
                // Increment number of tokens
                num_tokens++;
            }
        }
        
        // Return what the resulting fraction is after pass two
        return result_frac;
    }
    
    //-----EVALUATE WITH PARENTHESIS-----//
    // Printing out how the program solves the expression step by step
    public static Fraction evaluate(String expression) {
        
        // Initialize printed expression
        String printed;
        
        // Check if there are still parenthesis in the expression
        while (expression.contains("(")) {
            
            // Initialize opening and closing parenthesis location
            int open = -1, closed = -1;
            
            // Find innermost parenthesis
            for (int i = 0; i < expression.length(); ++i) {
                
                // If open parenthesis found, set open to index
                if (expression.charAt(i) == '(') {
                    open = i;
                }
                
                // If closed parenthesis means found innermost
                // Set closed to indes, break out of the loop
                if (expression.charAt(i) == ')') {
                    closed = i;
                    break;
                }
            }
            
            // Set substring to terms inside parenthesis
            String sub = expression.substring(open + 1, closed);
            
            // Use order of operations passes to compute expression inside parenthesis
            String pass_one = passOne(sub);
            
            // Print out expression after pass one if not the same
            if (!sub.equals(pass_one)) {
                
                // Check if pass one had only one operator
                if (!pass_one.contains(" ")) {
                    printed = expression.substring(0, open) + pass_one + expression.substring(closed + 1);
                }
                else {
                    printed = expression.substring(0, open) + "(" + pass_one + ")" + expression.substring(closed + 1);
                }
                
                // Check if printed before
                if (!printed.equals(expression)) {
                    System.out.println("     = " + printed);
                }
            }
            
            // Pass two of expression (addition and subtraction)
            Fraction frac = passTwo(pass_one);
            
            // Replace parenthesis with the result
            printed = expression.substring(0, open) + frac + expression.substring(closed + 1);
            
            // Print out expression after pass two with check to avoid repitition
            if (!pass_one.equals(frac.toString())) {
                System.out.println("     = " + printed);
            }
            
            // Set expression to printed
            expression = printed;
        }
        
        // Do a final pass on the expression once it is without parenthesis
        String final_pass = passOne(expression);
        
        // Print out expression after pass one if not the same
        if (!final_pass.equals(expression)) {
            System.out.println("     = " + final_pass);
        }
        
        Fraction answer = passTwo(final_pass);
        
        // Print out answer
        if (!final_pass.equals(answer.toString())) {
            System.out.println("     = " + answer);
        }
        
        // Return final answer
        return answer;
    }
    
    //-----GET ANSWER-----//
    public String toString() {
        
        if (num == 0) {
            return "0";
        }
        
        // Whole number
        if (deno == 1) {
            return num + "";
        }
        
        // Fraction
        else {
            return num + "/" + deno;
        }
    }
}

// Adam Du
// Period 7
// AP CSA
// FracCalc

// Import Libraries
import java.util.*;
import java.lang.*;

public class MyProgram
{
    
    //-----MAIN-----//
    public static void main(String[] args)
    {
        // Initialize Scanner
        Scanner input = new Scanner(System.in);
        
        // Welcome Statement
        System.out.println("Welcome to FracCalc!");
        System.out.println();
        
        // While Loop
        while (true) {
            System.out.print("Enter: ");
            
            // Get terms in expression
            String line = input.nextLine().trim();
            
            // Check if quit statment
            if (line.equals("quit")) {
                
                // End while loop
                break;
            }
            
            // Evaluate answer;
            Fraction answer = Fraction.evaluate(line);
            
            // Output Answer
            System.out.print(line + " = " + answer);
            
            // Check if improper fraction
            if (answer.toString().contains("/") && Math.abs(answer.getNum() / answer.getDeno()) > 0) {
                
                // Convert to mixed
                int whole = answer.getNum() / answer.getDeno();
                int rem = Math.abs(answer.getNum() % answer.getDeno());
                
                System.out.print(" = " + whole + "_" + rem + "/" + answer.getDeno());
            }
            
            // Print new line for better readablilty
            System.out.println();
            System.out.println();
        }
        
        // End
        System.out.println();
        System.out.println("Thank you");
    }
}