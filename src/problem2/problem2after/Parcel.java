package problem2.problem2after;

public class Parcel {
    private double weightKg;
    public Parcel(double weightKg){
        this.weightKg = weightKg;
    }
    public double shippingCost(ShippingMethod method){
        return method.cost(weightKg);
    }
}
