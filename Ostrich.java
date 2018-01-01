
/**
 * Write a description of class Ostrich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ostrich extends Bird
{
    // instance variables - replace the example below with your own
    String name;
    boolean tall;
    boolean longLegs;
    /**
     * Constructor for objects of class Ostrich
     */
    public Ostrich(String name)
    { super();
      this.name=name;
      colour="grey";
      flies=false;
      tall=true;
      longLegs=true;
      
    }
     @Override
    public String toString(){
        String strng ="";
        strng+= "Ostrich; ";
        strng+= "name: ";
        strng+= name;
        strng+= "; ";
        strng+= "colour: ";
        strng+= colour;
        strng+= "\n";
        strng+="the ostrich has feathers:";
        strng+=hasFeathers;
        strng+="\n";
        strng+="the ostrich has wings:";
        strng+=hasWings;
        strng+="\n";
        strng+="the ostrich can fly:";
        strng+=flies;
        strng+="\n";
        strng+="the ostrich has skin:";
        strng+=hasSkin;
        strng+="\n";
        strng+="the ostrich can breathe:";
        strng+=breathes;
        strng+="\n";
        strng+=" the ostrich is tall:";
        strng+=tall;
        strng+="\n";
        strng+="the ostrich has long legs";
        strng+=longLegs;
        strng+="\n";
        
        // TOD0 Your job 
        
        
        
        // TOD0 Your job is to include the fields and attributes inherited 
        //from Bird and Animal in the String representation
        return strng;
    }
    
    
     
     public void sing(){
        System.out.println("ehe ehe ehe");
        
        }
     
      
    @Override
    public boolean equals(java.lang.Object object){
        //TODO : You have to define an equals method for this class
        //default equals
          if(object==null){
            return false;
        }
        
        if(object instanceof Ostrich){
          Ostrich other =(Ostrich) object;
    
        
              if(this.colour==other.getColour()&&this.name.equals(other.name)){
              return true;
               }
    }
         return false;
    }
    
     
   @Override
   public void eat(Food food){
    
    
    }
}
