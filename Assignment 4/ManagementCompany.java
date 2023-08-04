/**
 * Represents Management Company Object.
 */
public class ManagementCompany {
    // Constants
    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_WIDTH = 10;
    public static final int MGMT_DEPTH = 10;

    // Instance variables
    private String name;
    private String taxID;
    private double mgmFeePer;
    private Plot plot;
    private Property[] properties;
    private int propertyCount;

    /**
     * Creates a ManagementCompany object using empty strings, creates a default Plot with maximum width and depth,
     * and initializes the properties array.
     */
    public ManagementCompany()
    {
        name = "";
        taxID = "";
        mgmFeePer = 0.0;
        plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        properties = new Property[MAX_PROPERTY];
        propertyCount = 0;
    }
    
    /**
     * Creates a ManagementCompany object using the given values, creates a default Plot with maximum width and depth,
     * and initializes the properties array.
     *
     * @param name     management company name
     * @param taxID    tax ID
     * @param mgmFee   management fee
     */
    public ManagementCompany(String name, String taxID, double mgmFee)
    {
        this();
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFee;
    }

    /**
     * Creates a ManagementCompany object using the given values, creates a Plot using the given values,
     * and initializes the properties array.
     *
     * @param name     management company name
     * @param taxID    tax ID
     * @param mgmFee   management fee
     * @param x        x coordinate of the plot
     * @param y        y coordinate of the plot
     * @param width    width coordinate of the plot
     * @param depth    depth coordinate of the plot
     */
    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
    {
        this();
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFee;
        plot = new Plot(x, y, width, depth);
    }

