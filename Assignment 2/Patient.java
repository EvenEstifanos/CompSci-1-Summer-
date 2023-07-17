/**
 * 
 * @author evene
 * Patient class
 * Responsible for handling the patient's personal information: name, full address, phoneNo & emergency contact's name and phone number
 * @param fullName - holds patient's full name
 * @param address - holds patient's street address
 * @param city - holds patient's city name
 * @param state - holds patient's state name
 * @param zip - holds patient's zip code number
 * @param phoneNo - holds patient's phone number
 * @param erName - holds patient's emergency contact name
 * @param erPhoneNo - holds patient's emergency contact phone number
 */
public class Patient 
{
     public String fullName;
     public String address;
     public String city;
     public String state;
     public String zip;
     public String phoneNo;
     public String erName;
     public String erPhoneNo;
     
     /*
      * Constructor - responsible for creating a patient object using the variables above.
      * It initializes the patient's attributes with the provided values.
      */
     public Patient (String name,String addy, String citeh, String stateName, String zipCode, String phone, String eName, String ePhone )
     {
    	 fullName= name;
    	 address = addy;
    	 city = citeh;
    	 state = stateName;
    	 zip  = zipCode;
    	 phoneNo= phone;
    	 erName = eName;
    	 erPhoneNo = ePhone;
     }
     
     /*
      * below are Getter and Setter methods for the patient's attributes.
      */
     
     // Getter for the patient's name.
     public String getName()
     {
    	return fullName;
     }
     
     // Setter for the patient's name.
     public void setName (String name)
     {
    	 fullName = name;
     }
   
     // Getter for the patient's address.
     public String getAddress()
     {
    	 return address;
     }
     
     // Setter for the patient's address.
     public void setAddress (String addy)
     {
    	 address = addy;
     }
     
     // Getter for the patient's city.
     public String getCity()
     {
    	 return city;
     }
     
     // Setter for the patient's city.
     public void setCity (String citeh)
     {
    	 city = citeh;
     }
     
     // Getter for the patient's state.
     public String getState()
     {
    	 return state;
     }
     
     // Setter for the patient's state.
     public void setState(String stateName)
     {
    	 state = stateName;
     }
     
     // Getter for the patient's zip code.
     public String getZip()
     {
    	 return zip;
     }
     
     // Setter for the patient's zip code.
     public void setZip(String zipCode)
     {
    	 zip = zipCode;
     }
     
     // Getter for the patient's emergency contact information.
     public String getERContact ()
     {
    	 return erName + " " + erPhoneNo;
     }
     
     // Setter for the patient's emergency contact information.
     public void setERContact (String name, String phone)
     {
    	  erName = name;
    	  erPhoneNo = phone;
     }
     
}
