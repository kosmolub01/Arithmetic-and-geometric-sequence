package controller;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import model.Model;
import view.View;
import exception.InvalidInputException;


/**
 * Controller class of the application for calculating arithmetic or geometric
 * sequence elements.
 *
 * @author Szczepan Dwornicki
 * @version 1.1
 */ 
public class Controller {
    /**
     * Main method of Controller is entry point for application.
     * 
     * @param args program call parameters. There are 4 parameters required:
     * - sequence type(a or g character), 
     * - first element of a sequence (any real number (except 0, for a geometric sequence)), 
     * - sequence modifier (difference or ratio, any real number), 
     * - number of elements (any positive integer)
     */
    public static void main(String args[]) {
        
        Model model = new Model();
        View view = new View();
        
        String[] parameters = new String[4];
        
        // number of parameters passed to the program
        int numberOfParameters = args.length;
        
        if(numberOfParameters == 4)    // proper number of parameters
        {
            parameters = args;                         
        }
        else    // ask user for input arameters
        {            
            parameters = view.askUserForInputParameters();     
        }
        
        try 
            {
                //  update model data
                model.setSequenceType(parameters[0]);
                model.setFirstElement(parseFloat(parameters[1]));
                model.setMod(parseFloat(parameters[2]));
                model.setNumberOfElements(parseInt(parameters[3]));
            } 
            catch(InvalidInputException ex) 
            {
                view.showMessage(ex.getMessage());
                
                return;
            }
            
            // calculate the sequence and show the result
            view.showResult(model.calculateSequence());
    }
}