    /**
     * Creates a new ManagementCompany copy of the given ManagementCompany.
     *
     * @param otherCompany the ManagementCompany object to make a copy of
     */
    public ManagementCompany(ManagementCompany otherCompany) 
    {
        this.name = otherCompany.name;
        this.taxID = otherCompany.taxID;
        this.mgmFeePer = otherCompany.mgmFeePer;
        this.plot = new Plot(otherCompany.plot); // Assumes the Plot class has a copy constructor.
        this.properties = new Property[MAX_PROPERTY];

        for (int i = 0; i < otherCompany.propertyCount; i++) 
        {
            this.properties[i] = new Property(otherCompany.properties[i]); // Assumes the Property class has a copy constructor.
        }

        this.propertyCount = otherCompany.propertyCount;
    }
    /**
     * Adds a new property to the properties array, this method should call an appropriate existing overloaded method.
     *
     * @param name     property name
     * @param city     city where the property is located
     * @param rent     rent amount
     * @param owner    the owner's name
     * @return -1 if the array is full, -2 if the Property object is null, -3 if management company does not encompass
     * the property plot, -4 if property plot overlaps ANY of properties in array, otherwise return the index of the array
     * where the property was added.
     */
    public int addProperty(String name, String city, double rent, String owner) {
        Property property = new Property(name, city, rent, owner);

        if (property == null) 
        {
            return -2;
        }

        // Check if properties array is full
        if (propertyCount >= MAX_PROPERTY) 
        {
            return -1;
        }

        // Check if property plot is encompassed by the management company's plot
        if (!plot.encompasses(property.getPlot())) {
            return -3;
        }

        // Check if property plot overlaps with any other property in the array
        for (int i = 0; i < propertyCount; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot())) {
                return -4;
            }
        }

        properties[propertyCount] = property;
        propertyCount++;
        return propertyCount - 1;
    }

    /**
     * Adds a new property to the properties array, this method should call an appropriate existing overloaded method.
     *
     * @param name     property name
     * @param city     city where the property is located
     * @param rent     rent amount
     * @param owner    the owner's name
     * @param x        The x coordinate of the plot
     * @param y        The y coordinate of the plot
     * @param width    The width coordinate of the plot
     * @param depth    The depth coordinate of the plot
     * @return -1 if the array is full, -2 if the Property object is null, -3 if management company does not encompass
     * the property plot, -4 if property plot overlaps ANY of properties in array, otherwise return the index of the array
     * where the property was added.
     */
    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
    {
        Property property = new Property(name, city, rent, owner, x, y, width, depth);

        if (property == null) 
        {
            return -2;
        }

        if (propertyCount >= MAX_PROPERTY) {
            return -1; // Array is full
        }

        // Check if the property plot is encompassed by the management company's plot
        if (!plot.encompasses(property.getPlot())) {
            return -3; // Plot is not encompassed
        }

        // Check if property plot overlaps with any other property in the array
        for (int i = 0; i < propertyCount; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot())) {
                return -4; // Plot overlaps with an existing property
            }
        }

        properties[propertyCount] = property;
        propertyCount++;
        return propertyCount - 1; // Index of the added property in the array
    }
    
    /**
     * 
     * Creates a property object by copying from another property and adds it to the properties array.
     *
     * @param property the Property object to be added
     * @return -1 if the array is full, -2 if the Property object is null, -3 if management company does not encompass
     * the property plot, -4 if property plot overlaps ANY of properties in array, otherwise return the index of the array
     * where the property was added.
     */
    public int addProperty(Property property) {
        if (property == null) {
            return -2;
        }

        // Check if properties array is full
        if (propertyCount >= MAX_PROPERTY) {
            return -1;
        }

        // Check if property plot is encompassed by management company's plot
        if (!plot.encompasses(property.getPlot())) {
            return -3;
        }

        // Check if property plot overlaps with any other property in the array
        for (int i = 0; i < propertyCount; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot())) {
                return -4;
            }
        }

        properties[propertyCount] = property;
        propertyCount++;
        return propertyCount - 1;
    }

    /**
     * Removes (nullifies) the LAST property in the properties array.
     */
    public void removeLastProperty() 
    {
        if (propertyCount > 0) 
        {
            properties[propertyCount - 1] = null;
            propertyCount--;
        }
    }

    /**
     * Checks if the properties array has reached the maximum capacity.
     *
     * @return true if properties array is full, false otherwise.
     */
    public boolean isPropertiesFull() 
    {
        return propertyCount >= MAX_PROPERTY;
    }

    /**
     * Gets the number of existing properties in the array.
     *
     * @return the number of existing properties in the array.
     */
    public int getPropertiesCount() 
    {
        return propertyCount;
    }

    /**
     * Returns the total rent of the properties in the properties array.
     *
     * @return total rent of all properties.
     */
    public double getTotalRent()
    {
        double totalRent = 0.0;
        for (int i = 0; i < propertyCount; i++)
        {
            totalRent += properties[i].getRentAmount();
        }
        return totalRent;
    }

    /**
     * Gets the property in the array with the maximum amount of rent.
     *
     * @return the property in the array with the highest amount of rent.
     */
    public Property getHighestRentPropperty()
    {
        if (propertyCount == 0) {
            return null;
        }

        Property highestRentProperty = properties[0];
        for (int i = 1; i < propertyCount; i++) {
            if (properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
                highestRentProperty = properties[i];
            }
        }
        return highestRentProperty;
    }

    /**
     * Checks if the management company has a valid (between 0-100) fee.
     *
     * @return true if the management fee is valid (between 0-100), false otherwise.
     */
    public boolean isMangementFeeValid() {
        return mgmFeePer >= 0 && mgmFeePer <= 100;
    }

    /**
     * Gets the name of the management company.
     *
     * @return the name of the management company.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the tax ID of the management company.
     *
     * @return the tax ID of the management company.
     */
    public String getTaxID()
    {
        return taxID;
    }

    /**
     * Gets the management fee per.
     *
     * @return the management fee per.
     */
    public double getMgmFeePer() 
    {
        return mgmFeePer;
    }

    /**
     * Gets the plot of the management company.
     *
     * @return the plot of the management company.
     */
    public Plot getPlot() {
        return plot;
    }

    /**
     * Gets the array of properties managed by the company.
     *
     * @return the array of properties.
     */
    public Property[] getProperties()
    
    {
        return properties;
    }

    /**
     * Represents the information of all the properties in the properties array.
     *
     * @return information of all the properties within this management company by accessing the properties array.
     * This value should include each management company's name, taxID as well as each property's name, city, owner, and rent amount.
     */
    @Override
    public String toString() {
        String result = "List of the properties for " + name + ", taxID: " + taxID + "\n";
        result += "_____________________________________________\n";

        for (int i = 0; i < propertyCount; i++) 
        {
            Property property = properties[i];
            result += "Property Name: " + property.getPropertyName() + "\n";
            result += "Located in: " + property.getCity() + "\n";
            result += "Belongs to: " + property.getOwner() + "\n";
            result += "Rent Amount: " + property.getRentAmount() + "\n";
            result += "\n_____________________________________________\n";
        }

        result += "\n";
        result += "total management Fee: " + mgmFeePer;

        return result;
    }
    
}

