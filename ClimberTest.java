

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClimberTest.
 *
 * @author  Dimitris Livanas
 * @version (a version number or a date)
 */
public class ClimberTest
{
    private Mountain mountain1;
    private Mountain mountain2;
    private Mountain mountain3;
    private Mountain mountain4;
    private Climber climber1;
    private Climber climber2;
    private Club club1;

    /**
     * Default constructor for test class ClimberTest
     */
    public ClimberTest()
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
        mountain1 = new Mountain(100, "A");
        mountain2 = new Mountain(200, "B");
        mountain3 = new Mountain(300, "C");
        mountain4 = new Mountain(400, "D");
        climber1 = new Climber("dimi", 27, "male");
        climber2 = new Climber("ana", 25, "female");
        club1 = new Club();
        climber1.addMountain(mountain1);
        climber1.addMountain(mountain2);
        climber2.addMountain(mountain3);
        climber2.addMountain(mountain4);
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
    public void climber()
    {
    }
}

