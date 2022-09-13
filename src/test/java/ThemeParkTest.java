import attractions.Attraction;
import attractions.Park;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    CandyflossStall candyflossStall;
    Visitor visitor;

    Attraction attraction;

    @Before
    public void setUp() throws Exception{
        themePark = new ThemePark();
        candyflossStall = new CandyflossStall("MyCandyFlossStall", "Sam", 7, ParkingSpot.A4);
        visitor = new Visitor(20, 177.00, 2000);
        attraction = new Park("Sam's wonderfully mysterious world", 10);

    }

    @Test
    public void canAddAttractionsAndStalls(){
        themePark.addStallOrAttraction(candyflossStall);
        assertEquals(1, themePark.getAllReviewed().size());
    }

    @Test
    public void canAddAttractionAndVisitorCount(){
        themePark.visit(visitor, attraction);
        assertEquals(1, visitor.getAllAttractionsVisited().size());
        assertEquals(1, attraction.getVisitCount());
    }

}
