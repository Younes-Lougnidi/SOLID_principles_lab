package problem2.problem2after;

public class PickupShipping implements ShippingMethod{
    @Override
    public double cost(double weightKg) {
        if (weightKg  < 5 ) {return 0.0;};
        return 10.0;
    }

    @Override
    public String name() {
        return "PICKUP";
    }
}
