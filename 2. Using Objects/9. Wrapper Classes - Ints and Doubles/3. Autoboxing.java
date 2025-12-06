public class Lifts
{
    private double maxSquat; // maximum amout of weight
    private double maxBench; // can lift in pounds
    private double maxDeadlift;
    
    public Lifts(double squat, double bench, double deadlift)
    {
        maxSquat = squat;
        maxBench = bench;
        maxDeadlift = deadlift;
    }
    
    public void printSquatVolumeWorkout(Double percentage)
    {
        // Round to two places
        double weight = ((int)(maxSquat * percentage * 100)) / 100.0;
        System.out.println("6 x 3 at " + weight);
    }
    
    public void setSquat(double newMax)
    {
        maxSquat = newMax;
    }
    
    
    public void printSquatPyramidWorkout(Integer maxReps)
    {   
        // Round to two places
        double weight = ((int)(maxSquat * .6 * 100)) / 100.0;
        System.out.println(maxReps + " with " + weight + " lbs");
        
        maxReps -= 2;
        
        // Round to two places
        weight = ((int)(maxSquat * .8 * 100)) / 100.0;
        System.out.println(maxReps + " with " + weight + " lbs");
        
        maxReps -= 2;
        // Round to two places
        weight = ((int)(maxSquat * .9 * 100)) / 100.0;
        System.out.println(maxReps + " with " + weight + " lbs");
        
    }
    
    /*  Other methods would go here */
    
    // Computes how much weight you have to add to each
    // side of a 45 lb barbell
    // Note the integer division
    public int computePlateWeight(int weight)
    {
        return (weight - 45) / 2;
    }
}

public class LiftsTester
{
    public static void main(String[] args)
    {
        Lifts weights = new Lifts(183, 140, 220);
        
        // Create variables 
        Double percent = 0.75;
        double newSquat = 185;
        int numReps = 10;
        Integer barWeight = 180;
        
        /* This method takes a Double (object).
         * Note that both calls work. The
         * first passes a Double (object) and
         * the second passes a double (primitive).
         */
        weights.printSquatVolumeWorkout(percent);
        
        double lightPercent = 0.50;
        weights.printSquatVolumeWorkout(lightPercent);
        
        
        /* This method takes a double (primitive).
         * Note that both calls work. The first
         * passes a double (primitive) and the
         * second passses a Double (object).
         */
        weights.setSquat(newSquat);

        Double newMax = newSquat + 5;
        weights.setSquat(newMax);
        
        
        // This method takes an int, but
        // accepts Integer
        System.out.println(weights.computePlateWeight(barWeight));
        
        // This method takes an Integer, but
        // accepts int
        weights.printSquatPyramidWorkout(numReps);
        
        
    }
}