
/**
 * Write a description of class Salmon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salmon extends Fish
{
    // instance variables - replace the example below with your own
    String name;
    boolean edible;
    boolean swimUpriver;
    /**
     * Constructor for objects of class Salmon
     */
    public Salmon(String name)
    {
        // initialise instance variables
       super();
       edible=true;
       this.name=name;
       colour="pink";
       swimUpriver=true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public String toString(){
        String strng ="";
        strng+= "Salmon; ";
        strng+= "name: ";
        strng+= name;
        strng+= "; ";
        strng+= "colour: ";
        strng+= colour;
        strng+= "\n";
        strng+="the Salmon has skin:";
        strng+=hasSkin;
        strng+="\n";
        strng+="the Salmon can breathe:";
        strng+=breathes;
        strng+="\n";
        strng+="the salmon has fins:";
        strng+=Fins;
        strng+="\n";
        strng+="the salmon has gils:";
        strng+=Gils;
        strng+="\n";
        strng+=" the salmon is edible:";
        strng+=edible;
        strng+="\n";
        strng+="the salmon swims upstream to lay its eggs:";
        strng+=swimUpriver;
        strng+="\n";
    return strng;
}
    
    
   public boolean equals(java.lang.Object object){
        if(object==null){
            return false;
        }
        
        if(object instanceof Salmon){
        Salmon other =(Salmon) object;
        if(this.colour==other.getColour()&&this.name.equals(other.name));
        return true;
        }
        else return false;
    }
    
       
   @Override
   public void eat(Food food){
    
    
    }
}
