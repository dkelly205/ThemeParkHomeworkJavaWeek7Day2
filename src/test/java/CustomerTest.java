import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        Customer customer = new Customer("Danny", 27, 1.60, 200.00);
    }

    @Test
    public void testName(){
        assertEquals("Danny", customer.getName());
    }
}
