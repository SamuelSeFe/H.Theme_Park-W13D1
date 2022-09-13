import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allAttractionsAndStalls;

    public ThemePark(){
        this.allAttractionsAndStalls = new ArrayList<IReviewed>();
    }

    public void addStallOrAttraction(IReviewed stallOrAttraction){
        this.allAttractionsAndStalls.add(stallOrAttraction);
    }

    public ArrayList getAllReviewed(){
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>(this.allAttractionsAndStalls);
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.addAttractionsVisited(attraction);
        attraction.setVisitCount();
    }


}
