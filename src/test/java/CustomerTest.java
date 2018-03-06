import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Danny", 27, 1.60, 200.00);
    }

    @Test
    public void testName(){
        assertEquals("Danny", customer.getName());
    }

    @Test
    public void testAge(){
        assertEquals(27, customer.getAge());
    }

    @Test
    public void testHeight(){
        assertEquals(1.60, customer.getHeight(), 0.01);
    }

    @Test
    public void testCash(){
        assertEquals(200.00, customer.getCash(), 0.01);
    }

    @Test
    public void testPay(){
        customer.pay(10.00);
        assertEquals(190.00, customer.getCash(), 0.01);
    }



}
