import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class represents student test cases for a Management company object.
 * 
 * @author Even Estifanos
 * @version 7/31/2023
 * 
 */

public class ManagementCompanyTestStudent  {

    @Test
    public void testAddProperty() 
    {
        ManagementCompany managementCompany = new ManagementCompany("ABC Management", "12345", 10.0);
        Property property = new Property("Sample Property", "Sample City", 1000.0, "John Doe");

        int result = managementCompany.addProperty(property);

        assertEquals(0, result);
        assertEquals(1, managementCompany.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCount() {
        ManagementCompany managementCompany = new ManagementCompany("XYZ Management", "54321", 8.0);
        Property property1 = new Property("Property 1", "City 1", 1200.0, "Owner 1");

        managementCompany.addProperty(property1);

        assertEquals(1, managementCompany.getPropertiesCount());
    }

    @Test
    public void testToString() {
        ManagementCompany managementCompany = new ManagementCompany("ABC Management", "12345", 10.0);
        Property property = new Property("Sample Property", "Sample City", 1000.0, "John Doe");

        managementCompany.addProperty(property);

        String expectedString = "List of the properties for ABC Management, taxID: 12345\n"
                + "_____________________________________________\n"
                + "Property Name: Sample Property\n"
                + "Located in: Sample City\n"
                + "Belongs to: John Doe\n"
                + "Rent Amount: 1000.0\n"
                + "\n"
                + "_____________________________________________\n"
                + "\n"
                + "total management Fee: 10.0";

        assertEquals(expectedString, managementCompany.toString());
    }
}
