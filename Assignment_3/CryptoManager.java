 /**
  * Class: CMSC203 CRN 40438
  * Program: Assignment #3
  *  Instructor: Dr. Grinberg
  *  Summary of Description: The provided code encrypt and decrypt text 
                          using the Caesar Cipher and Bellaso Cipher techniques. The Caesar encryption shifts characters by a specified key,
                          while Bellaso encryption uses a repeating key string to offset characters. Decryption methods reverse the encryption process. 
                          The class ensures the input strings are within the allowable ASCII bounds before performing the operations.
 Due Date: 07/31/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Even Estifanos
*/


public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) 
	{
		
		// Initialize a boolean variable to store the result, assume the string is initially within bounds
		boolean result = true;
		
		// Loop through each character in the 'plainText' string
		for(int x=0; x<plainText.length(); x++)
		{
	        // Check if the ASCII code of the current character is outside the allowable bounds
			if(plainText.charAt(x)< LOWER_RANGE || plainText.charAt(x) > UPPER_RANGE )
			{
				// If the character is outside the bounds, set the result to false, and end the loop
				result = false;
				break;
			}
		}
		// Return the final result, 'true' if all characters are within bounds, 'false' otherwise
		return result;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) 
	{
		
		String encryptedText = ""; // To hold the value of the encrypted text
		
		// Check if the 'plainText' is within the allowable bounds.
		if(isStringInBounds(plainText)== true )
		{
			// IF within allowable bounds, use for loop to traverse through each character to encrypt 
			for(int i=0; i<plainText.length(); i++)
			{
				// Encrypt each character by adding the 'key' value to its ASCII code.
				int encrypted = (int) plainText.charAt(i) + key;
				
				// Wrap around the range if necessary to stay within the allowable character range.
				while (encrypted > UPPER_RANGE)
				{
					encrypted -= RANGE;
				}
			
				// Finally, turn the encrypted int to a string to be returned
				encryptedText += (char) encrypted;
			}
		}
		
		// If the 'plainText' is not within bounds, provide an error message.
		else
		{
			encryptedText = "The selected string is not in bounds, Try again.";
		}
		
		return encryptedText;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) 
	{
		//throw new RuntimeException("method not implemented");
		
		String encryptedText=""; // To hold the value of the encrypted text
		
		// Check if the 'plainText' is within allowable bounds.
		if(isStringInBounds(plainText) == true)
		{
			
			// IF within allowable bounds, use for loop to traverse through each character to encrypt 
			for(int i=0; i<plainText.length();i++)
			{
				// Encrypt each character by adding the corresponding 'bellasoStr' character value to its ASCII code.
				int encrypted = (int)plainText.charAt(i) + (int) bellasoStr.charAt(i % bellasoStr.length() );
				
				// Wrap around the range if necessary to stay within the allowable character range.
				while (encrypted > UPPER_RANGE)
				{
					encrypted -= RANGE;
				}
				
				// Finally, turn the encrypted int to a string to be returned
				encryptedText += (char) encrypted;
			}
		}
		
		// If the 'plainText' is not within bounds, provide an error message.
		else
		{
			encryptedText = "The selected string is not in bounds, Try again.";
		}
		
		return encryptedText;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) 
	{
		//throw new RuntimeException("method not implemented");
		
		    String decryptedText = ""; // To hold the value of the decrypted text
		
		    // use for loop to traverse through each character to encrypt 
			for(int i=0; i< encryptedText.length(); i++)
			{
				// Decrypt each character by subtracting the 'key' value from its ASCII code.
				int decrypted = (int) encryptedText.charAt(i) - key;
				
				// Wrap around the range if necessary to stay within the allowable character range.
				while (decrypted < LOWER_RANGE)
				{
					decrypted += RANGE;
				}
			
				// Finally, turn the encrypted int to a string to be returned
				decryptedText += (char) decrypted;
			}
		
		return decryptedText;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) 
	{
		//throw new RuntimeException("method not implemented");
		
		String decryptedText = "";	// To hold the value of the decrypted text
		
		// use for loop to traverse through each character to encrypt
		for(int i=0; i<encryptedText.length();i++)
		{
			// Decrypt each character by subtracting the 'key' value from its ASCII code.
			int decrypted = (int)encryptedText.charAt(i) - (int) bellasoStr.charAt(i % bellasoStr.length() );
			
			// Wrap around the range if necessary to stay within the allowable character range.
			while (decrypted < LOWER_RANGE)
			{
				decrypted += RANGE;
			}
		
			// Finally, turn the encrypted int to a string to be returned
			decryptedText += (char) decrypted;
		}
		
		return decryptedText;
		
	}
}
