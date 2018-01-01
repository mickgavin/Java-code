
/**
 * Write a description of class Fish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Fish extends Animal
{
    boolean Fins;
    boolean Gils;
    boolean Swim;
   
    
    /**
     * Constructor for objects of class Fish
     */
    public Fish()
    {
        // initialise instance variables
        super();
        colour="black";
        Fins=true;
        Gils=true;
        Swim=true;
    }
    
    
    public void swim(int distance){
    System.out.printf( "I swam %d metres",distance);
    
    }
    
    
    public boolean Fins(){
        return Fins;
    }
    
    public boolean Gils(){
    
    return Gils;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
       
   
}
