/*Write a program that estimates how much Kufu’s pyramid in Giza weighs.

Your program should assume that every block weighs 2.5 tons. Kufu’s pyramid in Giza used around 2,500,000 blocks.

You should use two variables, numBlocks and blockWeight, to calculate the weight. */

public class Pyramid 
{
    public static void main(String[] args)
    {
        double blockWeight = 2.5;
        double numBlocks = 2500000.0;
        double ans = blockWeight * numBlocks;
        System.out.println("The pyramid weighs " + ans + " tons");
    }
}