package attractions;

import behaviours.IReviewed;
import behaviours.ISecure;
import people.Visitor;

public class Playground extends Attraction implements ISecure {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 16) {
            return true;
        } else {
            return false;
        }
    }
}
