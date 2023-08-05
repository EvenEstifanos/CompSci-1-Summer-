import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester 
{
    public GradeBook gradebook1;
    public GradeBook gradebook2;

    // This method is executed before each test method.
    @BeforeEach
    void setUp() throws Exception 
    {
        // Create two GradeBook instances with different capacities.
        gradebook1 = new GradeBook(3);
        gradebook2 = new GradeBook(2);

        // Add scores to gradebook1.
        gradebook1.addScore(78.5);
        gradebook1.addScore(98.3);
        gradebook1.addScore(81.3);

        // Add scores to gradebook2.
        gradebook2.addScore(69.5);
        gradebook2.addScore(89.8);  
    }

    // This method is executed after each test method.
    @AfterEach
    void tearDown() throws Exception 
    {
        // Set both gradebook instances to null to release resources and clean up.
        gradebook1 = null;
        gradebook2 = null;  
    }

    // Test method for the addScore() function and getScoresSize() function.
    @Test
    void testAddScore() 
    {
        // Test if the toString() representation of gradebook1 matches the expected string.
        assertTrue(gradebook1.toString().equals("78.5 98.3 81.3 ") );
        
        // Test if the toString() representation of gradebook2 matches the expected string.
        assertTrue(gradebook2.toString().equals("69.5 89.8 "));
        
        // Test if the size of gradebook1 matches the expected value (3).
        assertEquals(3, gradebook1.getScoresSize());
        
        // Test if the size of gradebook2 matches the expected value (2).
        assertEquals(2, gradebook2.getScoresSize());
    }

    // Test method for the sum() function.
    @Test
    void testSum() 
    {
        // Test if the sum of scores in gradebook1 matches the expected sum (258.1).
        assertEquals(258.1, gradebook1.sum());
        
        // Test if the sum of scores in gradebook2 matches the expected sum (159.3).
        assertEquals(159.3, gradebook2.sum());
    }

    // Test method for the minimum() function.
    @Test
    void testMinimum() 
    {
        // Test if the minimum score in gradebook1 matches the expected minimum (78.5).
        assertEquals(78.5, gradebook1.minimum());
        
        // Test if the minimum score in gradebook2 matches the expected minimum (69.5).
        assertEquals(69.5, gradebook2.minimum());  
    }

    // Test method for the finalScore() function.
    @Test
    void testFinalScore() 
    {
        // Test if the final score in gradebook1 matches the expected final score (179.60000000000002).
        assertEquals(179.60000000000002, gradebook1.finalScore());
        
        // Test if the final score in gradebook2 matches the expected final score (89.80000000000001).
        assertEquals(89.80000000000001, gradebook2.finalScore());
    }

    // Test method for the getScoresSize() function.
    @Test
    void testGetScoresSize() 
    {
        // Test if the size of gradebook1 matches the expected value (3).
        assertEquals(3, gradebook1.getScoresSize());
        
        // Test if the size of gradebook2 matches the expected value (2).
        assertEquals(2, gradebook2.getScoresSize());
    }

    // Test method for the toString() function.
    @Test
    void testToString() 
    {
        // Test if the toString() representation of gradebook1 matches the expected string.
        assertEquals("78.5 98.3 81.3 ", gradebook1.toString() );
        
        // Test if the toString() representation of gradebook2 matches the expected string.
        assertEquals("69.5 89.8 ", gradebook2.toString());
    }
}
