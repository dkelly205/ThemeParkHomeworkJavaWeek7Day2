import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    Rollercoaster rollercoaster;


    @Before
    public void setUp() throws Exception {
            rollercoaster = new Rollercoaster("Tornado", 12, 1.50, 24, 5.00, 100.00);
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

    @Test
    public void testRidersStartsEmpty(){
        assertEquals(0, rollercoaster.getNumberOfRiders());
    }

    @Test
    public void testCanAddRider(){
        Customer customer = new Customer("Danny", 27, 1.60, 200.00);
        rollercoaster.addRider(customer);
        assertEquals(1, rollercoaster.getNumberOfRiders());
    }

    @Test
    public void testCannotAddMoreRidersThanCapacity(){
        Customer customer = new Customer("Danny", 27, 1.60, 200.00);
        for(int i = 0; i < 30; i++){
            rollercoaster.addRider(customer);
        }
        assertEquals(24, rollercoaster.getNumberOfRiders());
    }

    @Test
    public void testRemoveRider(){
        Customer customer = new Customer("Danny", 27, 1.60, 200.00);
        rollercoaster.addRider(customer);
        rollercoaster.removeRider(customer);
        assertEquals(0, rollercoaster.getNumberOfRiders());
    }

    @Test
    public void testClearRollercoaster(){
        Customer customer = new Customer("Danny", 27, 1.60, 200.00);
        for(int i = 0; i < 30; i++){
            rollercoaster.addRider(customer);
        }
        rollercoaster.emptyRollercoaster();
        assertEquals(0, rollercoaster.getNumberOfRiders());
    }

    @Test
    public void testCustomerCannotBeAddedToRollercoasterUnlessTheyHaveFunds(){
        Customer customer = new Customer("Danny", 27, 1.60, 5.00);
        rollercoaster.addRider(customer);
    }

    @Test
    public void testCustomerIsEligble(){
        Customer customer = new Customer("Danny", 27, 1.60, 5.00);
        assertEquals(true, rollercoaster.eligble(customer));
    }

    @Test
    public void testCustomerIsNotEligble(){
        Customer customer = new Customer("Danny", 27, 1.45, 5.00);
        assertEquals(false, rollercoaster.eligble(customer));
    }

    @Test
    public void testTillAmount(){
        assertEquals(100.00, rollercoaster.tillAmount(), 0.01);
    }

    @Test
    public void testTillIncreasesWhenCustomerPays(){
        Customer customer = new Customer("Danny", 27, 1.45, 10.00);
        rollercoaster.charge(customer);
        assertEquals(105.00, rollercoaster.tillAmount(), 0.01);
        assertEquals(5.00, customer.getCash(), 0.01);
    }

    @Test
    public void testCanStart(){
        assertEquals("Starting Tornado", rollercoaster.start(rollercoaster.getName()));
    }


}
