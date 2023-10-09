package view;
import java.util.Scanner;

/**
 * View class of the application for calculating arithmetic or geometric
 * sequence elements. Handels general output operation.
 *
 * @author Szczepan Dwornicki
 * @version 1.1
 */
public class View {
    
    /**
     * If there are no parameters provided to the program, user should be asked to
     * enter them.
     * @return array of user apameters
     */
    public String [] askUserForInputParameters()
    {
        String[] parameters = new String[4];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Provide sequence type (a - for arithmetic sequence, g - for geometric sequence):");
        parameters[0] = scanner.next();
        
        System.out.println("Provide first element of a sequence:");
        parameters[1] = scanner.next();
        
        System.out.println("Provide sequence modifier (difference or ratio):");
        parameters[2] = scanner.next();
        
        System.out.println("Provide number of elements:");
        parameters[3] = scanner.next();
               
        return parameters;
    }
    
    /**
     * Prints elements of a sequence
     * @param result array of elements of a sequence
     */
    public void showResult(float [] result)
    {
        System.out.println("Elements of the sequence:");
        
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
    
    /**
     * Prints a message
     * @param message message to be printed out
     */
    public void showMessage(String message)
    {
        System.out.println(message);
    }
}
