package behaviours;

import people.Visitor;

public interface ITicketed {

    public double DefaultPrice();
    public double PriceFor(Visitor visitor);

}
