import java.util.Scanner;
/**
 * ClubStats class will present a menu where the user can add a new climber to he club given their attributes(name, age, height). User will then be able to
 * add details of a mountain(name, height) to add to a given climber. The menu than will provide the user with statistics about the information stored in the club 
 * such as the cliber with the heighest average, the heighest mountain recorded by any club member and all mountains recorded with a height higher than a given 
 * height.
 * After executing one of the features the user will be returned to the menu to choose another option until the user chooses to end the programm via exit.
 * 
 * @author Dimitris Livanas 
 * @version 131117 (13/11/2017)
 */
public class ClubStats  
{
    private Scanner in;
    private Club statClub;
    /**
     * The Constractor method for the ClubStats class. Here we create a new Scanner (named clbst).
     */
    public ClubStats() 
    {
        Scanner clbst = new Scanner(System.in);
        ClubStats_menu();
        statClub = new Club();
    }

    /**
     * The main method of the program.
     */
    public static void main (String[]args) 
    {
        new ClubStats();
    }

    /**
     * Method that creates the main menu for the user. From here the user can select one of five option to continue.
     */
    public void ClubStats_menu() 
    {
        System.out.println("1) Add a new climber\n2) Add a new mountain\n3) Climber with highest avg\n4) Highest mountain\n5) All mountains higher than given level");
        System.out.print("Selection: ");
        Scanner menu = new Scanner(System.in);

        switch (menu.nextInt()) 
        {
            case 1:
            addClimber();
            break;

            case 2:
            addNewMountain();
            
            break;

            case 3:
            statAvgClimber();
            break;

            case 4:
            statHighestMountain();
            break;

            case 5:
            System.out.println("You picked option 5");
            default:
            System.err.println("Unrecognized option");
            break;

        }
    }

    /**
     * Method that asks the user to choose between two options, continue or quit the programm. It also prints an "Unrecognized option" message if the user
     * does not choose a proper option.
     */
    public void question()
    {
        System.out.println("Would you like to proceed or quit?");
        System.out.println("To proceed enter 9.");
        System.out.println("If you wish to quit enter 0.");
        Scanner que = new Scanner(System.in);

        switch (que.nextInt()) 
        {
            case 0:
            System.out.println("Thank you and goodbye.");
            break;

            case 9:
            System.out.println("Please proceed.");
            new ClubStats();
            break;
            default:
            System.err.println("Unrecognized option");
            break;
        }
    }

    /**
     * Method that adds a Climber object in the Club
     */
    public void addClimber()
    {
        Scanner cli = new Scanner(System.in);
        System.out.println("Please add the name of the climber");
        String newCName = cli.next();

        System.out.println("Please add " + newCName + "'s age");
        int newCAge = cli.nextInt();

        System.out.println("Please add " + newCName + "'s gender");
        String newCGender = cli.next();

        question();

        Climber statClimber = new Climber(newCName, newCAge, newCGender);
        
       
        statClub.addClimber(statClimber);
        
        
    }

    /**
     * Method that adds a new Mountain to the club (climbed by a specific climber)
     */
    public void addNewMountain()
    {
        Scanner mount = new Scanner(System.in);
        System.out.println("Who climbed that mountain?");
        String newCName = mount.next();
        String input = mount.nextLine();

        System.out.println("Please add the name of the mountain");
        String mountainName = mount.next();

        System.out.println("Please add " + mountainName + "'s height");
        int mountainHeight = mount.nextInt();

        question();
        /*
        if(Climber.getName().equals(newCName))
        {
            climber = input.get(newCName);
        }
        With this if loop i wanted to compare the name given by the user in the start of the method with the names of the climbers
        that already exist in the club.If the two names where equals the mountain whould be added in the goven climber. */
        Mountain statMountain = new Mountain(mountainHeight, mountainName);

       
    }

    public void statAvgClimber()
    {
        Club statAvg;
        
        statClub.highestAvgClimber();
        
        question();
    }
    
    public void statHighestMountain()
    {
        Club statHighest;
        
        statClub.getHeighestMount();
        
        question();
    }
}
