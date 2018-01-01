
/**
 * Write a description of class Shark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shark extends Fish
{
    // instance variables - replace the example below with your own
  
    String name;
    boolean Bite;
    boolean danger;
    /**
     * Constructor for objects of class Shark
     */
    public Shark(String name )
    {
        // initialise instance variables
        super();
        this.name=name;
        colour="grey";
        danger=true;
        Bite=true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    
      public String toString(){
        String strng ="";
        strng+= "Shark; ";
        strng+= "name: ";
        strng+= name;
        strng+= "; ";
        strng+= "colour: ";
        strng+= colour;
        strng+= "\n";
        strng+="the Shark has skin:";
        strng+=hasSkin;
        strng+="\n";
        strng+="the Shark can breathe:";
        strng+=breathes;
        strng+="\n";
        strng+="the Shark has fins:";
        strng+=Fins;
        strng+="\n";
        strng+="the Shark has gils:";
        strng+=Gils;
        strng+="\n";
        strng+=" the Shark is dangerous:";
        strng+=danger;
        strng+="\n";
        strng+="The shark can bite people:";
        strng+=Bite;
        strng+="\n";
    return strng;
}
   public boolean equals(java.lang.Object object){
        if(object==null){
            return false;
        }
        
        if(object instanceof Shark){
        Shark other =(Shark) object;
        if(this.colour==other.getColour()&&this.name.equals(other.name));
        return true;
        }
        else return false;
    }
    
    
       
   @Override
   public void eat(Food food){
    
    
    }
}
