package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(10, 110.00, 20.00);
        visitor2 = new Visitor(14, 150.00, 20.00);
        visitor3 = new Visitor(20, 202.00, 100.00);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowed(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void canChargeForAttraction(){
        assertEquals(83.20, rollerCoaster.PriceFor(visitor3), 0.0);
        assertEquals(11.60, rollerCoaster.PriceFor(visitor1), 0.0);
    }

}
