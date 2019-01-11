import java.util.ArrayList;
/**
 * "Climber" class will store and retrive information about the Climber Object(Name,
 * Age and Gender).
 * It then adds a "Mountain" object to the climber.
 * It finds and returns the heighest mountain climbed by the climber
 * finds the average height of the mountains climbed by the climber, and last
 * returns a list of mountains higher than a height given by the user.
 * 
 * 
 * @author Dimitris Livanas 
 * @version 131117 (13/11/2017)
 */

public class Climber
{
    /**
     * instance variables for the climber
     */
    private String cName;
    private int cAge;
    private String cGender;
    private ArrayList<Mountain> mountainsClimbed;

    /**
     * Constructor method for the Climber. Contains the attributes for the climber(Name,
     *  Age, Gender) and the Arraylist "mountainsClimbed" where the Mountain objects are
     *  stored.
     *  @param String newCName - name for tha climber
     *  @param int newCAge - age for the climber
     *  @param String newCGender - gender for the climber
     */
    public Climber(String newCName, int newCAge, String newCGender)
    {
        cName = newCName;
        cAge = newCAge;
        cGender = newCGender;
        mountainsClimbed = new ArrayList<>();
    }
    
    /**
     * Method that returns the name of the climber.
     * @return String
     */
    public String getName()
    {
       return cName; 
    }

    /**
     * Method where we add a mountain object to our "mountainsClimbed" list.
     */
    public void addMountain(Mountain mountainName)
    {
        mountainsClimbed.add(mountainName);
    }


    /**
     * Method where we find and return the Heighest Mountain climbed by the climber.
     */
    public Mountain getHeighest()
    {
        int index = 0;
        int height = 0;
        for(int i = 0; i < mountainsClimbed.size(); i++)
        {
            if (mountainsClimbed.get(i).getHeight() > height)
            {
                height = mountainsClimbed.get(i).getHeight();
                index = i;
            }
        }
        return mountainsClimbed.get(index);
    }

    /**
     * Method where we find and return the average of the mountains height climbed by 
     * the climber.
     */
    public double avgHeight()
    {
        double avgHeight = 0.0;
        for (int i = 0; i < mountainsClimbed.size(); i++)
        {
            avgHeight += mountainsClimbed.get(i).getHeight();
        }
        return avgHeight/mountainsClimbed.size();
    }

    /**
     * Method where we ask the user for a height(GivenHeight) and return a list of 
     * mountains that are higher than that height.
     */
    public ArrayList<Mountain> mountainsHigherThanGivenHeight (int GivenHeight)
    {
        int index = 0;
        ArrayList <Mountain> returnMountains = new ArrayList<Mountain>();

        for(int i = 0; i < mountainsClimbed.size(); i++)
        {
            if (mountainsClimbed.get(i).getHeight() > GivenHeight)
            {
                returnMountains.add(mountainsClimbed.get(i)); 
            }

        }
        return returnMountains ;
    }
}
