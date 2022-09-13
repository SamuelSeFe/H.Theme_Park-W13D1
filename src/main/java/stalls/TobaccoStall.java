package stalls;

import behaviours.ISecure;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecure {

    public TobaccoStall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 17){
            return true;
        }else{
            return false;
        }
    }
}
