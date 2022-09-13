package attractions;

import behaviours.IReviewed;
import behaviours.ISecure;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecure, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() > 12) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double DefaultPrice() {
        return 8.40;
    }

    @Override
    public double PriceFor(Visitor visitor) {
        if (visitor.getHeight() > 200.00){
            return visitor.getMoney() - DefaultPrice()*2;
        } else {
            return visitor.getMoney() - DefaultPrice();
        }
    }
}
