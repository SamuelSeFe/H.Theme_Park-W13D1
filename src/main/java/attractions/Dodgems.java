package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double DefaultPrice() {
        return 4.50;
    }

    @Override
    public double PriceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            return visitor.getMoney() - DefaultPrice()/2;
        } else {
            return visitor.getMoney() - DefaultPrice();
        }
    }
}
