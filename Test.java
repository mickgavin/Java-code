
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    int j=0;
    int i=0;
    /**
     * Constructor for objects of class Test
     */
    public static void main(String[] args)
    {
        // initialise instance variables
     Test test =new Test();
     ///test.test1();
     test.test2();
    }

    
     public void test1(){
         Animal[] animals = new Animal[4];
         
         animals[0]= new Ostrich("gerry");
         animals[1]= new Canary("sam");
         animals[2]=new Shark("john");
         animals[3]=new Salmon("Seamus");
         for(i=0;i<4;i++){
         System.out.println(animals[i]);
         
         animals[i].move(15);
         System.out.println("\n");
        }
        
        }
    
     
     public void test2(){
         Animal[] animals = new Animal[8];
         
         animals[0]= new Ostrich ("gerry");
         animals[1]= new Ostrich("sam");
         animals[2]=new Canary("john");
         animals[3]=new Canary("john");
         animals[4]= new Shark ("michael");
         animals[5]= new Shark("ethan");
         animals[6]=new Salmon("conor");
         animals[7]=new Salmon("conor");
         
         for(i=0;i<7;i++){
            j=i+1;
            animals[i].equals(animals[i+1]);
           System.out.println("animal"+" "+i+" and "+"animal"+" "+j+" are equals: "+animals[i].equals(animals[i+1]));
            
            }
       //animals.equal(Ostrich);
        // animals[0].equals(can);///this is the proper method 
        }
    
}
