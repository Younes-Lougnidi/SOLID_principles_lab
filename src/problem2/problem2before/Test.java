package problem2.problem2before;

public class Test {
    public static void main(String[] args){
        ShippingCalculator calc = new ShippingCalculator();
        double stdrCost = calc.cost("STANDARD",2);
        double expCost = calc.cost("EXPRESS", 2);
        double droneCost = calc.cost("DRONE",2);
        double pickupCost = calc.cost("PICKUP" , 2);
        System.out.println("Standard: " + stdrCost + " MAD");
        System.out.println("Express: " + expCost + " MAD");
        System.out.println("Drone: " + droneCost + " MAD");
        System.out.println("Pickup: " + pickupCost + " MAD");


    }
}
