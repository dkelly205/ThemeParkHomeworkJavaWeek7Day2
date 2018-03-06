import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void setUp() throws Exception {
            rollercoaster = new Rollercoaster("Tornado", 12, 1.50, 24, 5.00);
    }

    @Test
    public void testName(){
        assertEquals("Tornado", rollercoaster.getName());
    }

    @Test
    public void testMinAge(){
        assertEquals(12, rollercoaster.getMinAge());
    }

    @Test
    public void testMinHeight(){
        assertEquals(1.50, rollercoaster.getMinHeight(), 0.01);
    }

    @Test
    public void testCapacity(){
        assertEquals(24, rollercoaster.getCapacity());
    }

    @Test
    public void testPrice(){
        assertEquals(5.00, rollercoaster.getCost(), 0.01);
    }
}
