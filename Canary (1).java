
/**
 * Write a description of class Canary here.
 *
 * @author (Conor Hayes)
 * @version (October 5th 2017)
 */
public class Canary extends Bird
{
    // instance variables - replace the example below with your own
    String name; // the name of this Canary
    
    /**
     * Constructor for objects of class Canary
     */
    public Canary(String name)
    {
        super(); // call the constructor of the superclass Bird
        this.name = name;
        colour = "yellow"; // this overrides the value inherited from Bird
        
    }
    
    /**
     * Sing method overrides the sing method
     * inherited from superclass Bird
     */
    @Override // good programming practice to use @Override to denote overridden methods
    public void  sing(){
        System.out.println("tweet tweet tweet");
    }
    
    /**
     * toString method returns a String representation of the bird
     * What superclass has Canary inherited this method from? 
     */
    @Override
    public String toString(){
        String strng ="";
        strng+= "Canary; ";
        strng+= "name: ";
        strng+= name;
        strng+= "; ";
        strng+= "colour: ";
        strng+= colour;
        strng+= "\n";
        strng+="the Canary has feathers:";
        strng+=hasFeathers;
        strng+="\n";
        strng+="the canary has wings:";
        strng+=hasWings;
        strng+="\n";
        strng+="the canary can fly:";
        strng+=flies;
        strng+="\n";
        strng+="the canary has skin:";
        strng+=hasSkin;
        strng+="\n";
        strng+="the canary can breathe:";
        strng+=breathes;
        strng+="\n";
        
        
        // TOD0 Your job is to include the fields and attributes inherited 
        //from Bird and Animal in the String representation
        return strng;
    }

    
    /**
     * equals method defines how equality is defined between 
     * the instances of the Canary class
     * param Object
     * return true or false depending on whether the input object is 
     * equal to this Canary object
     */
    
    @Override
    public boolean equals(java.lang.Object object){
        if(object==null){
            return false;
        }
        
        if(object instanceof Canary){
        Canary other =(Canary) object;
        if(this.colour==other.getColour()&&this.name.equals(other.name));
        return true;
        }
        else return false;
    }
    
   @Override
   public void eat(Food food){
    
    
    }
    
}
