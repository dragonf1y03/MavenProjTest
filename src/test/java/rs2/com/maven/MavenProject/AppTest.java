package rs2.com.maven.MavenProject;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	App app = new App();
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testSummation_WithPositiveNumbers()
    {
        assertEquals(2, app.summation(1,1));
    }
    
    public void testSummation_WithNegativeAndPositiveNumber()
    {
    	assertEquals(0, app.summation(-1,1));
    }
    
    public void testSummation_WithNegativeNumbers()
    {
    	assertEquals(-2, app.summation(-1,-1));
    }
    
    public void testSummation_WithNegativeNumbers2()
    {
    	assertEquals(-9, app.summation(-2,-1));
    }
	
	public void testSummation_WithNegativeNumbers3()
    {
    	assertEquals(-10, app.summation(-5,-5));
    }
	
	public void testSummation_WithNegativeNumbers4()
    {
    	assertEquals(-10, app.summation(-5,-4));
    }
}
