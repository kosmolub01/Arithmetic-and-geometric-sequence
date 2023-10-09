package model;

import exception.InvalidInputException;

/**
 * Model class of the application for calculating arithmetic or geometric
 * sequence elements.
 *
 * @author Szczepan Dwornicki
 * @version 1.1
 */
public class Model {
    
    /**
     * sequence type - "a" for arithmetic, "g" for geometric
     */
    private String sequenceType;
    
    /**
     * first element of a sequence
     */
    private float firstElement;
    
    /**
     * sequence modifier (difference or ratio)
     */
    private float mod;
    
    /**
     * number of elements to calculate
     */
    private int numberOfElements;
    
    /**
     * calculates sequence elements
     * @return array of calculated elements
     */
    public float[] calculateSequence() 
    {
        
        float[] result = new float [numberOfElements];
        result[0] = firstElement;
        
        if(sequenceType.equals("a"))
        {
           for(int i = 1; i < numberOfElements; i++)
            {         
                result[i] = result[i-1] + mod;
            } 
        }
        else
        {
          for(int i = 1; i < numberOfElements; i++)
            {         
                result[i] = result[i-1] * mod;
            }  
        }
        
        return result;
    }
    
    /**
     * sequenceType setter
     * @param sequenceType "a" or "g" is valid
     * @throws InvalidInputException if sequenceType is to be set to invalid sequence type
     */
    public void setSequenceType(String sequenceType) throws InvalidInputException
    {
        if(sequenceType.matches("a|g"))
        {
            this.sequenceType = sequenceType; 
        }
        else
        {
            throw new InvalidInputException("Provided sequence type is not valid");
        }
       
    }
    
    /**
     * firstElement setter
     * @param firstElement first element of a sequence
     * @throws InvalidInputException if firstElement is to be set to zero for geometric sequence
     */
    public void setFirstElement(float firstElement) throws InvalidInputException
    {
        if(sequenceType.equals("g"))
        {
            if(Float.compare(firstElement, 0) == 0)
            {
                throw new InvalidInputException("First element equal 0 for geometric sequence is invalid");
            }
        }
       this.firstElement = firstElement; 
    }
    
    /**
     * mod setter
     * @param mod every next element is equal the modified previous element
     */
    public void setMod(float mod)
    {
       this.mod = mod; 
    }
    
    /**
     * setNumberOfElements setter
     * @param numberOfElements number of elements of a sequence
     * @throws InvalidInputException if numberOfElements is to be set to less than 1
     */ 
     public void setNumberOfElements(int numberOfElements) throws InvalidInputException
    {
        if(numberOfElements <= 0)
        {
            throw new InvalidInputException("Provided number of elements is not valid");
        }
        else
        {
            this.numberOfElements = numberOfElements; 
        }
    }
    
}
