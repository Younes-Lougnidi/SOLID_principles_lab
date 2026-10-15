package problem2.problem2after;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<ShippingMethod> shippingmethods = new ArrayList<>(List.of(new StandardShipping(),new ExpressShipping(),new DroneShipping() , new PickupShipping()));
        Parcel parcel = new Parcel(2);
        for(int i = 0 ; i < shippingmethods.size() ; i ++ ) {
            System.out.println(shippingmethods.get(i).name() + ": " + parcel.shippingCost(shippingmethods.get(i)) + " MAD");
        }
    }

}
