import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CustomerTestStudent
{

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Alice", 25);
    }

    @After
    public void tearDown() throws Exception {
        customer = null;
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Alice", customer.getName());
        assertEquals(25, customer.getAge());
    }

    @Test
    public void testSetters() {
        customer.setName("Charlie");
        assertEquals("Charlie", customer.getName());

        customer.setAge(28);
        assertEquals(28, customer.getAge());
    }

    @Test
    public void testToString() {
        assertEquals("Alice, 25", customer.toString());
    }

    @Test
    public void testCopyConstructor() {
        Customer copy = new Customer(customer);

        assertEquals(customer.getName(), copy.getName());
        assertEquals(customer.getAge(), copy.getAge());
    }
}
