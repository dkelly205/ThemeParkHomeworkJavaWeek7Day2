import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void setUp() throws Exception {
        themePark = new ThemePark("M&Ds", 100, 5.00, 100.00);
    }

    @Test
    public void testName(){
        assertEquals("M&Ds", themePark.getName());
    }

    @Test
    public void testCapacity() {
        assertEquals(100, themePark.getCapacity());
    }

    @Test
    public void testEntryFee(){
        assertEquals(5.00, themePark.getEntryFee(), 0.01);
    }

    @Test
    public void testCustomersStartsEmpty() {
        assertEquals(0, themePark.getNumberOfCustomers());
    }

    @Test
    public void testGetCash() {
        assertEquals(100.00, themePark.getCash(), 0.01);
    }

        @Test
    public void testCustomerCanPayEntry() {
        Customer customer = new Customer("Danny", 26, 1.67, 50.00);
        themePark.charge(customer);
        assertEquals(105.00, themePark.getCash(), 0.01);
    }

    //    @Test
//    public void testAddCustoemr(){
//        assertEquals(1, );
//    }
}
