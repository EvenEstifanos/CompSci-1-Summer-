import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * This class represents student test cases for a Property object.
 * 
 * @author Even Estifanos 
 * @version 7/31/2023 
 */
class PropertyTestStudent {
    @Test
    void testGetPropertyName() {
        Property propertyOne = new Property("Property XYZ", "Seattle", 2000.00, "John Doe");
        assertEquals("Property XYZ", propertyOne.getPropertyName());
    }

    @Test
    void testGetRentAmount() {
        Property propertyOne = new Property("Property XYZ", "Seattle", 2000.00, "John Doe");
        assertEquals(2000.00, propertyOne.getRentAmount(), 0.001);
    }

    @Test
    void testGetOwner() {
        Property propertyOne = new Property("Property XYZ", "Seattle", 2000.00, "John Doe");
        assertEquals("John Doe", propertyOne.getOwner());
    }

    @Test
    void testGetCity() {
        Property propertyOne = new Property("Property XYZ", "Seattle", 2000.00, "John Doe");
        assertEquals("Seattle", propertyOne.getCity());
    }

    @Test
    void testToString() {
        Property propertyOne = new Property("Property XYZ", "Seattle", 2000.00, "John Doe");
        assertEquals("Property XYZ,Seattle,John Doe,2000.0", propertyOne.toString());
    }
}
