import java.util.ArrayList;
/**
 * "Club" class will hold information about every climber we have created.
 * It includes a method that will return the climber with the highest Average mountain height, 
 * a method that will return the highest mountain recorded by any climber in the club and a last 
 * method that will return a list of all mountains recorded, that are higher that a given height.
 * 
 * @author Dimitris Livanas 
 * @version 131117 (13/11/2017)
 */
public class Club
{
    private ArrayList<Climber> climbers;
    private ArrayList<Mountain> mountainsClimbed;

    /**
     * Constructor method for the Club. Contains the two ArrayLists we will need, the 
     * "mountainsClimbed" where the mountains will be stored and the "climbers" where we will store 
     * our Climber objects.
     */
    public Club()
    {
        climbers = new ArrayList<Climber>();
        mountainsClimbed = new ArrayList<Mountain>();
    }

    /**
     * Method where we create our new "climbers" araylist where we will add the Climbers.
     */
    public void addClimber(Climber newCName)
    {
        climbers.add(newCName);
    }

    /**
     * Method where we the Climber who has recorded the highest average mountain height.
     */
    public Climber highestAvgClimber()
    {
        int index = 0;
        double avgHeight = 0.0;
        for(int i = 0; i < climbers.size(); i++)
        {
            if (climbers.get(i).avgHeight() > avgHeight)
            {
                avgHeight = climbers.get(i).avgHeight();
                index = i;
            }
        }
        return climbers.get(index);
    }

    /**
     * Method were we go through our Climbers in the climbers list and find the highest mountain 
     * recorded by any Climber.
     */
    public Mountain getHeighestMount()
    {
        int index = 0;
        int height = 0;

        for(int i = 0; i < climbers.size(); i++)
        {
            if (climbers.get(i).getHeighest().getHeight() > height)
            {
                height = climbers.get(i).getHeighest().getHeight();
                index = i;
            }
        }
        return climbers.get(index).getHeighest();
    }

    /**
     * Method where we ask for a height and return a list of mountains higher than the given height.
     */
    public ArrayList<Mountain> mountainsHigherThanGivenHeight (int GivenHeight)
    {
        int index = 0;
        ArrayList <Mountain> returnClubMountains = new ArrayList<Mountain>();

        for(int i = 0; i < climbers.size(); i++)
        {
            returnClubMountains.addAll(climbers.get(i).mountainsHigherThanGivenHeight(GivenHeight));
        }
        return returnClubMountains;
    }

}
