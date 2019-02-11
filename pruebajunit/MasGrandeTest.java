

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MasGrandeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MasGrandeTest
{
    /**
     * Default constructor for test class MasGrandeTest
     */
    public MasGrandeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    @Test
    public void testValores(){
        assertEquals(5,MasGrande.max(new int [] {1,2,3,4,5}));
        assertEquals(5,MasGrande.max(new int []{5,4,3,2,1}));
        assertEquals(5,MasGrande.max(new int []{2,5,4,5,4}));
    }  
    @Test
    public void testValor(){
        assertEquals(5,MasGrande.max(new int []{5}));
    }
    @Test
    public void testSinvalores(){
        assertEquals(5,MasGrande.max(new int []{}));  
        assertEquals(5,MasGrande.max(null));  
    }    
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    
    
}

