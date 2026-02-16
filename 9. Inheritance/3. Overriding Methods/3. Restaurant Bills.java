public class RestaurantBill {

    private final double TAX_RATE = 0.05;
    private final double TIP_RATE = 0.20;
    private double foodTotal;

    public RestaurantBill(double foodTotal)
    {
        this.foodTotal = foodTotal;
    }

    public double getFoodTotal()
    {
        return foodTotal;
    }

    public double getTaxRate()
    {
        return TAX_RATE;
    }

    public double getTipRate()
    {
        return TIP_RATE;
    }

    // Restaurant automatically adds tax and tip.
    public double grandTotal()
    {
        return foodTotal * (1 + TAX_RATE + TIP_RATE);
    }
}

public class FastFoodBill extends RestaurantBill {

    public FastFoodBill(double foodTotal)
    {
        super(foodTotal);
    }

    // For a Fast Food bill, we don't want to include a tip
    // so we override the calculation.
    @Override
    public double grandTotal()
    {
        return super.getFoodTotal() * (1 + super.getTaxRate());
    }

}

public class RestaurantTester {

    public static void main(String[] args) {

        
        RestaurantBill sitDownBill = new RestaurantBill(20);
        
        // When we call the RestaurantBill grand total, it includes a tip
        System.out.println("Total including a tip: " + sitDownBill.grandTotal());

        FastFoodBill fastFood = new FastFoodBill(20);
        
        // When we call a FastFood grand total, we override the restaurant and
        // do not include a tip.
        System.out.println("Total not including a tip: " + fastFood.grandTotal());
    }

}