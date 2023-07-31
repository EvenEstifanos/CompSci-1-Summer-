
/**
  * Class: CMSC203 CRN 40438
  * Program: Assignment #3
  *  Instructor: Dr. Grinberg
  *  Summary of Description: This class represents GFA test cases for a CryptoManager object.
  *  Due Date: 07/31/2023 
  *  Integrity Pledge: I pledge that I have completed the programming assignment independently.
  *  I have not copied the code from a student or any source.
  *  Even Estifanos
*/

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Test;

 public class CryptoManagerTestStudent 
{

	    
	   @Test
		public void testStringInBounds()
	   {
		    // Test if the method correctly identifies strings within allowable bounds
		    assertTrue(CryptoManager.isStringInBounds("SOCCERANDUFC"));
			assertTrue(CryptoManager.isStringInBounds("\"SOCCERANDUFC IS FUN\""));
			
	        // Test if the method correctly identifies strings outside allowable bounds
			assertFalse(CryptoManager.isStringInBounds("soccer"));
			assertFalse(CryptoManager.isStringInBounds("{UFC"));
			assertFalse(CryptoManager.isStringInBounds("\"TEST MUST  FAIL BECAUSE } IS OUTSIDE THE RANGE\""));
		}
	    
	   @Test
	    public void testCaesarEncryption() 
	   {
	        
	        // Test Caesar encryption with invalid input outside allowable bounds
		    assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("lolz", 8));
		    
		    // Test Caesar encryption with valid input and key
		    assertEquals("MJQQT", CryptoManager.caesarEncryption("HELLO", 5));
		    assertEquals(" SOZ[OR WR", CryptoManager.caesarEncryption("REALMADRID", 14));
		    
	    }

	    @Test
	    public void testBellasoEncryption() 
	    {
	        // Test Bellaso encryption with valid input and key
	    	assertEquals("RF\"MY", CryptoManager.bellasoEncryption("HELLO", "JAVA"));
	        assertEquals("MSO^(XYU[]", CryptoManager.bellasoEncryption("ENCRYPTION", "HELLO"));
	        assertEquals("Y[]\\^ _!#\"$&%')(*,+-/.0213", CryptoManager.bellasoEncryption("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "XYZ"));
	        assertEquals("WZ^0%$LU$0V!R)'0Z^[2#%!_V2(&Y!#&!U4[D,20X^J", CryptoManager.bellasoEncryption("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", "CRYPTO"));
	    }

	    @Test
	    public void testCaesarDecryption() 
	    {
	    	// Test Caesar decryption with valid input and key
	    	assertEquals("HELLO", CryptoManager.caesarDecryption("MJQQT", 5));
	        assertEquals("JA<AS685G8AMMI4G", CryptoManager.caesarDecryption("WNIN CEBTENZZVAT", 13));
	        assertEquals("E6C7<;12=@", CryptoManager.caesarDecryption("XIVJONDEPS", 19));
	        assertEquals(":.+G7;/)1G(85=4G,5>G0;369G5<8+G:.+G2A@?G*5-", CryptoManager.caesarDecryption("SGD PTHBJ AQNVM ENW ITLOR NUQD SGD KZYX CNF", 25));
	    }

	    @Test
	    public void testBellasoDecryption() 
	    {
	    	// Test Bellaso decryption with valid input and key
	    	assertEquals("NI+RN", CryptoManager.bellasoDecryption("XJASX", "JAVA"));
	        assertEquals("NPM=I??>LB", CryptoManager.bellasoDecryption("VUYIXGDJXQ", "HELLO"));
	        assertEquals(",,,///222555888;;;>>>AA'**", CryptoManager.bellasoDecryption("DEFGHIJKLMNOPQRSTUVWXYZABC", "XYZ"));
	        assertEquals("DC9PB5ED3B3QPC9?8BGN>BLHH6G?43BN7BE9", CryptoManager.bellasoDecryption("GUR VDHVLRG SUROLQJ WR WKH OHBE PRYH", "CRYPTO"));
	    }
	}
