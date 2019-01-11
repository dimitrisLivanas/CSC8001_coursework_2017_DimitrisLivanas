

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MountainTest.
 *
 * @author  Dimitris Livanas
 * @version (a version number or a date)
 */
public class MountainTest
{
    /**
     * Default constructor for test class MountainTest
     */
    public MountainTest()
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

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void mountain()
    {
        Mountain mountain1 = new Mountain(100, "A");
        Mountain mountain2 = new Mountain(200, "B");
        Mountain mountain3 = new Mountain(300, "C");
        Mountain mountain4 = new Mountain(400, "D");
    }
}

