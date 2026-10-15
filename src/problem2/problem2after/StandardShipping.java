package problem2.problem2after;

public class StandardShipping implements  ShippingMethod{
    @Override
    public double cost(double weightKg) {
        return 20 + 5 * weightKg;
    }

    @Override
    public String name() {
        return "STANDARD";
    }
}
